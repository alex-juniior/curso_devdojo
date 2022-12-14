package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("0223-990");
        Pessoa pessoa = new Pessoa("Asta");
        pessoa.setCpf("12345-666");
        pessoa.setEndereco(endereco);
        pessoa.imprime();


        Funcionario funcionario = new Funcionario("Oden");
        funcionario.setCpf("11112-999");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("------------------------");

        funcionario.imprime();

    }
}
