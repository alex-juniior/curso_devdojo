package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPaternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Alex")
                .lastName("Aluno DevDojo")
                .userName("viradonoJiraya")
                .email("alex.devdojo.acamy")
                .build();

        System.out.println(build);
    }
}
