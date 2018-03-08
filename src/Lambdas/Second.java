package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Second {
    public static void main(String [] args){
        //old one
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello from thread old method");
//            }
//        }).start();
        // using lambdas
//        new Thread(
//                () -> System.out.println("Now with lambdas we can run new thread with less chars")
//        ).start();


        //multiplying
        //old method
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
//        for(Integer n : list) {
//            int x = n * n;
//            System.out.println(x);
//        }
        //new
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
//        list.stream().map((x) -> x*x).forEach(System.out::println);



        //summ of sqr
        //old
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
//        int sum = 0;
//        for(Integer n : list) {
//            int x = n * n;
//            sum = sum + x;
//        }
//        System.out.println(sum);

        //using lambdas
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        int sum = list.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
        System.out.println(sum);
    }
}
