/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema4;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class Problema4 {

    public static void main(String[] args) {
        /*
        solicitar la cantidad de litros para hacer la conversion
        */
        Scanner litros = new Scanner (System.in);
        int l;
        System.out.println("ingresa la cantidad de litros");
        l = litros.nextInt();
        
        Scanner pgalon = new Scanner(System.in);
        float pg;
        System.out.println("ingresa el precio por galon");
        /*
         * segundo cambio
         */
        pg = pgalon.nextInt();
        float galon;
        float total;
        /*
        realizar la conversion para conocer el precio por galones
        */
        galon = l / 3.785f;
        total = galon * pg ;
        
        /*
        mostrar en pantalla el total a cobrar 
        */
        System.out.println("este el el total a cobrar "+total);
    }
}
