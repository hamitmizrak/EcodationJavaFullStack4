package com.hamitmizrak.javase;

import lombok.Getter;
import lombok.Setter;

public class _028_Thread extends Thread{

    @Getter @Setter
    private String className;

    public _028_Thread() {
    }

    public _028_Thread(String className) {
        this.className = className;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 1; i <=10 ; i++) {
            try {
                Thread.sleep(1000);

                if(i==1){
                    System.out.println("\n ###Başlangıç###");
                    System.out.println(this.className+"\n");
                }
                else if(i==10){
                    System.out.println("\n ###Bitiş###");
                    System.out.println(this.className+"\n");
                }else{
                    System.out.println(this.className);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //PSVM
    public static void main(String[] args) {
        _028_Thread instance1=new _028_Thread("1.instance");
        _028_Thread instance2=new _028_Thread("2.instance");
        _028_Thread instance3=new _028_Thread("3.instance");

        System.out.println("### INSTANCE: "+instance1.isAlive());
        instance1.start();
        System.out.println("### INSTANCE: "+instance1.getId());
        System.out.println("### INSTANCE: "+instance1.getName());
        System.out.println("### INSTANCE: "+instance1.hashCode());
        System.out.println("### INSTANCE: "+instance1.isAlive());
        instance2.start();
        instance3.start();
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
    }
}

class Thread3{
    Thread thread=new Thread(new Runnable() {
        @Override
        public void run() {

        }
    });
}