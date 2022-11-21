package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamTest16 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_0000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumLongParallelStreamIterate(num);


    }
    private static void sumFor(long num){
        System.out.println("Sum for");
        long result = 0;
        long init =System.currentTimeMillis();
        for(long i= 1; i<= num; i++){
            result += i;
        }
        long end =System.currentTimeMillis();
        System.out.println(result+ " "+(end - init)+" ms");
    }

    private static void sumStreamIterate(long num){
        System.out.println("Sum stream iterate");
        long init =System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end =System.currentTimeMillis();
        System.out.println(result+ " "+(end - init)+" ms");
    }
    // [1,2,3,4,5,6,7,8,9,0]
    // 1 - 1-5
    // 2 - 6-0
    private static void sumParallelStreamIterate(long num){
        System.out.println("Sum sumParallelStreamIterate");
        long init =System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end =System.currentTimeMillis();
        System.out.println(result+ " "+(end - init)+" ms");
    }

    private static void sumLongStreamIterate(long num){
        System.out.println("Sum LongStreamIterate");
        long init =System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end =System.currentTimeMillis();
        System.out.println(result+ " "+(end - init)+" ms");
    }
    private static void sumLongParallelStreamIterate(long num){
        System.out.println("Sum sumLongParallelStreamIterate");
        long init =System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end =System.currentTimeMillis();
        System.out.println(result+ " "+(end - init)+" ms");
    }



}
