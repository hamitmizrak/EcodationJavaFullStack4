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
var degiskenAdi = true;
console.log(degiskenAdi);

// $ ve _ ile başlayabiliriz
var $degiskenAdi = 44;
console.log($degiskenAdi);

var _degiskenAdi = 23.55;
console.log(_degiskenAdi);

// sayılarla ile bitebilir.
var degiskenAdi55 = "Merbalar";
console.log(degiskenAdi55);

// sayı ile ve ($ ve _) haricinden özel simgeyle başlanmaz kullanalım

///////////////////////////////////////
//Typeof: Değiken türünü bize söyler
var str = "Merahbalar";
console.log(typeof str);

var sayi = 44;
console.log(typeof sayi);

var virgul = 44.55;
console.log(typeof virgul);

var karar = true;
console.log(typeof karar);

//NOT: dizi ve object türü ==> objecttir.
var object = {};
console.log(typeof object);

var dizi = [];
console.log(typeof dizi);


///////////////////////////////////////
//whoisting: değişken türünü sonra yaz.
degisken = 55;
var degisken;
console.log(degisken);

///////////////////////////////////////
// var   ==> global ==>
// let   ==> local  ==> ES6 (2015)
// const ==> local  ==> ES6 (2015) ==> Sabit değiştirmezsini

///////////////////////////////////////
//Variable Declaration
//Değer atamadan önce sadece değişken oluşturmaya denir.
var number;
console.log(number);
//result: undefined olarak döner

//variable initialization
// ilk değer ataması anlamına gelir.
// Toplamada etkisiz ==> 0(sıfır) sayıdır.
// Çarpmada etkisiz ==> 1(bir) sayıdır.
var initData="";
//Nullpointer excepiton veya undefined almayız

