/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi9;
class A {
    protected int a;
}
class B extends A{
    private int a;
    
    B(int nilai1, int nilai2){
        super.a=nilai1;
        a = nilai2;
    }
    public void tampilkanNilai(){
        System.out.println("nilai a di dalam kelas a : " + super.a);
        System.out.println("nilai a di dalam kelas b : " + a);
    }
}


class DemoSuper3 {
    public static void main(String[] args) {
        
        B obj = new B(121,212);
        obj.tampilkanNilai();
    }
    
}
