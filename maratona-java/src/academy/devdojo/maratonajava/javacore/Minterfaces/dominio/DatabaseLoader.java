package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements  DataLoader, DateRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removend do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco e dados");
    }
}
