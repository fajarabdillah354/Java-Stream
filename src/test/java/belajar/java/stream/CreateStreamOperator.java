package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class CreateStreamOperator {

    @Test
    void testStreamOperation() {

        List<String> names = List.of("fajar","abdillah","ahmad");

        Stream<String> stringStream = names.stream();
        Stream<String> stringUpper = stringStream.map(name -> name.toUpperCase());//disini kita akan merubah menjadi uppercase(memanipulasi tanpa merusak data aslinya)

        stringUpper.forEach(System.out::println);//ini adalah hasil bentukan data baru upperCase
        stringStream.forEach(System.out::println);//ini adalah data asliya dimana tidak uppercase

    }
}
