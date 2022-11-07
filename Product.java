/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

/**
 *
 * @author jlunaque
 */
public class Product {
    protected double prize;
    protected String name;
    
    public Product(){
        
    }
    
    public Product(double prize, String name){
        this.prize = prize;
        this.name = name;
    }

    public double getPrize() {
        return prize;
    }

    public String getName() {
        return name;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
