
package com.mycompany.commit;


public class Suma {
    int a = 0;
    int b = 0;
    int total;

    public Suma() {
    }

    public Suma(int total) {
        this.total = total;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getTotal() {
        return total;
    }
   
    int suma (){
        total = a + b;
        return total;
    }
    
}
