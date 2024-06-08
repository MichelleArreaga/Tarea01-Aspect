/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seccionc.Singleton;

/**
 *
 * @author MICHELLE ARREAGA
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){
        
    }
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    public void doSomething(){
        System.out.println("La instancia singleton está haciendo algo ");
    }
    
    
}
