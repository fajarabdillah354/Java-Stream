package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class StreamPipeline {


    @Test
    void testCreateStreamPipeline() {
        //TODO: Programmer java biasanya menggunakan cara karna lebih mudah dibaca, adappun cara yang ada di file StreamOperator itu sangat jarang sekali digunakan

        List<String> list = List.of("nur asiah","maisaroh","inne qonitati");

        list.stream()//langkah awal kita harus menggunakan method stream()
                .map(upper -> upper.toUpperCase())//ini adalah modifikasi yang ingin kita tambahkan ke dalam var list
                .map(addNy -> "Ny. "+addNy)
                .forEach(System.out::println);//jika sudah untuk menjalankan Streamnya kita gunakan forEach()





    }
}
