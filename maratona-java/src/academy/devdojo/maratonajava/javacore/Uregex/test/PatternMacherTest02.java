package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMacherTest02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = Tudo que n]ao for incluso no \w
        String regex = "\\w";
        //String texto ="abaaba";
        String texto2 ="@#0_r4 dd45fff";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("rege "+regex);
        System.out.println("Pocicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" " + matcher.group()+"\n");
        }


    }
}
