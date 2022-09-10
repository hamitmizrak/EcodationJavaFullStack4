package com.hamitmizrak.javase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class _31_Collection_List<T> {

    //LIST : LAV
    public static void main(String[] args) {
        List<String> listem=new ArrayList<>();
        listem.add("Malatya");
        listem.add("Bursa");
        listem.add("Manisa");
        listem.add("Bartın");

        System.out.println("Eleman Sayısı:"+listem.size());
        System.out.println("1.eleman:"+listem.get(0));
        System.out.println("Son eleman:"+listem.get(listem.size()-1));

        System.out.println("**** iterative Loop *************************");
        //Döngü ile göstermek
        //1-) iterative loop
        for (int i = 0; i <listem.size() ; i++) {
            System.out.print(listem.get(i)+" ");
        }

        //2-) for each
        // isimi for each olan veriyi döngüsü
        System.out.println("\n**** for each Loop *************************");
        for(String temp:listem){
            System.out.print(temp+" ");
        }

        // 3-) Iterator Loop
        System.out.println("\n**** Iterator Loop *************************");
        Iterator iterator= listem.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        // 4-) forEach Loop Java 8 ile gelen özelliktir.
        System.out.println("\n**** forEach Loop *************************");
        listem.stream().forEach(System.out::println);
        listem.forEach(System.out::println);
        System.out.println("\n**** forEach lambda expression Loop *************************");
        //lambda expression
        listem.stream().forEach((temp)->{
            System.out.println(temp.toUpperCase());
        });

    }
}
