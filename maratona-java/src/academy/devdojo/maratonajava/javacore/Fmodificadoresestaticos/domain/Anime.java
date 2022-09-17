package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro da inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    public Anime(){
        episodios = new int[100];
        for(int i =0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
        for(int episodios: Anime.episodios){
            System.out.print(episodios + " ");
        }
        System.out.println("-----------------------");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
