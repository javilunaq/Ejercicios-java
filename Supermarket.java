/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

import java.util.ArrayList;

/**
 *
 * @author jlunaque
 */
public class Supermarket {
     private ArrayList<Product> products = new ArrayList();
     private String name;
     
    public Supermarket(){
        
    }
    
    public Supermarket(String name){
        this.name = name;
    }
    
    public ArrayList<Product> getProducts(){
        return products;
    }
    
    public void addProduct(Product product){
        products.add(product);
    }
    
    public void printProducts(){
        for(int i=0; i<products.size(); i++){
            System.out.println(products.get(i).getName());
            System.out.println(products.get( i).getPrize());
        }
    }
}
