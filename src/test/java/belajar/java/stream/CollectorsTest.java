package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {

    Stream<String> employee(){
        return Stream.of("ganjar","bowo","anis");
    }

    @Test
    void testCollection() {
        //MEMBUAT Stream to Set

        Set<String> stringSet = employee().collect(Collectors.toSet());
        Set<String> unmodifiebleSet = employee().collect(Collectors.toUnmodifiableSet());
    }


    @Test
    void testMap() {
        //Konversi data Stream menjadi map(bentuk key dan value)
        Map<String, String> stringMap = employee().collect(Collectors.toMap(
                // keymap , valuemap
                name -> name, manager -> "Manager"
        ));

        System.out.println(stringMap);
    }
}
