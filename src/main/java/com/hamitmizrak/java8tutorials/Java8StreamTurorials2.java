package com.hamitmizrak.java8tutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamTurorials2 {
// List<Integer> numberList=   dataSetInteger();

  // 1-10 arasında sayılar(Integer)
    public static List<Integer> dataSetInteger() {
        //1.YOL
        List<Integer> number = new ArrayList<>();
        number.add(7);
        number.add(3);
        number.add(2);
        number.add(8);
        number.add(1);
        number.add(6);
        number.add(9);
        number.add(4);
        number.add(5);
        number.add(5);
        number.add(5);

        //2.YOL
        List<Integer> number2 = Arrays.asList(7, 3, 2, 8, 1, 6, 9, 4, 5,5,5);
        return number2;
    }

    //S1-) dataSetInteger() bunu forEach Arrow function ile ekranda gösterin. ( (->{} )
    public static void exampleS1LambdaExpression(){
        List<Integer> numberList=   dataSetInteger();
        numberList.stream().forEach((temp)->{
            System.out.print(temp+" ");
        });
    }

    //S2-) dataSetInteger() kaç tane veri var ? (count)
    public static void exampleS2Count(){
      long data=   dataSetInteger().stream().count();
        System.out.println(data);
    }

    //S3-) dataSetInteger() Küçükten büyüğe sıralayım? (sorted)
    public static void exampleS3SortedAsc(){
        List<Integer> numberList=   dataSetInteger().stream().sorted().collect(Collectors.toList());
        System.out.println(numberList);
    }
    //S4-) dataSetInteger() Büyükten küçüğe sıralayım?(sorted())
    public static void exampleS4SortedDesc(){
        List<Integer> numberList=   dataSetInteger().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(numberList);
    }

    //S5-) dataSetInteger() Çift sayıları bulalım ? ekranda gösterelim ? (filter)
    public static void exampleS5Filter(){
        List<Integer> numberList= dataSetInteger().stream().filter((temp)->temp%2==0).sorted().collect(Collectors.toList());
        System.out.println(numberList);
    }

    //S6-) dataSetInteger() sayıların her birine 1 ekleyelim.(Map)
    public static void exampleS6Map(){
        List<Integer> numberList= dataSetInteger().stream().map((temp)->temp+1).sorted().collect(Collectors.toList());
        System.out.println(numberList);
    }
    //S7-) dataSetInteger() tekrar eden verilerin sayısını bulalım ? (count-distinct=tekrarsız sayı sonucu)
    public static void exampleS7CountDistinct(){
       long all= dataSetInteger().stream().count() - dataSetInteger().stream().distinct().count()+1;
        System.out.println(all);
    }

    //S8-) dataSetInteger() tekrarsız sayıların toplamını yapalım ?(reduce)
    public static void exampleS8Reduce(){
        //0 başlangıç değer
        //x1= 1.değer
        //x2= 2.değer
        int sum= dataSetInteger().stream().distinct().reduce(0,(x1,x2)->{ return x1+x2; });
        System.out.println(sum);
    }

    //S9-) dataSetInteger() tekrarsız sayıların,
    // her birine 2 ekle, çift olanlardan,büyükten küçüğe ilk 4 tanesini,toplamını yapalım ?
    public static void exampleS9DistinctMapFilterSortedLimit(){
        int sum=dataSetInteger()
                .stream()
                .distinct()
                .map((temp)->temp+2)
                .filter((temp)->temp%2==0)
                .sorted(Comparator.reverseOrder())
                .limit(4)
                .reduce(0,(x1,x2)->{return x1+x2;});
        System.out.println(sum);
    }

    //PSVM
    public static void main(String[] args) {
        //exampleS1LambdaExpression();
        //exampleS2Count();
        //exampleS3SortedAsc();
       // exampleS4SortedDesc();
        //exampleS5Filter();
        //exampleS6Map();
        //exampleS7CountDistinct();
        //exampleS8Reduce();
        exampleS9DistinctMapFilterSortedLimit();
    } //end PSVM
} //end Java8StreamTurorials