/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

/**
 *
 * @author Julian Ruiz
 */
public class Acustica extends Guitarra{

    @Override
    public void tocar() {
        System.out.println("Tocando Guitarra Acustica");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando Guitarra Acustica");
    }

    @Override
    public void parar() {
        System.out.println("Dejar de tocar Guitarra Acustica");
    }
    
}
