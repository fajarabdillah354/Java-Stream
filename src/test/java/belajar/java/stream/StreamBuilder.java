package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.stream.Stream;

public class StreamBuilder {
    @Test
    void testCreateStreamBuilder() {

        Stream.Builder<String> builder = Stream.builder();


        //pada cara pertama konsepnya seperti chaining, kita bisa terus menerus menambahkan secara manual
        builder.add("fajar").add("abdillah");//ini cara pertama
        builder.accept("ahmad");//ini cara kedua

        Stream<String> stream = builder.build();
        stream.forEach(data-> System.out.println(data));

    }


    @Test
    void testCreateStreamBuilderSimple() {

        //INI CARA YANG LEBIH SIMPLE dengan cara memakai typegenerate Object
        // pada akhir jangan lupa method .build()

        Stream<Object> simpleBuilder = Stream.builder().add("membaca").add("buku").add("baru").build();//ini hanya bisa 1baris saja
        simpleBuilder.forEach(System.out::println);


    }
}
