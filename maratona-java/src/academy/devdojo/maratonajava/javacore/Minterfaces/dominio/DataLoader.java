package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    //Todos métodos são public abstract por padrão
    // public abstract void load();
    void load();
    default void  checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

}
