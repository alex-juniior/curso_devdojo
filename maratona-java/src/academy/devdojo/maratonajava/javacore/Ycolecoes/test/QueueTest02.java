package academy.devdojo.maratonajava.javacore.Ycolecoes.test;


import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;


import java.util.PriorityQueue;
import java.util.Queue;


public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Slime data ken", 19.9, 0));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Barseg", 11.2, 2));
        mangas.add(new Manga(2L, "Attack on titan", 2.99, 0));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }
}
