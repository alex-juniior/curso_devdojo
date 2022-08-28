package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 10;
        boolean isAutorizadoComparBebida = idade >= 18;
        if(isAutorizadoComparBebida){
            System.out.println("Autorizado a comprar bebida alcólica");
        }
        if(!isAutorizadoComparBebida){
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
    }
}
