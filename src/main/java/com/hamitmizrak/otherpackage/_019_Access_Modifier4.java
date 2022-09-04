package com.hamitmizrak.otherpackage;

import com.hamitmizrak.javase._016_AccessModifier1;

public class _019_Access_Modifier4 extends  _016_AccessModifier1 {

    public static void main(String[] args) {
        _016_AccessModifier1 instance1=new _016_AccessModifier1();
        System.out.println(instance1.publicData);
       // System.out.println(instance1.protectedData);
        //encapsulation
        System.out.println(instance1.getPrivateData());
        //  System.out.println(instance1.defaultData);
    }

}
