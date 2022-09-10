package com.hamitmizrak.javase;

public class _30_Generics<T> {
    //Global variable
    private T data;

    //parametresiz constructor
    public _30_Generics() {
    }

    //parametreli constructor
    public _30_Generics(T data) {
        this.data = data;
    }

    //generics method
    public <K> void genericsMethod(K name,Object surname){
        System.out.println(name+" "+surname);
    }

    //generics getter
    public T getData() {
        return data;
    }

    //generics setter
    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        //dynamics type
        //1-) var variable //Java 10 ile geldi
        var b1 = "44";
        System.out.println(b1);

        //2-) object variable
        Object obj = "44";
        System.out.println(obj);

        //3-) Generics bileşenler kullanmak
        _30_Generics instance1 = new _30_Generics();
        instance1.setData(44);
        int genericsObject = (int) instance1.getData();
        System.out.println(genericsObject);

        instance1.genericsMethod("Hamit",44);

    }

}
