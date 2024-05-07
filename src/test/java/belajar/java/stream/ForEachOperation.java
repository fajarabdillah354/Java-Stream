package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperation {


    @Test
    void testPeekBefore() {
        List.of("fajar","abdillah","ahmad").stream()
                .peek(name-> System.out.println("before upper :"+name))
                .map(upper -> upper.toUpperCase())
                .peek(getUpper -> System.out.println("After upper :"+getUpper))
                .forEach(last -> System.out.println("Final : "+last));
    }

    // peek() pertama digunakan untuk melihat data aslinya
    // peek() kedua digunakan untuk melihat data setelah kita lakukan operasi map()

}
