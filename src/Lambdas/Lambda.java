package Lambdas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays.*;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String [] args)
    {
        //version 1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Lambda l = new Lambda();
//        for (int number : numbers)
//        {
//            System.out.println(number);
//        }

        //ver 2
//        numbers.forEach((Integer value) -> System.out.println(value));

        //ver 3
//        numbers.forEach(value -> System.out.println(value));

        //ver 4
//        numbers.forEach(System.out::println);
        //ver 5 summary with Predicate functional interface
        l.sumAll(numbers, n -> true); //21
        l.sumAll(numbers, n -> n % 2 == 0); //12
        l.sumAll(numbers, n -> n > 3); //15


    }

    public int sumAll(List<Integer> numbers, Predicate<Integer> predicate){
        int sum = 0;
        for (int number : numbers){
            if (predicate.test(number)){
                sum += number;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
