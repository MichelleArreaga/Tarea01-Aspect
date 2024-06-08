/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seccionc.Singleton;

/**
 *
 * @author MICHELLE ARREAGA
 */
public class SingleAspect {
    private Singleton instance;
    
    public void createSingletonInstance(){
        if(instance==null){
            instance=Singleton.getInstance();
        }
    }
}
 
