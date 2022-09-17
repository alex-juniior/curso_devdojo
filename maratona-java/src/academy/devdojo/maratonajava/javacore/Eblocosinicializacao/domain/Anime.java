package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    public Anime(){
        episodios = new int[100];
        for(int i =0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
        for(int episodios: this.episodios){
            System.out.println(episodios + " ");
        }
        System.out.println();
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
