package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Slime data ken", 19.9, 0));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5,5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Barseg", 11.2,2));
        mangas.add(new Manga(2L, "Attack on titan", 2.99,0));
        mangas.add(new Manga(2L, "Attack on titan", 2.99,0));

        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
