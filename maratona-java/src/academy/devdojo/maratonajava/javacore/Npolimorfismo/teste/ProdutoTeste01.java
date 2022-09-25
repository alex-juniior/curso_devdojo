package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculardoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 9000);
        Tomate tomate = new Tomate("Cereja", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 40);

        CalculardoraImposto.calcularImposto(computador);
        System.out.println("------------------------------");
        CalculardoraImposto.calcularImposto(tomate);
        System.out.println("------------------------------");
        CalculardoraImposto.calcularImposto(televisao);


    }
}
