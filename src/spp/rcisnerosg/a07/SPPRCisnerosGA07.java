/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.rcisnerosg.a07;
import java.util.Scanner;
/**
 *
 * @author RAFAEL ALEJANDRO CISNEROS GUAL IIS
 */
public class SPPRCisnerosGA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // TODO code application logic here        
        int num;
        String [] telefono = new String[10];
        Scanner T = new Scanner (System.in);
        for (int i = 0; i < telefono.length; i++){
            System.out.println ("Introduce el número de telefono " + i);
            telefono[i] = T.nextLine();
        }
        System.out.println("Porfavor introduzca que numero quiere visualizar");
        num = T.nextInt();
        if (num  < telefono.length){
        System.out.println("El número  es " + telefono[num]);
        } else System.out.println("ERROR, NUMERO FUERA DE RANGO.");
    }
    }
    

