package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformOperation {

    //TODO:Merubah suatu bentuk data ke data yang lain
    @Test
    void testTransformMap() {
        //Contoh Transform dengan Map
        List.of("fajar","abdillah","ahmad").stream()
                .map(value -> value.toUpperCase())//transform ke String
                .map(getLength -> getLength.length())//transform ke Integer
                .forEach(data -> System.out.println(data));


    }


    @Test
    void testTransformFlatMap() {
        //Contoh Transform dengan flatmap(), hasil dari transform ini harus bertype Stream juga

        List.of("ayam","kucing","kambing").stream()
                .map(name -> name.toUpperCase())
                .flatMap(value -> Stream.of(value, "hewan :" +value))//hasil dari sebuah data menjadi Stream lain(ini wajib menjadi Stream lagi)
                .forEach(getAll -> System.out.println(getAll));

        // Walaupun kita return Stringnya banyak oleh java akan tetep di merge jadi satu
    }
}
