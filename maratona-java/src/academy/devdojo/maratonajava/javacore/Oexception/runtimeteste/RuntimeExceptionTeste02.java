package academy.devdojo.maratonajava.javacore.Oexception.runtimeteste;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        System.out.println(divisao(1,0));

    }
    private static int divisao (int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
    }
}
