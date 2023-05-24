/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi9;
class Penyanyi {
    public void bernyanyi(){
        System.out.println("karakteristik nadanya " +
        "belum didefinisikan");
    }
}

class PenyanyiJazz extends Penyanyi {
    public void bernyanyi(){
        System.out.println("bernyanyi dengan irama jazz");
        
    }
}
class PenyanyiPop extends Penyanyi {
    public void bernyanyi(){
        System.out.println("bernyanyi dengan irama pop");
    }
}

class PenyanyiDangdut extends Penyanyi {
    public void bernyanyi(){
        System.out.println("bernyanyi dengan irama dangdut");
    }
}


class DemoPolimorfisme {
    public static void main(String[] args) {
        
        Penyanyi p;
        
        PenyanyiJazz musmujiono = new PenyanyiJazz();
        PenyanyiPop audi = new PenyanyiPop();
        PenyanyiDangdut inul = new PenyanyiDangdut();
        
        p = musmujiono;
        p.bernyanyi();
        
        p = audi;
        p.bernyanyi();
        
        p = inul;
        p.bernyanyi();
               
        
    }
    
}
