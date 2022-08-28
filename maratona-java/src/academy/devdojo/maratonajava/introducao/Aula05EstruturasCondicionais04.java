package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salário!");
        double salario = sc.nextDouble();
        double taxaBaixa = 9.70/100;
        double taxaMedia = 37.35/100;
        double taxaAlta = 49.5/100;


        if(salario <=34.712){
            System.out.println("Valor da taxa é de: " + (salario*taxaBaixa));
        }else if (salario <=68.507) {
            System.out.println("Valor da taxa é de: " + (salario*taxaMedia));
        }else{
            System.out.println("Valor da taxa é de: " + (salario*taxaAlta));
        }
    }
}
