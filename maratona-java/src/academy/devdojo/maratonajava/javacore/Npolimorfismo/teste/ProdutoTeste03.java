package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculardoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println("------------------------------");

        Tomate  tomate = new Tomate("Italiano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculardoraImposto.calcularImposto(tomate);
        System.out.println("----------------------");
        CalculardoraImposto.calcularImposto(produto);


    }
}
