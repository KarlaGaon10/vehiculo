/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.progravisual.vehiculo2;

/**
 *
 * @author 59398
 */
public class Vehiculo2 {
  
        
    private String marca;
    private String color;
    private String ruedas;
    
    public Vehiculo2 (String mar,String col,String rued){
        
        marca = mar;
        color = col;
        ruedas = rued;
    }
  
    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setruedas(String rued){
        this.ruedas = rued;
    }
    public String getruedas(){
        return this.ruedas;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }


//desarrollo//
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
