package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek", 43), new Anime("Hellsing", 20), new Anime("One Piace", 900), new Anime("Mushoku Tensei", 40)));
        animeList.sort(animeComparators::compareByEpisodesNoStatic);
        animeList.sort((a1,a2) -> animeComparators.compareByEpisodesNoStatic(a1,a2));
        System.out.println(animeList);

    }
}
