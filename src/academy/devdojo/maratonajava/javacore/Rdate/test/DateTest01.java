package academy.devdojo.maratonajava.javacore.Rdate.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        //Date date = new Date(1_000_000_00); // long 100000
        //System.out.println(date);
        Date date = new Date(1757631996001L);
        //Adicionando uma hora
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
