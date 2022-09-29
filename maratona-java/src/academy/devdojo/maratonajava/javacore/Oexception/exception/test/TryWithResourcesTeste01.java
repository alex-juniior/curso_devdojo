package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTeste01 {
    public static void main(String[] args) {
        lerArquivo();

    }

    public static void lerArquivo(){
        try(Leitor1 leitor= new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
