package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Luffy");
        estudante.setSexo('M');
        estudante.setIdade(20);

        System.out.println(estudante.getIdade());
    }
}
