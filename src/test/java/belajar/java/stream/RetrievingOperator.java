package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.nio.file.LinkOption;
import java.util.List;
import java.util.Optional;

public class RetrievingOperator {

    @Test
    void testRetrievingOperatorLimit() {

        List.of("kucing","anjing","kelinci","singa","ayam").stream()
                .limit(2)
                .forEach(System.out::println);

    }

    @Test
    void testRetrievingOperatorSkip() {
        List.of("kucing","anjing","kelinci","singa","ayam").stream()
                .skip(2)//akan menghiraukan N data pertama
                .forEach(data -> System.out.println("data : "+data));

    }


    @Test
    void testRetrievingOperatorTakeWhile() {
        List.of("ayam","kucing","anjing","kelinci","singa").stream()
                .takeWhile(data -> data.length() <=  4  )
                .forEach(System.out::println);
        //Todo: akan mengecek dari data pertama saja, jika data pertama tidak terpenuhi maka hasil tidak akan tampil
    }


    @Test
    void testRetrievingOperatorDropWhile(){
        List.of("ayam","kucing","anjing","kelinci","singa").stream()
                .dropWhile(data -> data.length() <=4 )
                .forEach(System.out::println);
        //TODO:AKAN MENGAMBIL YANG FALSE SAJA
    }


    //RetrievingSingleElement
    @Test
    void testFindAny(){
        Optional<String> optionalS = List.of("ayam","kucing","anjing","kelinci","singa").stream().findAny();

        optionalS.ifPresent(s -> {
            System.out.println(s);
        });

        //TODO:INI AKAN MENGAMBIL RANDOM HANYA SAJA UNTUK YANG PERTAMA SELALU AYAM


    }

    @Test
    void testFindFirst(){
        Optional<String> optional = List.of("ayam","kucing","anjing","kelinci","singa").stream().findFirst();

        optional.ifPresent(data -> {
            System.out.println(data);
        });
    }



}
