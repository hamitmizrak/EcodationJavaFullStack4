package com.hamitmizrak.javase;

import lombok.Getter;
import lombok.Setter;

// Classlarda;
// 1-) 1 tane public class vardır ==> (inner class hariç)
// 2-) static class yazamazsınız ==> (inner class hariç)
// 3-) classlarda access modifier olarak public veya default(friendly) yazabilirsiniz
// private class Deneme{}  veya  protected class Deneme{} ==> Yazamayız.
public class _027_Country {
    @Getter @Setter
   private String countryName;

    //inner class
    public static class City{
        @Getter @Setter
        private String cityName;

    } //end City
}//end Country

class  MainClass{
    public static void main(String[] args) {
        _027_Country country=new _027_Country();
        country.setCountryName("Türkiye");

        _027_Country.City city=new _027_Country.City();
        city.setCityName("Bursa");

        System.out.println(country.getCountryName()+" "+city.getCityName());
    }
}
