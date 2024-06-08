/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

/**
 *
 * @author Julian Ruiz
 */
public class ElectricaAdapter extends Guitarra {
    private Electrica guitarraElectrica;
    
    public ElectricaAdapter(){
        this.guitarraElectrica= new Electrica();
    }

    @Override
    public void tocar() {
        this.guitarraElectrica.conectar();
        this.guitarraElectrica.encender();
        System.out.println("Tocando Guitarra Electrica");
    }

    @Override
    public void afinar() {
        this.guitarraElectrica.afinar();
    }

    @Override
    public void parar() {
        this.guitarraElectrica.apagar();
        this.guitarraElectrica.desconectar();
        System.out.println("Dejar de tocar Guitarra Electrica");
    }
    
}
