/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classnobjek;
class stack {
    private final int Max = 10;
    
    private int[] stack = new int[Max];
    private int atas;
    
    stack() {
        atas = -1;
    }
    
    void push(int nilai) {
        if (atas != 9) {
            stack[++atas] = nilai;
        }else {
            System.out.println("Stack penuh...");
        }
    }
    
    int pop(){
        if(atas >= 0){
        return stack[atas--];
    } else {
    System.out.println("Stack masih kosong...");
    return 0;
  }
}
}

class DemoFinal {
    public static void main(String[] args) {
        
        stack s = new stack();
        
        for (int i=1; i<=10; i++){
            s.push(i * 10);
        }
        
        for (int i=1; i<=10; i++){
            System.out.println(s.pop());
        }
    }
    
}
