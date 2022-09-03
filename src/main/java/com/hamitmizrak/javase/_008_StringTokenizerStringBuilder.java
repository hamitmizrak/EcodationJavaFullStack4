package com.hamitmizrak.javase;

import java.util.StringTokenizer;

public class _008_StringTokenizerStringBuilder {

    public static void main(String[] args) {

        //inşa etmek
        StringBuilder sb = new StringBuilder();
        sb.append("java ").append("jsp ").append("jsf ");
        String data = sb.toString();
        System.out.println(data);

        String kelime="merhabalar data $JSP _JSF &SpringBoot";
        StringTokenizer tokenizer=new StringTokenizer(kelime,"&_$ ");
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }

    }
}