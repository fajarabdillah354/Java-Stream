package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperation {


    @Test
    void testFilteringFilter() {
        //Method filter() digunakan untuk memfilter informasi yang dibutuhkan
        List.of("mangga","melon","apel","jeruk").stream()
                .filter(data -> data.length() >4).forEach(System.out::println);//memfilter yang akan tampil hanya yang panjangnya lebih dari 4
    }

    @Test
    void testFilteringDistinct() {
        //Method distinct digunakan untuk menghapus data yang duplikat
        List.of(173,201,300,421,506,698,700,300,173,99,513,201).stream()
                .distinct()
                .filter(dataModulo -> dataModulo % 2 == 0)
                .forEach(getData -> System.out.println("data modulo : "+ getData));

    }
}
