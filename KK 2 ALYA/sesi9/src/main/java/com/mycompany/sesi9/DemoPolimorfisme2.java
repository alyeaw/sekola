/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi9;
class Bentuk{
    public double luas(){
        System.out.println("tidak didefinisikan");
        return 0;
    }
}

class Persegipanjang extends Bentuk{
    private double panjang;
    private double lebar;
    
    Persegipanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }
    
    public double luas(){
        System.out.println("dalam objek persegi panjang:");
        return(panjang*lebar);
    }
}

class Bujursangkar extends Bentuk{
    private double sisi;
    
    Bujursangkar(int s){
        sisi = s;
    }
    
    public double luas(){
        System.out.println("dalam objek bujur sangkar:");
        return (sisi * sisi);
    }   
}
class Segitiga extends Bentuk{
    private double alas;
    private double tinggi;
    
    Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }
    
    public double luas(){
        System.out.println("dalam objek segitiga:");
        return((alas *tinggi)/2);
    }
}

class Lingkaran extends Bentuk{
    private double jarijari;
    
    private final double PI = 3.1416;
   
    Lingkaran(int r){
       jarijari = r;
    }
    
    public double luas(){
        System.out.println("dalam objek persegi lingkaran:");
        return(PI * jarijari * jarijari);
    }
}


public class DemoPolimorfisme2 {
    public static void main(String[] args) {
        
        Bentuk obj;
        
        Persegipanjang pp = new Persegipanjang(5,3);
        Bujursangkar bs = new Bujursangkar(4);
        Segitiga st = new Segitiga(4,3);
        Lingkaran lk = new Lingkaran(2);
        
        obj = pp;
        System.out.println("luas : " + obj.luas());
        System.out.println();
        
        obj = bs;
        System.out.println("luas : " + obj.luas());
        System.out.println();
        
        obj = st;
        System.out.println("luas : " + obj.luas());
        System.out.println();
        
        obj = lk;
        System.out.println("luas : " + obj.luas());
        System.out.println();
    }
    
}
