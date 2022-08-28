package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 14;
        String categoria;

        if(idade < 15){
           categoria =  "Categoria infantil";
        }else if (idade <18) {
            categoria = "Categoria juvenil";
        }else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
