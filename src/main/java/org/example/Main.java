package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    static <T> void forEach(List<T> lst, Consumer<T> consumer) {
        for (T t : lst) {
            consumer.accept(t);
        }
    }

    static void forEachString(List<String> listOfStrings, Consumer<String> consumer) {
        for (String s : listOfStrings) {
            consumer.accept(s);
        }
    }

    static void main(String[] args) {
        Consumer<String> toUpper = x -> System.out.println(x.toUpperCase());
        toUpper.accept("viggo");

        Consumer<Long> square = t -> System.out.println(t * t);
        square.accept(50L);

        List<String> lstStr = Arrays.asList("hej", "du", "der");

        forEachString(lstStr, toUpper);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> out = (Integer x) -> System.out.println(x);
        forEach(list, out);

    }


//
//    public interface ZeroArgument {
//        public void myFunc();
//    }
//
//    public static void printZero(ZeroArgument z0) {
//        z0.myFunc();
//    }
//
//    public interface OneArgument {
//        public void myFunc(String str);
//    }
//
//    public interface TwoArgument {
//        public int myFunc(int a, int b);
//    }
//
//
//    static void main() {
//        ZeroArgument z = () -> System.out.println("Hello I am interface");
//        printZero(z);
//
//        OneArgument out = (str) -> System.out.println(str);
//        out.myFunc("Hej one arg");
//
//        TwoArgument two = (x, y) -> x + y;
//        int i1 = two.myFunc(5, 6);
//        System.out.println("i1=" + i1);
//
//        TwoArgument twomult = (x, y) -> x * y;
//        int i2 = twomult.myFunc(4, 5);
//        System.out.println("i2=" + i2);
//
//    }
//
}
