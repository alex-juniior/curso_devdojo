package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("Mestre Kami");
        professor.setIdade(60);
        professor.setSexo('M');

        System.out.println("Nome " + professor.getNome() +" idade: " + professor.getIdade()+ " sexo: " + professor.getSexo());
    }
}
