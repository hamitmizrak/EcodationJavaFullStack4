package com.hamitmizrak.java8tutorials;

// Java 8 gelen özellikler
// 1-) @FunctionInterface
// 1-) Method Referenaces
// 1-) Base64 Encoder-Decoder
// 1-) interface default
// 1-) Stream
// 1-) Optional

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamTurorials {

    // Dizi:eleman sayısı belli
    public static String[] strArray() {
        String[] arrayData = {"Malatya", "Ankara", "Van", "Elazığ", "Sivas", "Malatya"};
        return arrayData;
    }

    // Collection List:eleman sayısı belli olmayan
    public static List<String> collectionListData() {
        List<String> strList = new ArrayList<>();
        strList.add("Malatya");
        strList.add("Ankara");
        strList.add("Van");
        strList.add("Elazığ");
        strList.add("Sivas");
        strList.add("Malatya");
        return strList;
    }

    //Diziyi Listeye çevirerek Kullandım
    public static List<String> arrayToList() {
        String[] arrayData = strArray();
        //Normal bir diziyi Listeye çevirdim
        List<String> listem1 = List.of(arrayData);
        return listem1;
    }

    //ForEach(1)
    public static void streamForEachMethod() {
        //Normal List
        List<String> listem1 = collectionListData();
        listem1.forEach((temp) -> {
            System.out.println(temp);
        });

        // Diziyi Collectin(List) çevrilmiş hali
        List<String> listem2 = arrayToList();
        listem2.forEach((temp) -> {
            System.out.println(temp);
        });
    }

    //Collect: stream sonunda Listeye çevirir.
    public static void streamCollectMethod() {
        List<String> listem = collectionListData();
        List<String> yeniListem = listem.stream().collect(Collectors.toList());
        yeniListem.forEach((temp) -> {
            System.out.println(temp);
        });
    }

    //Sorted: stream verileri Sıralamak için kullanıyoruz
    public static void streamSortedSmallToLargeMethod() {
        List<String> listem = collectionListData().stream().sorted().collect(Collectors.toList());
        listem.forEach((temp) -> {
            System.out.println(temp);
        });
    }

    //Sorted: stream verileri Sıralamak için kullanıyoruz
    public static void streamSortedLargeToSmallMethod() {
        List<String> listem = collectionListData().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        listem.forEach((temp) -> {
            System.out.println(temp);
        });
    }

    //Limit: stream verileri kısıtlamak
    public static void streamLimitMethod() {
        List<String> listem = collectionListData().stream().sorted(Comparator.reverseOrder()).limit(5).collect(Collectors.toList());
        listem.forEach((temp) -> {
            System.out.println(temp);
        });
    }

    //distinct: stream verilerinde tekrarsız veriler elde etmek
    public static void streamDistinctMethod() {
        List<String> listem = collectionListData()
                .stream()
                .sorted(Comparator.reverseOrder()).distinct()
                .limit(5)
                .collect(Collectors.toList());
        listem.forEach((temp) -> {
            System.out.println(temp);
        });
    }

    //count: stream verilerinde veri sayısını hesaplar
    public static void streamCountMethod() {
        long counter = collectionListData()
                .stream()
                .sorted(Comparator.reverseOrder())
                .count();
        System.out.println(counter);
    }

    //filter: stream verilerindeki datalardan benim seçtiklerimi alsın
    //filter: lambda expression kullanıyoruz
    public static void streamFilterMethod() {
        List<String> listem = collectionListData()
                .stream()
                .sorted(Comparator.reverseOrder())
                .filter((temp) -> "malatya".equalsIgnoreCase(temp))
                .collect(Collectors.toList());
        listem.forEach((temp) -> {
            System.out.println(temp);
        });
    }

    //map: stream verilerindeki her bir data üzerinden işlem yapabilmeye denir
    //map: her bir eleman üzerinden işlem yapar
    //map: lambda expression kullanıyoruz
    public static void streamMapMethod() {
        List<String> listem = collectionListData()
                .stream()
                .sorted(Comparator.reverseOrder())
                .map((temp) -> temp.toUpperCase())
                .collect(Collectors.toList());
        listem.forEach((temp) -> {
            System.out.println(temp);
        });
    }

    // Reduce: tek bir yapıya indirgemedir
    // Reduce: bir önceki sonuç bir sonraki girdisidir (Software: Monad)
    // streamReduceMethod

    public static List<Integer> dataSetInteger() {
        List<Integer> number2 = Arrays.asList(7, 3, 2, 8, 1, 6, 9, 4, 5,5,5);
        return number2;
    }

    public static void reduceMethod(){
        //0 başlangıç değer
        //x1= 1.değer
        //x2= 2.değer
        int sum= dataSetInteger().stream().distinct().reduce(0,(x1,x2)->{ return x1+x2; });
        System.out.println(sum);
    }

    // NOT: Student diye bir Class oluştur bunun üzerinden: map,filter,reduce örneğini yap
    // Student nesnesine random for döngüsünde data set ekle
    // Student ==> name,surname,age(random)

    //Student List
    public static List<Student> studentList() {
        List<Student> studentList = new ArrayList<Student>();
        for (int i = 1; i <= 5; i++) {
            studentList.add(new Student(Long.valueOf(i), "username " + i, "surname " + i, 100 * i));
        }
        studentList.stream().forEach((temp) -> {
            System.out.println(temp);
        });
        return studentList;
    }

    //Method Referances ile gösterilir(::)
    //Java 8 gelemiş özelliktir.
    //Projede okunabilirliği artırır.(KArmaşıklığı azaltır)
    //ContainingClass:staticOlanMethod
    //classAdi::method
    public static void staticMethodReferancesData() {
        studentList().stream().forEach(Student::numberMethod);
    }


    //PSVM
    public static void main(String[] args) {
        //ForEach
        //streamForEachMethod();

        //colect
        //streamCollectMethod();

        //sorted: Küçükten Büyüğe Sıralama
        //streamSortedSmallToLargeMethod();

        //sorted: Küçükten Küçüğe Sıralama
        //streamSortedLargeToSmallMethod();

        //limit: Listede kısıtlama
        //streamLimitMethod();

        //Distinct: Tekrarsız veriler
        //streamDistinctMethod();

        //counter: verileri saymak
        //streamCountMethod();

        //filter: istediklerimi seçiyorum(seçmece karpuz)
        //streamFilterMethod();

        //map: Listedeki her bir veri üzerinden işlem yapabilmeye denir.
        //streamMapMethod();

        //studentList();
        staticMethodReferancesData();

        //Match:

        //reduce


    } //end PSVM
} //end Java8StreamTurorials
