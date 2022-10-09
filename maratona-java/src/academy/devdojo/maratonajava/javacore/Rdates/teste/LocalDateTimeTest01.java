package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.parse("2022-08-06");
        LocalTime localTime = LocalTime.parse("09:45:00");
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);
        LocalDateTime ldt1 = localDate.atTime(localTime);
        LocalDateTime ldt2  =  localTime.atDate(localDate);
        System.out.println(ldt1);
        System.out.println(ldt2);


    }
}
