/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.nledezmam.a07;
import java.util.Scanner;
/**
 *
 * @author normaledezma
 */
public class SPP2NLedezmaMA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables
        int cons, num, count;
        
        Long [] agenda = new Long [10];
        Scanner tecl = new Scanner(System.in);
        for (int i=0; i<agenda.length; i++){
            agenda [i] = Ptel("Introduce el número telefónico de la persona " + (i + 1));
        }
        System.out.println("¿Cuántos números vas a consultar?");
        num=tecl.nextInt();
        count= 0;
        do{
        count=count+1;
        System.out.println("¿Qué numero quieres consultar?");
        cons = (tecl.nextInt())-1;
        if (cons>=agenda.length){
        System.out.println("Introduce un número dentro del rango");
        }
        else System.out.println(agenda[cons]);
        } while (count<num);
    }
public static long Ptel(String mensaje){
        Scanner tecl = new Scanner (System.in);
        long varLong = 0;
        boolean flag;
        
        do{
        System.out.println(mensaje);
        try{
        varLong = tecl.nextLong();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introduzca un número válido");
            flag=true;
            tecl.nextLine();
    } 
  } while (flag); 
    return varLong;
    }
}
