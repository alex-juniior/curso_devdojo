package academy.devdojo.maratonajava.introducao;

import java.util.Date;

public class Aula03TiposPrimitivosExercicio {
        public static void main(String[] args){
            String nome = "Gandalf";
            String endereco = "Terra Média";
            double salario = 2000.15;
            String dataRecebimentoSalario = "20/12/2021";
            String relatorio = "Eu " + nome +", morando no endereço " + endereco
            +", confirmo que recebi o salário de " + salario + ", na data "+ dataRecebimentoSalario;

            System.out.println(relatorio);
        }
}
