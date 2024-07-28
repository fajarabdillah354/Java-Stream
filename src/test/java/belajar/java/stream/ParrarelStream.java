package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class ParrarelStream {


    @Test
    void testSequentialStream() {

        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9,10);

        integerList.stream()
                .forEach(number ->{// ini adalah sebuah proses yang tidak menggunakan Thread dimana proses akan berjalan secara sequential
                    System.out.println(Thread.currentThread().getName()+" : "+number);
                });
    }


    @Test
    void testParrarelStream() {
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .parallel()//ini contoh yang menggunakan parrarel dimana proses dapat berjalan secara bersamaan, ini lebih cepat dan menghemat waktu
                .forEach(number -> {
                    System.out.println(Thread.currentThread().getName() + " : " + number);
                });


    }
}
