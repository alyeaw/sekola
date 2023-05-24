/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.classnobjek;
class Pembagian {
     int bagi(int a, int b) {
         return a/b;
     }
     
     double bagi(double a, double b){
         return a/b;
     }
}

 class DemoOverload1 {

    public static void main(String[] args) {
        
        Pembagian b = new Pembagian();
        
        int x = b.bagi(10, 4);
        double y =b.bagi(10.0 , 4.0);
        
        System.out.println("hasil bagi type int =" + x);
        System.out.println("hasil bagi type double =" + y);
    }
}
