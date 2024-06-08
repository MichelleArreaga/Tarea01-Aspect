/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author Julian Ruiz
 */
public class Singleton {
    private static Singleton instance;
    
    private Singleton(){
        //Constructor privado para evitar instancias directas
    }
    
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    
    public void doSomething(){
        System.out.println("Haciendo algo en Singleton");
    }
    
    public class Main{
         public static void main(String[]args){
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        //Ambos apuntan a la misma instancia
        System.out.println(s1==s2);//Debe ser true
        s1.doSomething();
    }
    }
}
