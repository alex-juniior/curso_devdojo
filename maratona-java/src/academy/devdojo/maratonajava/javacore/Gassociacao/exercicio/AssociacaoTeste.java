package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das palmeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("One Piace", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();


    }
}
