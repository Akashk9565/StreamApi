package StramApi.src;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        // filter(Predicate)
             // boolean value function

//        List<String> names = List.of("Akash","Akshay","Animesh","Shiwam","Durgesh");
//        List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
//        System.out.println(newNames);

        // single line forEach
        //names.stream().filter(e -> e.startsWith("A")).forEach(e->System.out.println(e));


        // map(function)

        List<Integer> number = List.of(6,7,2,4,5,8,9);
        // Multiple line
//        List<Integer> collect = number.stream().map(i -> i * i).collect(Collectors.toList());
//        System.out.println(collect);

        // Single line forEach

//        number.stream().map(e->e*e).forEach(i->System.out.println(i));
//
//        number.stream().map(e->e*e).forEach(System.out::println);

        // sorted

            //forEach :: Methods
//        number.stream().sorted().forEach(System.out::println);
//            //forEach Methods
//        number.stream().sorted().forEach(i->System.out.println(i));
//            //collect Methods
//        List<Integer> collect = number.stream().sorted().collect(Collectors.toList());
//        System.out.println(collect);

        // min

//        Integer integer = number.stream().min((a, b) -> a.compareTo(b)).get();
//        System.out.println("min->"+integer);

        // max

        Integer integer1 = number.stream().max((a, b) -> a.compareTo(b)).get();
        System.out.println("max->"+integer1);
    }
}
