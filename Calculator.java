/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

/**
 *
 * @author jlunaque
 */
public class Calculator {
    private Operator operation;
    
    public Calculator(){
    }

    public void setOperation(Operator operation) {
        this.operation = operation;
    }
    
    public double operate(){
        return operation.operate();
    }
}
