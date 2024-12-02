package StramApi.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String []args){

        // Stream Api Collection Process
        // Collection / group of Object

        // 1.Blank Stream

//        Stream<Object> empty = Stream.empty();
//        empty.forEach(e->System.out.println(e));

        // 2 array, collection object
//        String name[] = {"Akash","Akshay","Animesh","Shivam"};
//        Stream<String> name1 = Stream.of(name);
//        name1.forEach(e->System.out.println(e));

        // 3 Builder Pattern

        Stream<Object> build = Stream.builder().build();

        // 2 Arrays
//        IntStream stream = Arrays.stream(new int[]{3, 5, 7, 8, 9, 4});// anonymous object
//        stream.forEach(e->System.out.println(e));

        // List And Set

        List<Integer> list = new ArrayList<>();
        list.add(55);
        list.add(33);
        list.add(22);
        list.add(66);
        list.add(77);
        list.add(99);

//        Stream<Integer> stream = list.stream();
//        stream.forEach(e->System.out.println(e));


       list.stream().forEach(e->System.out.println(e));



    }
    

}
