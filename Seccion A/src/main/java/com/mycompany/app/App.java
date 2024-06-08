/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.app;

/**
 *
 * @author Julian Ruiz
 */
public class App {

    public void tocarGuitarraAcustica(){
        Guitarra  guitarraAcustica= new Acustica();
        guitarraAcustica.afinar();
        guitarraAcustica.tocar();
        guitarraAcustica.parar();
    }
    
     public void tocarGuitarraElectrica(){
        Guitarra  guitarraElectrica= new ElectricaAdapter();
        guitarraElectrica.afinar();
        guitarraElectrica.tocar();
        guitarraElectrica.parar();
    }
}
