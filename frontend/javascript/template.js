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
var varible;
console.log(varible);

//Infinity: Sonsıuz,tanımsız
//Çözümü: Sıfıra bölmemek
var number=4/0;
console.log(number);

//NaN: Not A Number
//Çözümü: Bütün değerler sayı olmalıdır veya cast etmeliyiz.
var result=4/"asd";
console.log(result);

//isNaN: is not a number:  bir sayı değildir.
//false: bu bir sayıdır anlamına gelir.
console.log(isNaN(44));

//new  : hafızadan bir yer açmak
//null : hafızadaki yeri kapatmak
//zero : hafızada bir yere sahip ancak değeri sıfır
///////////////////////////////////////
// Escape Character: Çıkış karakteri demektir.
// Escape Character: Back Slash (\)
// Bazen özel simgelerimizi işlem yapmadığımız durumlarda imdadımıza koşar
// single quote:    \'
// multiple quote:   \"
console.log("1.satır\n2.satır");
console.log("1.satır\n\t2.satır");

///////////////////////////////////////
//JavaScript Keywords:
//break    : döngü durdurmak için
//return   : metotu durdurmak ve değer almak için
//continue : sadece o anda çalışma sonrasında döngüde devam et
//debugger : debug atarken kullanıyoruz.

///////////////////////////////////////
//Math:



















