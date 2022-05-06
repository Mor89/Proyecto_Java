/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.commit;

import java.util.Scanner;

/**
 *
 * @author Wilso
 */
public class MainSuma {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Suma suma = new Suma();
        System.out.println("Introdusca el primer Numero");
        suma.setA(leer.nextInt());
        
        System.out.println("Introdusca la segunda sifra");
        suma.setB(leer.nextInt());
        System.out.println("-----------------------------");
        
        System.out.println("Total" + suma.suma());
    }
}
