package com.hamitmizrak.javase;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class _33_Collection_Map<T> {

    //MAP : HHLT
    public static void main(String[] args) {
        // Key: benzersiz olmalıdır.
        // MAp yapılarında strem() kullanamazsınız
        Map<String,Object> mapList=new LinkedHashMap<String,Object>();

        mapList.put("1","Malatya");
        mapList.put("2","Bursa");
        mapList.put("3","Manisa");
        mapList.put("4","Bartın");
        mapList.put("5","Malatya");

        //forEach (KEY)
        for (String key:mapList.keySet()) {
            System.out.print(key+" ");
        }

        //forEach (VALUE)
        for (Object value:mapList.values()) {
            System.out.print(value.toString().toUpperCase()+" ");
        }
        System.out.println();
        for (String key:mapList.keySet()) {
            System.out.println(key+" "+mapList.get(key));
        }

        //
        System.out.println();
        mapList.entrySet().forEach(System.out::println);
        //Lambda Expression
        mapList.entrySet().forEach((temp)->{
            System.out.println(temp);
        });

    }
}
