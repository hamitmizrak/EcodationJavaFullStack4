package com.hamitmizrak.javase;

import lombok.extern.log4j.Log4j2;
import java.io.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
// Absolute Path: Statiktir.
//Relative PAth: Dinamiktir.
// URL: Uniform Resource Loader
// URI: Uniform Resource Identifier
@Log4j2
public class _029_FileIO {
    private static final String PATH = "C:\\0_Tutorials\\fileio\\form.txt";
    private static Scanner klavye = new Scanner(System.in);

    //Kullanıcıdan veri almak
    private static String userData() {
        System.out.println("Birşeyler yazınız");
        String data = klavye.nextLine();
        Date date = new Date();
        return "[ " + date + "] " + data;
    }

    //Writer
    private static void fileWriterData() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH, true))) {
            String result = userData();
            bufferedWriter.write("\n" + result);
            bufferedWriter.flush();
        } catch (IOException io) {
            io.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Reader
    private static void fileReaderData() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))) {

            StringBuilder stringBuilder=new StringBuilder();
            String rows="";

            while(   (rows= bufferedReader.readLine()) !=null ){
                stringBuilder.append(rows).append(" \n");
            }
            String data=stringBuilder.toString();
            log.info(data);
        }catch (IOException io) {
            io.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //PSVM
    public static void main(String[] args) {
        //fileWriterData();
        fileReaderData();
    }
}
