package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaNumeros();

        double resultaoDIvisao = calculadora.divideDoisNumeros(10,0);
        System.out.println(resultaoDIvisao);
    }
}
