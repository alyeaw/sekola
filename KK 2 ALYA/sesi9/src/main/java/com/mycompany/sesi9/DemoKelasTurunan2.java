/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi9;
class a {
    private int a;
    public void setA(int nilai){
       a = nilai;
   }
   public int getA(){
       return a;
   }
}

class b extends a {
    private int b;
    public void setB(int nilai) {
        b = nilai;
    }
    public int getB(){
        return b;
    }
}
    
class c extends b {
    private int c;
    public void setC(int nilai) {
        c = nilai;
    }
    public int getC(){
        return c;
    }
}

public class DemoKelasTurunan2 {
    public static void main(String[] args) {
        
        c obj = new c();
        
        obj.setA(100);
        obj.setB(200);
        obj.setC(300);
        
        System.out.println("nilai a : " + obj.getA());
        System.out.println("nilai b : " + obj.getB());
        System.out.println("nilai c : " + obj.getC());
    }
}
