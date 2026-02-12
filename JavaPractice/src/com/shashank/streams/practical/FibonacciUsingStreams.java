package com.shashank.streams.practical;

import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciUsingStreams {


    public static void main(String...args ) {

//        Stream.iterate(1l, new FactorialUnaryOperator()) //seed and Unary operator
//                .limit(10)
//                .forEach(System.out::println);

        Integer a = Integer.valueOf(1);
        Integer b = Integer.valueOf(1);
        Integer x = Integer.valueOf(1000);
        Integer y = Integer.valueOf(1000);
        System.out.println(a==b);
        System.out.println(x==y);
    }

    static class FibonacciUnaryOperator implements UnaryOperator<Integer[]> {
        public Integer[] apply(Integer[] input){
            Integer [] array;
            array = new Integer[]{input[1],  input[0] + input[1]};
            return array;
        }
    }

    static class FactorialUnaryOperator implements UnaryOperator<Long> {

        public Long apply(Long number) {
            return number * (number -1);
        }

    }
}
