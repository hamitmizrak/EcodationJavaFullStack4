package com.hamitmizrak.java8tutorials;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class Student {

    private Long id;
    private String username;
    private String surname;
    private int  number;

    public Student() {
    }

    public Student(Long id, String username, String surname, int number) {
        this.id = id;
        this.username = username;
        this.surname = surname;
        this.number = number;
    }

    public void numberMethod(){
        System.out.println(this.number);
    }
}
