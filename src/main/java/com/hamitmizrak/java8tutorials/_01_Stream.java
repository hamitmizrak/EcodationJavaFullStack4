package com.hamitmizrak.java8tutorials;

// Java 8 gelen özellikler
// 1-) @FunctionInterface
// 1-) Method Referenaces
// 1-) Base64 Encoder-Decoder
// 1-) interface default
// 1-) Stream
// 1-) Optional

import java.util.ArrayList;
import java.util.List;

public class _01_Stream {

    // Dizi:eleman sayısı belli
    public static String[] strArray(){
        String[] arrayData={"Malatya","Ankara","Van","Elazığ","Sivas","Malatya"};
        return arrayData;
    }

    // Collection List:eleman sayısı belli olmayan
    public static List<String> collectionListData(){
        List<String> strList=new ArrayList<>();
        strList.add("Malatya");
        strList.add("Ankara");
        strList.add("Van");
        strList.add("Elazığ");
        strList.add("Sivas");
        strList.add("Malatya");
        return strList;
    }

    //Diziyi Listeye çevirerek Kullandım
    public static List<String> arrayToList(){
        String [] arrayData=strArray();
        //Normal bir diziyi Listeye çevirdim
        List<String> listem1=List.of(arrayData);
        return listem1;
    }

    //PSVM
    public static void main(String[] args) {

        //Normal List
        List<String> listem1=collectionListData();
        listem1.forEach((temp)->{
            System.out.println(temp);
        });

        // Diziyi Collectin(List) çevrilmiş hali
       List<String> listem2= arrayToList();
        listem2.forEach((temp)->{
            System.out.println(temp);
        });



    }

}
