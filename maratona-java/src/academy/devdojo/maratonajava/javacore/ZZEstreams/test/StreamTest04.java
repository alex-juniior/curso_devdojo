package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicsDesigners = List.of("Wildenei Suane", "Caratina Santos", "Sandy Melo");
        List<String> developers = List.of("William","David","Harisson");
        List<String> students = List.of("Edigio", "Gustavo Lima","Alex, Guilherme");
        devdojo.add(graphicsDesigners);
        devdojo.add(developers);
        devdojo.add(students);
        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);

            }
            System.out.println("-----------");
            devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);

        }

    }
}
