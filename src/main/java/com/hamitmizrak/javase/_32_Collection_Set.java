package com.hamitmizrak.javase;
import java.util.*;

public class _32_Collection_Set<T> {

    //SET : HLT
    public static void main(String[] args) {
        Set<String> setList=new TreeSet<>();
        setList.add("Malatya");
        setList.add("Bursa");
        setList.add("Manisa");
        setList.add("Bartın");
        setList.add("Malatya");

        //lambda expression
        setList.stream().forEach((temp)->{
            System.out.println(temp.toUpperCase());
        });


    }
}
