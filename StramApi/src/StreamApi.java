import java.util.ArrayList;
import java.util.stream.Stream;


public class StreamApi {
    public static void main(String[] args) {
//        ArrayList<Integer> l = new ArrayList<>();
//        for(int i=0;i<10;i++){
//            l.add(i);
//        }
//        System.out.println(l);

        // Stream Api with foreach loop
//        ArrayList<Integer> l1 = new ArrayList<>();
//        for (Integer i:l){
//            if (i%2==0)
//                l1.add(i);
//        }
//        System.out.println(l1);

        // with stream api
//        List<Integer> l1 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(l1);

        // Map()
//        ArrayList<String> l = new ArrayList<>();
//        l.add("rvk"); l.add("rk"); l.add("rkv"); l.add("rvki"); l.add("rvkir");
//        List<String> l1 = l.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
//        System.out.println(l1);

        //count
        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(6);
        l.add(9);
        l.add(5);
        l.add(3);
//        long count = l.stream().filter(i->i%2==0).count();
//        System.out.println(l);
//    }

        // Sorted

//        List<Integer> l1 = l.stream().sorted().collect(Collectors.toList());
//        System.out.println(l1);

//        Comparator<Integer> comp = (i1,i2)->i1.compareTo(i2);
//        List<Integer> l1 = l.stream().sorted(comp).collect(Collectors.toList());
//        System.out.println(l1);

        // min

//        Comparator<Integer> comp = (i1,i2)->i1.compareTo(i2);
//        Integer min = l.stream().min(comp).get();
//        System.out.println(min);

        // max

//        Comparator<Integer> comp = (i1,i2)->i1.compareTo(i2);
//        Integer min = l.stream().max(comp).get();
//        System.out.println(min);

        // forEach
//
//        l.stream().forEach(i->System.out.println(i));
//        l.stream().forEach(System.out:: println);

        // toArray

//        Integer[] arr = l.stream().toArray(Integer[] :: new);
//        for (Integer i:arr){
//            System.out.println(i);
//        }

        // stream.of()

        Stream s1 = Stream.of(77,88,99,44,22);
        s1.forEach(System.out ::println);

        Double[] d= {10.0,10.1,10.2,10.3};
        Stream s = Stream.of(d);
        s.forEach(System.out :: println);


    }
}