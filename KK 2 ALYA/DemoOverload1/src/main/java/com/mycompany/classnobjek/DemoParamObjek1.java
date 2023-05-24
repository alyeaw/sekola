/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classnobjek;
class Kotak {
    double panjang;
    double lebar;
    double tinggi;
    
    Kotak(double p, double l, double t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    double hitungVolume(){
        return(panjang * lebar * tinggi);
    }
    
    boolean sama(Kotak k)  {
        if ((k.panjang == this.panjang)&&
            (k.lebar == this.lebar)&&
            (k.tinggi == this.tinggi)) {
         return true;  
        } else {
            return false;
        }          
    }
}

 class DemoParamObjek1 {
     public static void main(String[] args) {
         
         Kotak k1, k2, k3, k4;
         
         k1 = new Kotak(4, 3, 2);
         k2 = new Kotak(6, 5, 4);
         k3 = new Kotak(4, 3, 2);
         k4 = new Kotak(6, 5, 4);
         
         System.out.println("k1 == k2 : " + k1.sama(k2));
         System.out.println("k1 == k3 : " + k1.sama(k3));
         System.out.println("k2 == k4 : " + k2.sama(k4));
         
     }
    
}
