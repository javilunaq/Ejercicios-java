/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

/**
 *
 * @author jlunaque
 */
public abstract class Shapes {
    protected double base;
    protected double height;
    
    public Shapes(){
        
    }
    
    public Shapes(double base, double height){
        this.base = base;
        this.height = height;
    }
    
    public abstract double Perimetro();
    
    public abstract double Area();
    
}
