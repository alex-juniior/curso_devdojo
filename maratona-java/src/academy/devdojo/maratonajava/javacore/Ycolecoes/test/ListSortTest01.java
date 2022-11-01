package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Slime data ken");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Barseg");
        mangas.add("Attack on titan");

        Collections.sort(mangas);

        for (String manga : mangas){
            System.out.println(manga);
        }
        System.out.println("-----------------");

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        Collections.sort(dinheiros);

        for(Double dinheiro : dinheiros){
            System.out.println(dinheiro);
        }

    }
}
