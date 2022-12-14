package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMacherTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = Tudo que n]ao for incluso no \w
        // []
        // ? Zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {m,m} de n até m
        // () agrupamento
        // | o(v|c)o ovo | oco
        // $ fim da linha
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto ="12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("rege "+regex);
        System.out.println("Pocicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" " + matcher.group()+"\n");
        }


    }
}
