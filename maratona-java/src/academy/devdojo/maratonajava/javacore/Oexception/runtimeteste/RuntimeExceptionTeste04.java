package academy.devdojo.maratonajava.javacore.Oexception.runtimeteste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | Dentro do IllegalArgumentException | Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
