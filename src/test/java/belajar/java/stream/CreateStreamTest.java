package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testStream() {

        Stream<String> emptyStream = Stream.empty();

        Stream<String> onerecord = Stream.of("fajar");// jika disini kita masukan null maka error karna disarankan menggunakan ofNullable

        String data = null;
        Stream<String> datanull = Stream.ofNullable(data);

    }

    //TODO: UNTUK MENJALANKAN STREAM KITA MENGGUNAKAN METHOD salah satunya forEach(), Stream hanya bisa dipake sekali saat program sudah berjalan tidak bisa kita mengulang ke atas lagi,ini karna prinsip dari stream seperti air yang mengalir.

    @Test
    void testStreamArray() {
        //ini adalah contoh membuat array dengan Stream.of(value)
        Stream<String> stringArray = Stream.of("fajar","fahmi","dini","inne","azka");
        //untuk menjalankan stream kita menggunaka method forEach()
        stringArray.forEach(data -> {
            if(data.equals("fajar")){
                System.out.println("this first child");
            }else{
                System.out.println(data);
            }
        });// kita harus menggunakan lambda expresion



        //ini contoh membuat Stream data integer dengan Stream.of(value)
        Stream<Integer> integerArray = Stream.of(1,2,3,4,5,6,7);
        integerArray.forEach(getvalue -> System.out.println(getvalue));//ini adalah contoh lambda expreesion yang simple(1 parameter)



        //ini jika kita sudah mempunyai data array lalu ingin dibuat Stream
        String[] array = new String[]{
                "fajar","dini","fahmi"
        };

        Stream<String> arraytostream = Arrays.stream(array);//kita menggunakan class Arrays yang ada dijava util

        System.out.println(arraytostream);


    }


    @Test
    void testStreamCollection() {
        //TODO: KITA JUGA BISA MEMBUAT STREAM DARI COLLECTION, karna collection punya method stream maka akan secara otomatis mengkonversi

        Collection<String> stringCollection = List.of("kucing","ayam","bebek");
        Stream<String> konverCollection = stringCollection.stream();
        konverCollection.forEach(getdata -> System.out.println(getdata));
//        konverCollection.forEach(getdata -> System.out.println(getdata));//ini tidak boleh karna konverCollection sudah dipake sekali

        Stream<String> konverCollection2 = stringCollection.stream();
        konverCollection2.forEach(data -> System.out.println(data));//kita harus membuat Stream baru agar bisa berjalan

    }


    @Test
    void testStreamInfiniteLoop() {

        //TODO: ini adalah contoh penggunaan dari infinite stream
        Stream<String> dataString = Stream.generate(() -> "fajar abdillah ahmad");//ini contoh infinite loop pada 1 record saja yaitu fajar abdillah ahmad


//        dataString.forEach(System.out::println);

        Stream<Integer> dataInteger = Stream.iterate(1, value -> value+1);//ini contoh penggunaan infinite loop dengan record  yang berbeda dimana value akan terus bertambah

        dataInteger.forEach(System.out::println);

    }
}
