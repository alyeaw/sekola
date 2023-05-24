/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi9;
class kotak {
    protected double panjang;
    protected double lebar;
    protected double tinggi;
    
    kotak(){
        panjang = lebar = tinggi = 0;
    }
    
    kotak(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    public double hitungVolume(){
      return (panjang*lebar*tinggi);  
    }
}
class kotakPejal extends kotak {
    private double berat;
    
    kotakPejal(int p, int l, int t, int b) {
        super(p,l,t);
        
        berat = b;
    }
    
    public double getBerat(){
        return berat;
    }
}

class DemoSuper1 {
    public static void main(String[] args) {
        kotakPejal k = new kotakPejal(6,5,4,2);
        
        System.out.println("Volume k : " + k.hitungVolume());
        System.out.println("Berat k : " + k.getBerat());
    }
    
}
