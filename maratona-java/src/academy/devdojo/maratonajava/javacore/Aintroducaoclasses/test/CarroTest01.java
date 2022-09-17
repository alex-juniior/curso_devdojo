package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat Uno", "Sedan", 2013);
        Carro carro02 = new Carro("Fusca", "Hatch", 1998);

        System.out.println(carro + "\n" + carro02);
    }
}
