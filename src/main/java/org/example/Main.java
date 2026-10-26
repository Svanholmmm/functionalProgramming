package org.example;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import java.time.LocalDate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2001, 12, 29);


        Stream<LocalDate> tenDates =
                IntStream.range(1, 50)
                        .mapToObj(i -> birthday.plusYears(i));

        var obj = tenDates.map(date -> "year=" + date.getYear() + "Ugedag= " + date.getDayOfWeek());

        obj.forEach(System.out::println);

        IntPredicate leapYear = year -> (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        var obj2 = IntStream.iterate(LocalDate.now().getYear(), year -> year +1).filter(leapYear).limit(4);
        obj2.forEach(System.out::println);
    }
}














































//
//public static void main(String[] args) {
//    Supplier<Double> ran = () -> Math.random();
//
//    Stream<Double> randomNumbers = Stream.generate(ran);
//
//    Function<Double, Long> dblround = d -> Math.round(d * 100);
//
//    Predicate<Long> longEven = rannum -> rannum % 2 == 0;
//
//    DoubleSummaryStatistics stats = randomNumbers
//            .map(dblround)
//            .filter(longEven)
//            .limit(12)
//            .mapToDouble(d -> d)
//            .peek(System.out::println)
//            .summaryStatistics();
//
//    System.out.println("Max: " + stats.getMax());
//    System.out.println("Average: " + stats.getAverage());
//}


//
//        List<Soilder> soldiers = new ArrayList<>();
//
//        soldiers.add(new Soilder(4, "Jens"));
//        soldiers.add(new Soilder(4, "Jens1"));
//        soldiers.add(new Soilder(3, "Jens2"));
//        soldiers.add(new Soilder(1, "Ole"));
//        soldiers.add(new Soilder(5, "Kurt"));
//        Predicate<Soilder> isHighRanked = soldier -> soldier.getRank()>3;
//        Predicate<Soilder> startsWithJ = s -> s.getName().startsWith("J");
//        List<Soilder> highAndJ = soldiers.stream().filter(isHighRanked).filter(startsWithJ).toList();
//        highAndJ.forEach(soilder -> System.out.println(soilder));
//
//        Function<Soilder, String> getnames = soldier -> soldier.getName();
//
//
//        List<String> names = soldiers.stream().filter(isHighRanked).filter(startsWithJ).map(getnames).toList();
//        names.forEach(System.out::println);
//
//    }
//}
//    static <T> void forEach(List<T> lst, Consumer<T> consumer) {
//        for (T t : lst) {
//            consumer.accept(t);
//        }
//    }
//
//    static void forEachString(List<String> listOfStrings, Consumer<String> consumer) {
//        for (String s : listOfStrings) {
//            consumer.accept(s);
//        }
//    }
//
//    static void main(String[] args) {
//        Consumer<String> toUpper = x -> System.out.println(x.toUpperCase());
//        toUpper.accept("viggo");
//
//        Consumer<Long> square = t -> System.out.println(t * t);
//        square.accept(50L);
//
//        List<String> lstStr = Arrays.asList("hej", "du", "der");
//
//        forEachString(lstStr, toUpper);
//
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        Consumer<Integer> out = (Integer x) -> System.out.println(x);
//        forEach(list, out);
//        list.forEach(out);
//    }


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
