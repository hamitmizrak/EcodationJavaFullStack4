//single comment : comment out
/* multiple comment */
//alert("Merhabalar")

// console.log("Merhabalar");
// console.info("info");
// console.warn("warning")
// console.error("error")

//alert("pop-up")
//window.alert("pop-up-2")

// document.write("write verisi")
// document.writeln("<br/>Benden sonra gelen alt satırda başlar")

//Not:
//""  ==> Çift tırnak kullanabiliriz.
//''  ==> Tek tırnak kullanabiliriz.
// `` ==> backtick
///////////////////////////////////////
//variable
// var dinamik bir değerdir.
// Variable Dikkat edeceğimiz hususlar:
// camelCase kullanalım.

// camelCase kullanalım
// var degiskenAdi = true;
// console.log(degiskenAdi);

// // $ ve _ ile başlayabiliriz
// var $degiskenAdi = 44;
// console.log($degiskenAdi);

// var _degiskenAdi = 23.55;
// console.log(_degiskenAdi);

// // sayılarla ile bitebilir.
// var degiskenAdi55 = "Merbalar";
// console.log(degiskenAdi55);

// sayı ile ve ($ ve _) haricinden özel simgeyle başlanmaz kullanalım

///////////////////////////////////////
//Typeof: Değiken türünü bize söyler
// var str = "Merahbalar";
// console.log(typeof str);

// var sayi = 44;
// console.log(typeof sayi);

// var virgul = 44.55;
// console.log(typeof virgul);

// var karar = true;
// console.log(typeof karar);

// //NOT: dizi ve object türü ==> objecttir.
// var object = {};
// console.log(typeof object);

// var dizi = [];
// console.log(typeof dizi);


///////////////////////////////////////
//whoisting: değişken türünü sonra yaz.
// degisken = 55;
// var degisken;
// console.log(degisken);

///////////////////////////////////////
// var   ==> global ==>
// let   ==> local  ==> ES6 (2015)
// const ==> local  ==> ES6 (2015) ==> Sabit değiştirmezsini

///////////////////////////////////////
//Variable Declaration
//Değer atamadan önce sadece değişken oluşturmaya denir.
// var number;
// console.log(number);
//result: undefined olarak döner

//variable initialization
// ilk değer ataması anlamına gelir.
// Toplamada etkisiz ==> 0(sıfır) sayıdır.
// Çarpmada etkisiz ==> 1(bir) sayıdır.
//var initData="";
//Nullpointer excepiton veya undefined almayız
///////////////////////////////////////
//OPERATORS
// 8 bit = 1 byte
// 1 bit (0 veya 1) oluşan anlamına gelir


//ADI                   SEMBOL    İŞLEMİ
//-----------------------------------------------------------
//additional            +         toplama
//substraction          -         çıkarma
//multiplation          *         çarpma
//exponentiation        **        üslü sayılar (ES6)
//division              /         Bölme
//modules               %         Kalan
//postfix increment     X++       Artırmayı işlemden sonra yap
//postfix deincrement   X--       Azaltmayı işlemden sonra yap
//pre increment         ++X       Artırmayı işlemden önce yap
//pre deincrement       --X       Azaltmayı işlemden önce yap

// ! ==> değil anlamına gelir

//Atama Operatörürü
// =    =>Atama operatörü
// ==   =>Eşit demek(Türüne bakmadan)
// ===  =>Eşit demek(Türüne bakarak)

///////////////////////////////////////
//Kullanıcıdan veri almak istersek
//prompt: versiinde bize String yani kelime döner biz bunu sayıya çevirmemiz gerekir.
//var userData= Number(prompt("Lütfen bir sayı giriniz")) ;
//console.log(userData*userData);

///////////////////////////////////////
//typeof: veri türünü bize söyler
//instanceof: o verinin o türe ait olup olmadığı bilgisini bize verir.

// var dizi=[];
// console.log(dizi);
// console.log(typeof(dizi));
// console.log(dizi instanceof Array);
// console.log(dizi instanceof Object);

///////////////////////////////////////
//undefined: tanımsız
//Çözümü: değişkene bir değer vermektir
// var varible;
// console.log(varible);

//Infinity: Sonsıuz,tanımsız
//Çözümü: Sıfıra bölmemek
// var number=4/0;
// console.log(number);

//NaN: Not A Number
//Çözümü: Bütün değerler sayı olmalıdır veya cast etmeliyiz.
// var result=4/"asd";
// console.log(result);

//isNaN: is not a number:  bir sayı değildir.
//false: bu bir sayıdır anlamına gelir.
// console.log(isNaN(44));

//new  : hafızadan bir yer açmak
//null : hafızadaki yeri kapatmak
//zero : hafızada bir yere sahip ancak değeri sıfır
///////////////////////////////////////
// Escape Character: Çıkış karakteri demektir.
// Escape Character: Back Slash (\)
// Bazen özel simgelerimizi işlem yapmadığımız durumlarda imdadımıza koşar
// single quote:    \'
// multiple quote:   \"
// console.log("1.satır\n2.satır");
// console.log("1.satır\n\t2.satır");

///////////////////////////////////////
//JavaScript Keywords:
//break    : döngü durdurmak için
//return   : metotu durdurmak ve değer almak için
//continue : sadece o anda çalışma sonrasında döngüde devam et
//debugger : debug atarken kullanıyoruz.

///////////////////////////////////////
//Math:Önceden yazılmış matematikse betimlerdir.
//NOT: iç içe math yazılabilinir.

//sabit sayılar
// console.log("E: " + Math.E);
// console.log("PI :" + Math.PI);

// //Matemetiksel
// console.log("En küçüğü :" + Math.min(2, 5, 2, 666, 12));
// console.log("En Büyüğü :" + Math.max(2, 5, 2, 666, 12));
// console.log("Mutlak Değer :" + Math.abs(-100));
// console.log("Karakök Değer :" + Math.sqrt(16));
// console.log("Üslü Değer :" + Math.pow(2, 5));
// console.log("Üslü Değer :" + 2 ** 5);//ES6(2015) exponentiation

// //Yuvarlamak
// console.log("Aşağı Yuvarla :" + Math.floor(2.9));
// console.log("Yukarı Yuvarla :" + Math.ceil(2.1));
// console.log(".5 ve üstünde üstüne yuvarla :" + Math.round(6.5));
// console.log(".4 ve üstünde aşağı yuvarla :" + Math.round(6.4));

// //Sin Cos
// console.log(Math.sin(45));
// console.log(Math.cos(45));


// //Rastgele
// console.log(Math.round(Math.random() * 10 + 1));

//ÖDEV
// Math Ödev
// Kullanıcıda tarafından aldığımız 2 tane sayının
// s1-) Bu sayılardan en küçüğü nedir ?
// s2-) Bu sayılardan en büyüğü nedir ?
// s3-) Bu sayılardan en büyüğü karekökü nedir ?
// s4-) Bu sayılardan en büyüğü karekökünün üste yuvarlıyalım nedir ?
// s5-) Bu sayılardan en küçüğü mutlak değeri nedir ?
// s6-) Bu sayılardan en küçüğü alt taban en büyüğü üst taban şeklinde üstünü alalım

///////////////////////////////////////
//SAYILAR
// let sayi1;

// //Tam sayı
// sayi1=55;
// console.log(sayi1);

// //Virgüllü sayı
// sayi1=44.23;
// console.log(sayi1);

// //toFixed: virgülden sonra kaç rakam gösterim sağlansın
// const sayi=56.12345;
// console.log(sayi.toFixed(3));

// //Veri türü nedir ?
// console.log(typeof sayi1);

// //Bilimsel Gösterim
// let bilimselGosterim;
// bilimselGosterim=13E+5;
// console.log(bilimselGosterim);

// bilimselGosterim=13E-5;
// console.log(bilimselGosterim);

// //toExponential: verilen bir sayıyı bilimsel olarak gösterimini sağlar
// const sayi2=56000;
// console.log(sayi2.toExponential(3));

// //toPrecision()
// const sayi3=56.12345;
// console.log(sayi3.toPrecision(3));

// //CAST
//  const number= Number(prompt("Lütfen bir sayı giriniz"));
//  console.log(number**2);

// //Infinity
// const number2=4/0;
// console.log(number2)

// //NaN: sayı değil
// let number3=4/"asd";
// console.log(number3);

//isNaN: Bir sayı değildir.
//Eğer false dönerse bu bir sayıdır.
//Eğer true dönerse bu bir sayı değildir.
//console.log(isNaN(44));

//Sayı sistemleri
//Binary(2)  ==> 0 ve 1
//Octal(8)   ==> 0-1-2-3-4-5-6-7
//Decimal(10)==> 0-1-2-3-4-5-6-7-8-9
//Hexadecimal(16)==> 0-1-2-3-4-5-6-7-8-9-a-b-c-d-e-f

//Binary,Octal veya Hexadecimal ==> 10'luk tabana çevirmek
// let binary=0b01101010101;
// console.log(binary);

// let octal=076210;
// console.log(octal);

// let hexadecimal=0xff1;
// console.log(hexadecimal);

///////////////////////////////////////
// //KELIMELER
// //Dikkat ==> Boşluk karakterdir.
// //Aşağıdakiler Javada aynı olan Fonksiyonlar
// const kelime = "Merhabalar Güzel insanlar Güzel";
// document.write(kelime + "<br/>");
//
// //length trim
// document.write("Harf Sayısı: " + kelime.length + "<br/>");
// document.write("Traşlanmış Harf Sayısı: " + kelime.trim().length + "<br/>");
//
// //toLowerCase toUpperCase
// document.write(kelime.toLowerCase() + "<br/>");
// document.write(kelime.toUpperCase() + "<br/>");
//
// //startsWith endsWith
// document.write("Bununla mı başlıyor ? " + kelime.startsWith('M') + "<br/>");
// document.write("Bununla mı bitiyor ? " + kelime.endsWith(' ') + "<br/>");
//
// //concat,replace
// document.write(kelime.concat(" -INC Sona eklendim")+ "<br/>");
// document.write(kelime.replace(kelime,"değiştirdim")+ "<br/>");
//
// //parçalama:
// //Dikkattt: substring=> Saymaya Sıfırdan başlar
// document.write(kelime.substring(1)+ "<br/>");
// document.write(kelime.substring(0,3)+ "<br/>");
//
// //charAt()==> sayı verecem bana tek bir harf dönecek
// //Dikkattt: charAt() => Saymaya Sıfırdan başlar
// document.write(kelime.charAt(0)+ "<br/>");
//
// //indexOf()==> ben harf vereceğim bana sayı dönecek
// //Dikkattt: indexOf() => Saymaya Sıfırdan başlar
// //indexOf() => Soldan saymaya başlar ilk bulduğu yerde indisi döndürür
// document.write(kelime.indexOf('Güzel')+ "<br/>");
// //lastIndexOf() => Sağdan saymaya başlar ilk bulduğu yerde indisi döndürür
// document.write(kelime.lastIndexOf('Güzel')+ "<br/>");


//ÖDEV
// kullanıcı tarafından girilen bir kelimenin
//S-1) Kaç karakterlidir ?
//S-2) boşluklar alınarak Kaç karakterlidir ?
//S-3) bütün kelimeyi küçük harfle göstermek ?
//S-4) bütün kelimeyi büyük harfle göstermek ?
//S-5) ilk harf nedir  ?
//S-6) girdiğiniz kelime java ile başlıyor mu  ?
//S-7) girdiğiniz kelimenin sonuna "-ben js öğreniyorum"   ?
//S-8) girdiğiniz 0 ile 4 arasındaki indexi ekranda gösterin   ?
//S-9) Kullanıcıdan alınan başka bir kelimeyle birinci olan kelimeyle yer değiştirmek ?

///////////////////////////////////////

//CAST
//1-) String'i ==>  Sayıya Çevirmek
//Number() parseInt() arasındaki fark ==> Özkan
//Number() ==> String'i Sayıya çevirir.
// let variable1 = Number("4");
// document.write(variable1 ** 2 + "<br/>");
// document.write(typeof variable1 + "<br/>");
//
// //Number() ==> String'i Sayıya çevirir.
// let variable2 = parseInt("4");
// document.write(variable2 ** 2 + "<br/>");
// document.write(typeof variable2 + "<br/>");
//
// //2-)Sayıyı ==> String'e Sayıya Çevirmek
// let variable3 = String(444);
// document.write(variable3.length + "<br/>");
// document.write(typeof variable3 + "<br/>");
//
// let variable4 = 444
// document.write(variable4.toString() + "<br/>");
// document.write(typeof variable4 + "<br/>");


///////////////////////////////////////
//Function:
// sürekli kodlarımızı  aynı kodları yazmak biizi yavaşlatır.
// Clean Code mantığının dışında haraket etmemek için
// Okunabilirliği artırmak
// yazılabilirliği artırmak
// sistem hızlandırmak v.s

//Fonkisyonlarda common rules
//camelCase kullanalım yapalım.
// sıfat -isim kullanalım
//Unutma: yazdığın fonkisyonu çağırmalasın (Immedia Function Hariç)
// ES5 (anonymous Function)
// ES6 (2015) ==>Arrow function
// Immedia Function
// JavaScript ==> Single Thread çalışır yani Senkron düzlemdedir
// Biz yazdığımız kodları Asenkron (aynı anda birden fazla iş) için ==> callBackFunction ancak bunun yerine promise veya asyn await kullanalım.

//1-) Returnsuz parametresiz Function
// function returnsuzParametresiz() {
//     console.log("returnsuz Parametresiz")
// }
// returnsuzParametresiz();

// //2-) Returnsuz parametreli Function
// // parametre: fonksiyon oluştururken yazdığımız

// function returnsuzParametreli(adi,soyadi) {
//     console.log("returnsuz Parametreli ==> "+adi+" "+soyadi)
// }
// // argüman: fonkisyonu çağırırken kullanırılır.
// returnsuzParametreli('Hamit',"Mızrak");


// //3-) Returnlu Parametresiz Function
// function returnluParametresiz() {
//     return "returnlu Parametresiz";
// }
// let returnData=returnluParametresiz();
// console.log(returnData);


// //4-) Returnlu parametreli Function
// function returnluParametreli(adi,soyadi) {
//     return "returnlu Parametreli==> "+adi+" "+soyadi;
// }
// let returnData2=returnluParametreli('Hamit',"Mızrak");
// console.log(returnData2);


// Function Type
//1-) Immedia Function
//2-) Normal Function
//3-) Anonymous Function
//4-) Array Function

//1-) Immedia Function
//Immedia Function: Hemen Göster ve fonkisyonu çağırmamıza gerek yoktur.
//Dikkat: Immedia öncesinde function olmaması gferekiyor
// (function () {
//     console.log("1-Immedia Function");
//     document.write("<br/> 1-Immedia Function")
// })();

// //2-) Normal Function
// function normalFunction() {
//     console.log("2-normal Function");
//     document.write("<br/> 2-normal Function")
// }
// normalFunction();

// //3-) Anonymous Function
// let anonymousFunctionData = function () {
//     console.log("3-Anonymous Function");
//     document.write("<br/> 3-Anonymous Function")
// }
// anonymousFunctionData();

// //4-) Array Function
// let arrowFunctionData = () => {
//     console.log("4-Arrow Function");
//     document.write("<br/> 4-Arrow Function")
// }
// arrowFunctionData()

///////////////////////////////
//JavaScript
//Senkron olarak çalışır.
//Senkron: Aynı anda sadece bir tane process çalışır
//Asenkron: Aynı anda birden fazla process çalışır.

//Asenkron için çözümler
//1-) Monad Senkron

//1-) Monad Senkron
// function monadBirinci(number){
//     console.log(Math.pow(number, 2));
// }
// function monadIkinci(){
//     const userData= Number(prompt("bir sayı giriniz"));
//    //monad
//    monadBirinci(userData);
// }
//ikinci();

//2-) CallBackFunction
// function callBackBirinci(number){
//     console.log(Math.pow(number, 2));
// }
// function callBackIkinci(callback){
//     const userData= Number(prompt("bir sayı giriniz"));
//    //monad
//    callback(userData);
// }
//callBackIkinci(callBackBirinci);

//3-) setTimeOut:
// Fonksiyonlarda belli bir zamandan sonra çalışmasını isteriz.
// setTimeout(fonkisyon(), timer mili-saniye cinsinden)
// function istediğimiz zaman aralığında çalışmasını sağlarız.

//1.GÖSTERİM => setTimeOut ==> normal Fonkisyon
// function setTimeOutBirinci(){
//     console.log("Set Time out ==> 1. Fonksiyon 5 saniye");
// }
// function setTimeOutIkinci(){
//     console.log("Set Time out ==> 2. Fonksiyon 4 saniye");
// }
//setTimeout(setTimeOutBirinci,5000);
//setTimeout(setTimeOutIkinci,4000);

//2.GÖSTERİM => setTimeOut ==> anonymous function
///setTimeout(function (){console.log("Set Time out ==> 3. Fonksiyon 3 saniye");},3000);

//3.GÖSTERİM => setTimeOut ==> anonymous function
//setTimeout(function (){console.log("Set Time out ==> anonymous function 2 saniye");},2000);

//4.GÖSTERİM => setTimeOut ==> arrow function
//setTimeout( () =>{console.log("Set Time out ==> arrow function 1 saniye");},1000);

////////////////////////////////////////////
//CONDITIONAL
let dataFunction = () => {
    const number = Number(prompt("Lütfen bir sayı giriniz"));
    if (number == 1) {
        console.log("sayı 1");
    } else {
        console.log("farklı bir sayıdır");
    }
}
//dataFunction();


let dataFunction2 = () => {
    const number = Number(prompt("Lütfen bir sayı giriniz"));
    if (number == 1)
        console.log("sayı 1");
    else
        console.log("farklı bir sayıdır");
}
//dataFunction2();

//ternary
let dataFunction3 = () => {
    const number = Number(prompt("Lütfen bir sayı giriniz"));
    let result = (number == 1) ? "sayı 1" : "farklı bir sayıdır";
    console.log(result);
}
//dataFunction3();


let dataFunction4 = () => {
    const number = Number(prompt("Lütfen bir sayı giriniz"));
    if (number === 1) {
        console.log("sayı 1");
    } else if (number === 2) {
        console.log("sayı 2");
    } else if (number === 3) {
        console.log("sayı 3");
    } else if (number === 4) {
        console.log("sayı 4");
    } else if (number === 5) {
        console.log("sayı 5");
    } else {
        console.log("farklı bir sayıdır");
    }
}
//dataFunction4();

//Switch Case
let dataFunction5 = () => {
    const number = Number(prompt("Lütfen bir sayı giriniz"));
    switch (number) {
        case 1:
            console.log("sayı 1");
            break;
        case 2:
            console.log("sayı 2");
            break;
        case 3:
            console.log("sayı 3");
            break;
        case 4:
            console.log("sayı 4");
            break;
        case 5:
            console.log("sayı 5");
            break;

        default:
            console.log("farklı bir sayıdır");
            break;
    }
}
//dataFunction5();

///////////////////////////////
//LOOP: Loop: Sürekli kendini tekrar eden verilerde kolaylıkla sağlaması için kullanılır.
let loopFunction = () => {
    console.log(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);

    //Sıfır => (Çarpmada Yutan eleman) 
    //Sıfır => (Toplamada Etkisiz eleman) 

    let sum = 0;
    //1-) iterative for
    for (let index = 1; index <= 10; index++) {
        sum = sum + index;
    }
    console.log("for ==>" + sum);

    //for ==> sonsuz döngü
    //for(;;){}


    //2-) while
    let sum2 = 0;
    let k = 1;
    while (k <= 10) {
        sum2 += k;
        k++
    }
    console.log("while ==>" + sum2);

    //while ==> sonsuz döngü
    //while(true){}


    //3-)do while: en kötü şartta en az 1 kere çalışır.
    let sum3 = 0;
    let m = 1;
    do {
        sum3 += m;
        m++;
    } while (m <= 10);
    console.log("do-while ==>" + sum3);

    // 4-) diziler göreceğiz ===> forIn(indis) forOf(hepsi)
}
//loopFunction();
////////////////////////////////////////////

//return : metotu kesmek, durmak,kırmak
//break : döngüyü kesmek,durmak,kırmak
//continue:saedece o döngüde durmak sonra devam etmek

//ÖDEV (if-else for break continue)
//Fonksiyonlarla
//Örnek: 1 ile kullanıcının vereceği (prompt) bitiş sayısına göre
//kullancı: 5 verdi diyelim 1<=X<=5
//1.adım: kaç tane sayı var ?
//2.adım: sayı toplamları var ?
//3.adım: kaç tane tek  sayı var ?
//4.adım: tek sayılar toplamı ?
//5.adım: tek sayılar gösterelim ?
//6.adım: kaç tane çift  sayı var ?
//7.adım: çift sayılar toplamı ?
//8.adım: çift sayılar gösterelim ?
//Eğer verilen sayılarda 7 sayısı varsa bunu eklemesin (continue)
//Eğer bitiş sayısı 100 fazla ise 100'e kadar olanlar toplansın  (break)
//Eğer kullanıcı başlangıç sayıdan küçük girerse uyaralım başlangıçtan büyük girmesini isteyelim
//Eğer kullanıcı secret-key girerse yani 44 sayısını girerse program çalışmayı direk durdursun


////////////////////////////////////////////
//Date 
let nowDateFunction = () => {
    let nowDate = new Date(2019, 0, 1, 10, 30, 500);
    nowDate.setHours(8);
    document.writeln(nowDate);
    document.writeln("<br/>" + nowDate.getHours());
    document.writeln("<br/>" + nowDate.getDate());
    document.writeln("<br/>" + nowDate.getMilliseconds());
}
//nowDateFunction();

////////////////////////////////////////////
//try-catch 
let tryCatchFunction = () => {
    try {
        alertx("deneme");
        console.log("1-Database.close()");
    } catch (error) {
        console.log("Hata mesajı: " + error.message);
        console.log("Hata mesajı adı: " + error.name);
        console.log("Hata hepsi: " + error);
        //console.log(error);
    } finally {
        console.log("2-Database.close()");
    }
}
//tryCatchFunction();

// zorlayarak hata mesajı çıkarmak
//throw "Hata var";


///////////////////////////////////////////
//NOT: örneklerimizi function,anonymous ve arrow function ile yapalım.
//NOT: değişken olarak var,let,const kullanalım.

//NOT: örneklerimizi function,anonymous ve arrow function ile yapalım.
//NOT: değişken olarak var,let,const kullanalım.

//Örnek-1
//y=3x+4k ==>1.dereceden2bilinmeyenlidenklem algoritması
//Kullanıcı tarafından alınan x ve kdeğerlerini hesaplayan algoritma yazınız ?


//örnek-2
//Kullanıcı tarafından alınan dereceyi  Fahrenhayta çeviren algoritma yapalım.
//Formül: (derece*9/5)+32

//örnek-3 operatör işlemleri: aşağıdaki örneği javascript ile yapalım
//4+3*2(3:3-1*6+9:1+(3:3))

//Örnek-4: Aşağıdaki örnekleri math ile çözelim ?
// -5.9 sayıyının aşağıdaki işlemleri yaptıralım ?
// 1-mutlak değeri alsın 5.9
// 2-yuvarlama yapsın  6.0
// 3-karesini alsın 36.00
// 4-karekök alsın 6.0
// 5-yuvarlama yapsın 6.0
// 6-)çıkan sonucu 5 bölsün 6/5=1
// 7-) iki sayı arasından karşılaştırma yapsın en küçüğünü alsın ve 1 ve 5
// 8-) küçük sayı eğer tekse 3 eklesin çiftse 5 eklesin 

// Örnek-5 : kullanıcı tarafından girilen bir sayıyı negatif mi pozitif mi olduğu ekran yazdıran algoritma ?
//NOT: cast kullalım ?

// Örnek-6 : kullanıcı tarafından password ve repassword alalım sonrasında bu iki değeri karşılaştırma yapalım
//eğer aynı girilirse aynı veri yoksa birbirine uymadı yazan algoritma yapalım



//Örnek-7  Haftanın günlerini bulan algoritma ? 
let weekInDay = () => {
    const nowDay = new Date().getDay();
    console.log(nowDay);
    try {
        switch (nowDay) {
            case 6:
                console.log("cumartesi");
                break;

            default:
                console.log("haftanın günleri dışında girildi")
                break;
        }
    } catch (error) {
        console.log(error)
    }
}
//weekInDay()


///////////////////////////////////////////
// Diziler:
// Verilerimizi bütün bir yapıda saklamaya yarar.
// içine her türlü veri saklayabailiriz.
// Verileri sıralı bir biçimde saklar
// Sıfırıncı (0) indiste başlar.
// diziler birer objedir.
// dizilerde length kullanmak önemlidir
// dizilerde ilk eleman ==> dizi[0]
// dizilerde son eleman ==> dizi[dizi.length-1] 
// let dizi=[]; //bu kullanım daha yaygındır.
// let dizi2=new Array();

///////////////////////////////////////////////////
//dizi 
let diziFunction = () => {
    let dizi = [];
    dizi[0] = "Merhabalar";
    dizi[1] = 44;
    dizi[2] = 44.23;
    dizi[3] = true;

    console.log(dizi);
    console.log("ilk eleman ==>" + dizi[0]);
    console.log("son eleman ==>" + dizi[dizi.length - 1]);
    document.write("<br/>son eleman ==>" + dizi[dizi.length - 1]);
}
//diziFunction();
let diziFunction2 = function () {
    //rastgele 5 tane sayı üreten bir eleman olsun 
    let temp;
    let dizi = [];
    for (let i = 0; i < 5; i++) {
        temp = Math.round(Math.random() * 15 + 1);
        dizi[i] = temp;
    }
    return dizi;
}
//console.log(diziFunction2());

///////////////////////////////////////////////////

//1-) iterative for 
let diziFunction3 = () => {
    const dizi2 = diziFunction2();
    console.log(dizi2);
    for (let i = 0; i < dizi2.length; i++) {
        document.write(dizi2[i] + " ")
    }

}
//diziFunction3();


// 2-) for In:(For Over Index) bize sayı numarasını verir verinin kendisini vermez
// sadece indis numarasını verir
let diziFunction4 = () => {
    const dizi2 = diziFunction2();
    console.log(dizi2);
    for (let temp in dizi2) {
        document.write(dizi2[temp] + " " + temp + " ");
    }
}
//diziFunction4();

// 3-) for Of:(for over member) bize verinin kendisini verir
let diziFunction5 = () => {
    const dizi2 = diziFunction2();
    console.log(dizi2);
    for (let number of dizi2) {
        document.write(number + " ")
    }
}
//diziFunction5();

// 4-) forEach:
// yazım şekli ==> dizi.forEach(function(value,index,array){}); 
// value: dizi eleman değerlei, yazmak zorundayız.
// index: dizi eleman indisi ,yazmak zorunda değiliz.(optional)
// array: dizinin kendisidir ,yazmak zorunda değiliz.(optional)
//sadece value
let diziFunction6 = () => {
    const dizi2 = [2, 4, 6, 8, 10];
    let sum = 0;
    dizi2.forEach(function (value) {
        sum += value;
    })
    //document.writeln("<br/>"+sum);

}
//diziFunction6();
//document.writeln("<br/>*************")

// value,indis,array ==> normal
let diziFunction7 = () => {
    const dizi3 = diziFunction2();
    dizi3.forEach(function (value, index, array) {
        document.writeln("<br/> Değer verisi: " + value + " index verisi: " + index + " array verisi: " + array);
    })
}
//diziFunction7();
//document.writeln("<br/>*************")

// value,indis,array ==> Interpolation
let diziFunction8 = () => {
    const dizi3 = diziFunction2();
    dizi3.forEach(function (value, index, array) {
        document.writeln(`<br/>Değer verisi: ${value} index verisi: ${index} array verisi: ${array}`);
    })
}
//diziFunction8();
//document.writeln("<br/>*************")

///////////////////////////////////////////////////
// Dizi fonksiyonlarını 
// Eklemek  ==> push()-unshift()
// Çıkarmak ==> pop()-shift()
let diziFunction9 = () => {
    const dizi = [11, 66, 77, 22, 33, 44, 55, 88];
    console.log(dizi);

    //Dikkat: push ve pop , unshift ve shift'e göre daha hızlıdır.

    //push ==> Sona 1 tane veri ==> EKLEMEK 
    dizi.push(99);
    console.log(dizi);

    //unshift ==> Başa 1 tane veri ==>EKLEMEK 
    dizi.unshift(10);
    console.log(dizi);

    //pop ==> Sondan 1 tane veri  ==>ÇIKARMAK 
    dizi.pop();
    console.log(dizi);

    //shift ==> Baştan 1 tane veri  ==>ÇIKARMAK 
    dizi.shift();
    console.log(dizi);

    //delete: 
    // indise sıfırdan başlar (0)
    //dizide belirlediğimiz indis numarasında dizi indisindeki elemanı empty yapar
    delete dizi[0];
    console.log(dizi);
}
//diziFunction9();

////////////////

// Dizi fonksiyonlarını 
// sort()    ==> Küçükten büyüğe sıralamak
// reverse() ==> ters yazdırmak
// sort().reverse()==> Büyükten küçüğe sıralamak
let diziFunction10 = () => {
    const dizi = [11, 66, 77, 22, 55, 44, 33, 88];
    console.log(dizi);

    //sort()    ==> Küçükten büyüğe sıralamak
    dizi.sort()
    console.log(dizi);

    //reverse() ==> ters yazdırmak
    dizi.reverse();
    console.log(dizi);

    //sort().reverse()==> Büyükten küçüğe sıralamak
    dizi.sort().reverse();
    console.log(dizi);

    //shift ==> Baştan 1 tane veri  ==>ÇIKARMAK 
    dizi.shift();
    console.log(dizi);
}
//diziFunction10();

///////////////////////////////////////////////////
//toString() join()
let diziFunction11 = () => {
    const dizi = [11, true, 77, "java", 55, 44, 33, 88];
    console.log(dizi);

    //toString() ==> diziyi String'e çeviriyor.
    console.log(dizi.toString());
    console.log(dizi.toString().toUpperCase());
    console.log(typeof dizi.toString());

    //join() ==> diziyi string'e çeviriyor. toString() farklı bizim istediğimiz bir simgeyle string'e çeviriyor.
    console.log(dizi.join(''));
    console.log(dizi.join('*'));
    console.log(dizi.join(' - '));
}
//diziFunction11();

///////////////////////////////////////////////////

//birleştirmek
// +
//concat
let diziFunction12 = () => {
    const dizi1 = [11, 22, 33, 44];
    const dizi2 = [55, 66, 77, 88];

    //birleştirmek
    // Artı(+) bize string bir bileşen oluşturur.
    const dizi3 = dizi1 + dizi2;
    console.log(dizi3);
    console.log(typeof dizi3);

    //concat: dizi eleman sonuna 1 tane veri eklemek
    const dizi4 = dizi1.concat('INC');
    console.log(dizi4);

    //concat: dizileri birleştirmek için kullanıyoruz.
    const dizi5 = dizi1.concat(dizi2);
    console.log(dizi5);
    console.log(typeof dizi5);
}
//diziFunction12();


//////////////////
// slice: Dilimleme demektir.
// sıfırıncı indisten başlar
// bize dizi döndürür
// dizideki verdiğimiz indis numarasından itibaren diziyi kopyalar

let diziFunction13 = () => {
    const dizi1 = [11, 22, 33, 44, 55, 66, 77, 88];
    console.log(dizi1);

    //2 inditen itibaren kopyadı
    let dizi2 = dizi1.slice(2);
    console.log(dizi2);
    console.log(typeof dizi1.slice(2));

    // dizide aralık belirterek dizimi kopyadık
    //0<= X <=2-1
    let dizi3 = dizi1.slice(0, 2);
    console.log(dizi3);
}
//diziFunction13();

//////////////////
// splice: Eklemek
// dizi elemanlarımıza veri eklemek ve/veya veri silmek için kullanıyoruz.
// sıfırıncı indisten başlar
// silinen veriyi döner
let diziFunction14 = () => {
    const dizi1 = [11, 22, 33, 44, 55, 66, 77, 88, 99];
    console.log(dizi1);

    //sadece silmek
    //ilgili indisten başlasın kaç tane sileceğini göstersin
    //3: başlama indisi 
    //1: silinecek adet sayısı
    console.log(dizi1.splice(3, 1));
    console.log(dizi1);
    //result: 44
    //result: [11, 22, 33, 55, 66, 77, 88, 99]

    //////////////
    const dizi2 = [1, 2, 3, 4, 5, 6, 7, 8, 9];
    console.log(dizi2);

    //Hem Silmek hem Eklemek
    //ilgili indisten başlasın kaç tane sileceğini göstersin
    //3: başlama indisi 
    //1: silinecek adet sayısı
    //Eklenecek veri: "Merhabalar"
    console.log(dizi2.splice(3, 1, "Merhabalar"));
    console.log(dizi2);
    //result: [1, 2, 3, 'Merhabalar', 5, 6, 7, 8, 9]

    //////////////
    const dizi3 = [1, 2, 3, 4, 5, 6, 7, 8, 9];
    console.log(dizi3);

    //Hem Silmek hem Eklemek
    //ilgili indisten başlasın kaç tane sileceğini göstersin
    //1: başlama indisi 
    //0: silinecek adet sayısı
    //Eklenecek veri: "Merhabalar"
    console.log(dizi3.splice(1, 0, "Merhabalar"));
    console.log(dizi3);
    //result: [1, 'Merhabalar', 2, 3, 4, 5, 6, 7, 8, 9]
}
//diziFunction14();

///////////////////////////////////////////
// 4-) forEach:
// yazım şekli ==> dizi.forEach(function(value,index,array){}); 
// value: o andaki dizi eleman değerleri, yazmak zorundayız.
// index: dizi eleman indisi ,yazmak zorunda değiliz.(optional)
// array: dizinin kendisidir ,yazmak zorunda değiliz.(optional)
//sadece value
let diziFunction15 = () => {

    const dizi1 = [2, 4, 6, 8, 10];
    let sum = 0;
    dizi1.forEach(function (value) {
        sum += value;
    });

    dizi1.forEach(function (value, index, array) {
        document.writeln("<br/> Değer verisi: " + value + " index verisi: " + index + " array verisi: " + array);
    });

    dizi1.forEach(function (value, index, array) {
        document.writeln(`<br/>Değer verisi: ${value} index verisi: ${index} array verisi: ${array}`);
    })
}
//diziFunction15();

//////////////////////////////////////////
// Dizilerde Filter işlemi
// dizi elemanlardaki koşulları sağlayan verileri çağırmak
// dizi.filter(callback(value,index,array));
// value: o andaki dizi eleman değerleri, yazmak zorundayız.
// index: dizi eleman indisi ,yazmak zorunda değiliz.(optional)
// array: dizinin kendisidir ,yazmak zorunda değiliz.(optional)
// orijinal diziyi bozmuyor.
// 

// aşağıdaki dizi elemanlarından 44 ve üstünde büyük olanları listelemek ?
//elemanlar: 11,22,33,44,55,66,77,88,99
//global variable
//const dizi1=[11,22,33,44,55,66,77,88];
let diziFunction16 = () => {
    document.writeln("<br/>" + dizi1 + "<br/>");

    //iterative 
    let tempArray = [];
    for (let i = 0; i < dizi1.length; i++) {
        if (dizi1[i] >= 44) {
            tempArray[i] = dizi1[i];
        }
    }
    for (const key in tempArray) {
        document.writeln(tempArray[key]);
    }

    //Anonymous Function (ES5)
    let anonymous = dizi1.filter(function (value) {
        return value >= 44;
    });
    document.writeln("<br/>" + anonymous);

    //Arrow Function (ES6)
    let arrow = dizi1.filter((value) => {
        return value >= 44;
    });
    document.writeln("<br/>" + arrow);

}
//diziFunction16();


//////////////////////////////////////////
// Dizilerde Map işlemi
// dizi elemanlardaki her bir dataya erişmek ve bu datalar üzerinde işlem yapabilmek yeteneğine sahiptir.
// map ile işlediğimiz verilerde bize değişime uğramış diziler döner
// dizi.map(callback(value,index,array));
// value: o andaki dizi eleman değerleri, yazmak zorundayız.
// index: dizi eleman indisi ,yazmak zorunda değiliz.(optional)
// array: dizinin kendisidir ,yazmak zorunda değiliz.(optional)
// orijinal diziyi bozmuyor.
//

// aşağıdaki dizi elemanların herbirini 2 ile çarpması elde edelim.
// elemanlar: 11,22,33,44,55,66,77,88,99
// global variable
const dizi2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let diziFunction17 = () => {

    //Anonymous Function (ES5): value
    let anonymousValue = dizi2.map(function (value) {
        return value * 2;
    });
    document.writeln("<br/>" + anonymousValue);

    //Arrow Function (ES6) :value
    let arrowValue = dizi2.map((value) => {
        return value * 2;
    });
    document.writeln("<br/>" + arrowValue);


    //Arrow Function (ES6) :value,index
    //Unutma : index Sıfırdan(0) başlar
    let arrowValueIndex = dizi2.map((value,index) => {
        return value * 2+index;
    });
    document.writeln("<br/>" + arrowValueIndex);
}

diziFunction17();



///////////////////////////////////////////
// callback
// promise
// asyn await

// Object
// ES5-ES6
// DOM
// jquery
// Sıfırdan bir proje FrontEnd


