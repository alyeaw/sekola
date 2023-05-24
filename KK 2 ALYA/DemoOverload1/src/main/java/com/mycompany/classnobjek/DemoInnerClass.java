/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classnobjek;
class Luar {
    private int a;
   
    public void setA(int nilai){
        a = nilai;
    }
    
    public int getA() {
        return a;
    }
    
    class Dalam {
        private int x = 10;
        
        public void showData(){
            System.out.println("nilai dari kelas luar : " + a);
            System.out.println("nilai dari kelas dalm : " + x);
        }
    }
    
    public void showData() {
        
        Dalam obj = new Dalam();
        obj.showData();
    }
}


class DemoInnerClass {
    public static void main(String[] args) {
        
        Luar obj1 = new Luar();
        
        obj1.setA(5);
        obj1.showData();
    }
    
}
