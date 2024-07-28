package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class LazyEvaluationStream {


    @Test
    void testIntemediateStream() {

        //TODO: Ini adalah contoh penggunaan dari intermediate dimana data tidak mengalir,ini terjadi karena kita menggunakan method yang membutuhkan balikan(return value) Stream lagi
        List<String> list = List.of("fajar","abdillah","ahmad");

        list.stream()
                .map(name ->{
                    System.out.println("Change "+ name + "toUpper");
                    return name.toUpperCase();
                });//saat kita jalankan ini tidak terjadi apa2 karna ini bersifat lazy

    }


    @Test
    void testTerminalStream() {
        //TODO:Ini adalah contoh yang tidak bersifat lazy yaitu dengan penggunaan forEach() agar Stream dapat berjalan.forEach() sendiri adalah method yang membuat Stream tidak lazy, maka dari itu wajib menggunakanya jika ingin menjalankan Stream


        List<String> iniList = List.of("fajar","abdillah","ahmad");

        iniList.stream()
                .map(name -> {
                    System.out.println("Change "+name+" toUpper");
                    return name.toUpperCase();
                })
                .map(addMr -> {
                    System.out.println("Change "+addMr+" to add Mr.");
                    return "Mr. "+addMr;
                })
                .forEach(getAll -> System.out.println(getAll));

        //ingat kita hanya boleh memakai sekali, jika ingin memakai 2x kita harus buat stream() lagi

    }
}
