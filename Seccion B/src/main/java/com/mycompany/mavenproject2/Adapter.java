/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Saikotek
 */
class Adapter implements Target {
	private Adaptee adaptee;

	Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	public void request() {
		adaptee.specificRequest();
	}
}
