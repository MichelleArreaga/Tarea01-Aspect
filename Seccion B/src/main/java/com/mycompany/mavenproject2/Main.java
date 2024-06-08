/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

public class Main {

	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
                Target target = new Adapter(adaptee);
                target.request();

	}
}

