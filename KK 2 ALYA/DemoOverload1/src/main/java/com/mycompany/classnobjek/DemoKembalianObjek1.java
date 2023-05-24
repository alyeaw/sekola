/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classnobjek;
class Kotax {
    double panjang;
    double lebar;
    double tinggi;
    
    Kotax(double p, double l, double t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    double hitungVolume(){
        return(panjang * lebar * tinggi);
    }
    
    Kotax perbesar(int M) {
        Kotax temp = new Kotax(panjang*M, lebar*M, tinggi*M);
        return temp;
    }
}

class DemoKembalianObjek1 {
    public static void main(String[] args) {
        
        Kotax kOriginal, kBaru;
        
        kOriginal = new Kotax(4, 3, 2);
        
        kBaru = kOriginal.perbesar(2);
        
        System.out.println("nilai pada objek kOriginal:");
        System.out.println("panjang\t: " + kOriginal.panjang);
        System.out.println("lebar\t: " + kOriginal.lebar);
        System.out.println("tinggi\t: " + kOriginal.tinggi);
        System.out.println("Volume\t: " + kOriginal.hitungVolume());
        
        System.out.println("nilai pada objek pada kBaru");
        System.out.println("panjang\t: " + kBaru.panjang);
        System.out.println("lebar\t: " + kBaru.lebar);
        System.out.println("tinggi\t: " + kBaru.tinggi);
        System.out.println("Volume\t: " + kBaru.hitungVolume());
        

        
    }
}
    

