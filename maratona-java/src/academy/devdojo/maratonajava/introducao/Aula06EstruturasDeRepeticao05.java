package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int i = (int) valorTotal; i >= 1; i--) {
            double valorParcela = valorTotal / i;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + i + " R$ " + valorParcela);
        }
    }
}
