package com.hamitmizrak.oop.interfacex;

import com.hamitmizrak.oop.inheritancex.Computer;

public class MainComputer implements IComputerData {
    @Override
    public void createComputer(String name) {
        System.out.println("create"+name);
    }

    @Override
    public void deleteComputer(Long id) {
        System.out.println("delete"+id);
    }

    @Override
    public void updateComputer(Computer computer) {
        System.out.println("update"+computer);
    }

    @Override
    public void ListComputer() {
        System.out.println("List");
    }
}
