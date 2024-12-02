package StramApi.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi1 {

    public static void main(String []args){

        //List.of()

        List<Integer> list = List.of(6,8,9,5,3,4,2,1,3);

        List<Integer> list1 = new ArrayList<>();
        list1.add(22);
        list1.add(33);
        list1.add(55);
        list1.add(88);
        list1.add(44);
        list1.add(63);

        List<Integer> list2 = Arrays.asList(6,8,9,3,4,5,2);

        // list
        // without stream

//        List<Integer> listEven = new ArrayList<>();
//
//        for (Integer i : list){
//            if (i%2==0){
//                listEven.add(i);
//            }
//        }
//        System.out.println(list);
//        System.out.println(listEven);

        // list1 using stream

        // two line code
//        Stream<Integer> stream = list1.stream();
//        List<Integer> collect = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());

        // single line code
        //List<Integer> collect = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        // collect large number
        List<Integer> collect = list1.stream().filter(i -> i > 55).collect(Collectors.toList());

        System.out.println(list1);
        System.out.println(collect);

    }
}
