package com.hamitmizrak.javase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _31_Collection_List_2<T> {

    //LIST : LAV
    public static void main(String[] args) {
        //Diamond operator: Java 1.7 ile gelmiştir
        List<String> listem2=new ArrayList<>();
        listem2.add("Malatya");
        listem2.add("Bursa");
        listem2.add("Manisa");
        listem2.add("Bartın");
        listem2.add("Malatya");

        //size: saymaya 1 başlar
        System.out.println("Eleman Sayısı:"+listem2.size());
        System.out.println("1.eleman:"+listem2.get(0));
        System.out.println("Son eleman:"+listem2.get(listem2.size()-1));

        //isEmpty() : Boş mu
        System.out.println("Boş mu :"+listem2.isEmpty());

        //remove: sadece o indisteki elemanı listeden çıkartır
        System.out.println("ilk elemanı sil"+listem2.remove(0));
        System.out.println("İkinci elemanı sil"+listem2.remove(0));

        //clear(); Bütün veriyi temizler
        //listem2.clear();

        //hashCode : sadece o Nesne için özeldir.
        System.out.println("HashCode "+listem2.hashCode());

        //contains: Listede arama yapmak
        System.out.println("Listede Böyle birşey geçiyor mu? "+listem2.contains("Manisa"));

        // indexOf:
        // saymaya sol taraftan arayarak bulmaya çalışır
        // eğer listede varsa indis numarasını döner yoksa -1 döner
        if(listem2.indexOf("Malatya")>0){
            System.out.println("Listede "+listem2.indexOf("Malatya")+". veridir");
        }else{
            System.out.println("Listede böyle bir veri yoktur");
        }

        // lastIndexOf:
        // saymaya sağ taraftan arayarak bulmaya çalışır
        // eğer listede varsa indis numarasını döner yoksa -1 döner
        if(listem2.lastIndexOf("Malatya")>0){
            System.out.println("Listede "+listem2.lastIndexOf("Malatya")+". veridir");
        }else{
            System.out.println("Listede böyle bir veri yoktur");
        }

        //lambda expression
        listem2.stream().forEach((temp)->{
            System.out.println(temp.toUpperCase());
        });

        ////////////////////////////////////////////////////////////////////

        //List yapısını diziye çevirmek
        Object[] dizi=listem2.toArray();
        for(Object temp:dizi){
            System.out.println("dizi: "+temp);
        }

        //Listedeki verileri sadece ilgilendiğimiz yeri almak istiyorsak
        List<String> parcalanmisList=  listem2.subList(0,2); // 0<=X<=2-1

        //Listeye başka bir liste eklemek
        listem2.addAll(parcalanmisList);

        //lambda expression
        listem2.stream().forEach((temp)->{
            System.out.println(temp.toUpperCase());
        });


    }
}
