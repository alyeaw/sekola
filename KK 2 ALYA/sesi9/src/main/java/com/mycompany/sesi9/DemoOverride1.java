/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi9;
class A{
    private int a;
    
    public void setA(int nilai){
        a = nilai;
    }
    
    public int getA(){
        return a;
    }
    
    public void tampilkanNilai(){
        System.out.println("nilai a: " + getA());
    }
}

class B extends A {
    private int b;
    
    public void setB(int nilai){
        b = nilai;
    }
    
    public int getB(){
        return b;
    }
    
    public void tampilkanNilai(){
        System.out.println("nilai b: " + getB());
    }
            
}

class DemoOverride1 {
    public static void main(String[] args) {
        B obj = new B();
        
        obj.setA(100);
        obj.setB(200);
        
        obj.tampilkanNilai();
    }
    
}
