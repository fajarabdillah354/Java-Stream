package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckingOperation {


    @Test
    void testAnyMatch() {
        boolean angka = List.of(1,2,3,4,5,6,17,8,9,10).stream()
                .anyMatch(number -> number > 13);//jika ada 1 saja yang memenuhi maka akan True
        System.out.println(angka);

    }


    @Test
    void testAllMatch() {
        boolean angka = List.of(1,2,3,4,5,6,7).stream()
                .allMatch(number -> number > 0);// jika ada 1 saja yang tidak memenuhi maka akan False

        System.out.println(angka);
    }

    @Test
    void testNoneMatch() {
        boolean angka = List.of(1,2,3,4,5,6,7,8,9).stream()
                .noneMatch(integer -> integer>7);
        System.out.println(angka);
    }
}
