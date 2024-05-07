package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByTest {


    @Test
    void testGroupingBy() {
        // karna kita akan membuat data yang isinya String dan kumpulan beberapa angka maka kita perlu Collection List sebagai tempat menaruhh kumpulan angka2 itu
        Map<String, List<Integer>> collect= Stream.of(1,2,3,4,5,6,7,8,9,10)
                .collect(Collectors.groupingBy(
                        number ->{//harus menggunakan lambda operator, kita bisa menambahkan beberapa kondisi
                            if(number %2 == 0){
                               return "GENAP";
                            }else {
                                return "GANJIL";
                            }

                        }
                ));

        System.out.println(collect);
    }


    @Test
    void testPartitionigGroup() {

        Map<Boolean, List<String>> testPartitining = Stream.of("fajar","Bobi","Iyo","Granger")
                .collect(Collectors.partitioningBy(
                        name -> {
                            return name.length() > 3;
                        }
                ));

        System.out.println(testPartitining);


    }
}
