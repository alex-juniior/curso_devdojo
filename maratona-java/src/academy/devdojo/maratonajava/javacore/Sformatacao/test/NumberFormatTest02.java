package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale locaBR = new Locale("pt", "BR");
        Locale locaJP = Locale.JAPAN;
        Locale locaIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(locaJP);
        nfa[2] = NumberFormat.getCurrencyInstance(locaBR);
        nfa[3] = NumberFormat.getCurrencyInstance(locaIT);
        double valor = 1000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }


    }
}
