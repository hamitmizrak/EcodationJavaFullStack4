package com.hamitmizrak.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

//Semophore Class
public class SemophoreExamples {

    private int connectionCount = 0;
    private Semaphore semaphore = new Semaphore(3);

    //singleton class
    private static SemophoreExamples instance = new SemophoreExamples();

    //parametresiz constructor
    private SemophoreExamples() {
    }

    //singleton getter
    public static SemophoreExamples getInstance() {
        return instance;
    }

    public void connect() throws InterruptedException {
        //acquire:izin istemek
        semaphore.acquire();

        try {
            getConnectMethod();
        } finally {
            semaphore.release();
        }
    }

    private void getConnectMethod() throws InterruptedException {
        synchronized (this) {
            connectionCount++;
            System.out.println("Bağlantı sayısı: " + connectionCount);
        }
        Thread.sleep(1000);
        synchronized (this) {
            connectionCount--;
        }
    }
}

//PSVM
class Application {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                try {
                    SemophoreExamples.getInstance().connect();
                } catch (InterruptedException e) {
                }
            });
        }

        executorService.shutdown();
    }

}

