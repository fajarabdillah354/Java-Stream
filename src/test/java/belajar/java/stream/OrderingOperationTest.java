package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {

    @Test
    void testSorted(){
        List.of("fajar","abdillah","ahmad","keren").stream()
                .sorted()
                .forEach(System.out::println);
    }


    @Test
    void testSortedComparator(){
        Comparator<String> comparator = Comparator.reverseOrder();

        List.of("fajar","abdillah","ahmad","keren").stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }

}
