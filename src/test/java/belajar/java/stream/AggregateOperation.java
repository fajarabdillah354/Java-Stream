package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.awt.desktop.SystemEventListener;
import java.util.Comparator;
import java.util.List;

public class AggregateOperation {

    @Test
    void testMax() {
        List.of("fajar","abdillah","ahmad","keren").stream()
                .max(Comparator.naturalOrder())//karna dia balikan datanya Optional berari bisa saja datany kosong maka kita perlu menggunkan ifPresent()
                .ifPresent(System.out::println);

        // program akan mencetak data terbesar berdasarkann desending yaitu akan menampilkan "keren"
    }


    @Test
    void testMin() {
        List.of("fajar","abdillah","keren","ahmad").stream()
                .min(Comparator.reverseOrder())
                .ifPresent(System.out::println);
        // akan mencetak data terkecil berdasarkan desending
    }


    @Test
    void testCount() {
        long count = List.of("gajah","sapi","kuda","burung").stream().count();

        System.out.println(count);
    }


    @Test
    void testSum() {
        var result = List.of(1,2,3,4,5,6).stream()
                .reduce(0,(value, item ) -> value+item);

        System.out.println(result);

        // 0
        // 1. value = 0, item=1 => 1
        // 2. value = 1, item=2 => 3
        // seterusnya seperti itu
        // nb untuk melakukan factorial juga mudah menggunakan ini
    }


    @Test
    void testFactorial() {
        var factorial = List.of(1,2,3,4,5,6).stream()
                .reduce(1,(value, item) -> value*item);//dengan menggunakan aggregate Operation kita juga mudah membuat factorial

        System.out.println(factorial);


    }
}
