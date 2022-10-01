package com.hamitmizrak.javase;

public class _016_AccessModifier1 {
    public String publicData = "public Data 44";
    protected String protectedData = "protected Data 44";
    private String privateData = "private Data 44";
    String defaultData = "default Data 44";

    //getter Setter (Encapsulation)
    public String getPrivateData() {
        return privateData;
    }

    public _016_AccessModifier1 setPrivateData(String privateData) {
        this.privateData = privateData;
        return this;
    }

    public static void main(String[] args) {
        _016_AccessModifier1 instance1 = new _016_AccessModifier1();
        System.out.println(instance1.publicData);
        System.out.println(instance1.protectedData);
        System.out.println(instance1.privateData);
        System.out.println(instance1.defaultData);
    }
}