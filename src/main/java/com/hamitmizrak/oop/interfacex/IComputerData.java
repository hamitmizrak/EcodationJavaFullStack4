package com.hamitmizrak.oop.interfacex;

import com.hamitmizrak.oop.inheritancex.Computer;

//Sözleşme:
public interface IComputerData {
    public void createComputer(String name);
    public void deleteComputer(Long id);
    public void updateComputer(Computer computer);
    public void ListComputer();
}
