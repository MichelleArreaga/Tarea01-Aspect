/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seccionc.Singleton;

/**
 *
 * @author MICHELLE ARREAGA
 */
public class Main {
    public static void main(String[]args){
        Singleton singleton1= Singleton.getInstance();
        Singleton singleton2= Singleton.getInstance();
        
        singleton1.doSomething();
        singleton2.doSomething();
        
        System.out.println(singleton1==singleton2);
    }
}
