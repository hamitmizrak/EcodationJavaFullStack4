package com.hamitmizrak.oop;

// 1 tane public class vardır (inner class Hariç)
// static class yoktur (inner class Hariç)

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    //Field (Global variable)
    private String productName;
    private String productCode;
    private int productPrice;

    //Method
    public void methodData() {
        System.out.println("metot data");
    }

    //PSVM
    public static void main(String[] args) {
        Product product =  Product.builder()
                .productName("Product Name44")
                .productCode("Product Code44")
                .build();
        product.setProductPrice(55);
        System.out.println(product);
    }
}
