package academy.devdojo.maratonajava.javacore.Oexception.runtimeteste;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
        abreConexao();
        abreCOnexao2();
    }

    public static String abreConexao() {
        try {
            System.out.println("Abrindo arquivod");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
    private static void abreCOnexao2(){
        try {
            System.out.println("Abrindo arquivod");
            System.out.println("Escrevendo dados no arquivo");
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
