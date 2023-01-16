/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Main;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio2_Herencia {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
       Integer cantlav,canttv;
       Integer cont=0;
       Integer t=4;
       double sumaprecios=0;
       Lavadora lav1=new Lavadora();
       Lavadora lav2=new Lavadora();
       Lavadora lav3=new Lavadora();
       Lavadora lav4=new Lavadora();
       Televisor tv1 =new Televisor();
       Televisor tv2 =new Televisor();
       Televisor tv3 =new Televisor();
       Televisor tv4 =new Televisor();
       ArrayList<Lavadora> lavad; 
       ArrayList<Televisor> tele;
       
        
        System.out.println("Ingrese la cantidad de lavadoras y televisores(no puede superar la cantidad de 4 electrodomesticos)");
        System.out.println("Lavadoras: ");
        cantlav=leer.nextInt();
        switch (cantlav) {
            case 1:
         do{        
        lavad=new ArrayList();
        lav1.crearLavadora();
        sumaprecios=sumaprecios+lav1.getPrecio();
        lavad.add(lav1);
        cont++;
        //lav.setPrecio(0);
        System.out.println("usted creo "+cont+" Lavadora/s");
        }while (cantlav>cont);     
               canttv=t-cantlav;
        System.out.println("la cantidad de televisores a ingresar es de: "+canttv+" ingrese los televisores: ");
        do {
        tele=new ArrayList();
        tv1.crearTelevisor();
        sumaprecios=sumaprecios+tv1.getPrecio();
        tele.add(tv1);
        cont++;
        //tv.setPrecio(0);
         System.out.println("usted creo "+cont+" electrodomesticos,le queda  "+(t-cont)+" Televisor/es");
         tv2.crearTelevisor();
        sumaprecios=sumaprecios+tv2.getPrecio();
        tele.add(tv2);
        cont++;
        //tv.setPrecio(0);
         System.out.println("usted creo "+cont+" electrodomesticos,le queda  "+(t-cont)+" Televisor/es");
        
         tv3.crearTelevisor();
        sumaprecios=sumaprecios+tv3.getPrecio();
        tele.add(tv3);
        cont++;
        //tv.setPrecio(0);
         System.out.println("usted creo "+cont+" electrodomesticos,le queda  "+(t-cont)+" Televisor/es"); }
        while (cont<t);
        
          for (int i = 0; i < lavad.size(); i++) {
           System.out.println("Lavarropas: "+lavad.get(i).getPrecio());
               
        } for (int i = 0; i < tele.size(); i++) {
            System.out.println("Televisor: "+tele.get(i).getPrecio());
        }
        break;
        case 2 :
        do{
       lavad=new ArrayList();
        lav1.crearLavadora();
        sumaprecios=sumaprecios+lav1.getPrecio();
        lavad.add(lav1);
        cont++;
        //lav.setPrecio(0);
        System.out.println("usted creo "+cont+" Lavadora/s");
        
        lav2.crearLavadora();
        sumaprecios=sumaprecios+lav1.getPrecio();
        lavad.add(lav2);
        cont++;
        //lav.setPrecio(0);
        System.out.println("usted creo "+cont+" Lavadora/s");
        }while (cantlav>cont);     
               canttv=t-cantlav;
        System.out.println("la cantidad de televisores a ingresar es de: "+canttv+" ingrese los televisores: ");
        do {
        tele=new ArrayList();
        tv1.crearTelevisor();
        sumaprecios=sumaprecios+tv1.getPrecio();
        tele.add(tv1);
        cont++;
        //tv.setPrecio(0);
         System.out.println("usted creo "+cont+" electrodomesticos,le queda  "+(t-cont)+" Televisor/es");
         tv2.crearTelevisor();
        sumaprecios=sumaprecios+tv2.getPrecio();
        tele.add(tv2);
        cont++;
        //tv.setPrecio(0);
         System.out.println("usted creo "+cont+" electrodomesticos,le queda  "+(t-cont)+" Televisor/es");

            } while (cont<t);
              for (int i = 0; i < lavad.size(); i++) {
           System.out.println("Lavarropas: "+lavad.get(i).getPrecio());
               
        } for (int i = 0; i < tele.size(); i++) {
            System.out.println("Televisor: "+tele.get(i).getPrecio());}
      break;
            case 3:
            do{
       lavad=new ArrayList();
        lav1.crearLavadora();
        sumaprecios=sumaprecios+lav1.getPrecio();
        lavad.add(lav1);
        cont++;
        //lav.setPrecio(0);
        System.out.println("usted creo "+cont+" Lavadora/s");
        
        lav2.crearLavadora();
        sumaprecios=sumaprecios+lav1.getPrecio();
        lavad.add(lav2);
        cont++;
        //lav.setPrecio(0);
        System.out.println("usted creo "+cont+" Lavadora/s");
        lav3.crearLavadora();
        sumaprecios=sumaprecios+lav1.getPrecio();
        lavad.add(lav2);
        cont++;
        //lav.setPrecio(0);
        System.out.println("usted creo "+cont+" Lavadora/s");
        }while (cantlav>cont);     
               canttv=t-cantlav;
        System.out.println("la cantidad de televisores a ingresar es de: "+canttv+" ingrese los televisores: ");
        do {
        tele=new ArrayList();
        tv1.crearTelevisor();
        sumaprecios=sumaprecios+tv1.getPrecio();
        tele.add(tv1);
        cont++;
        //tv.setPrecio(0);
         System.out.println("usted creo "+cont+" electrodomesticos,le queda  "+(t-cont)+" Televisor/es");
        } while (cont<t);
          for (int i = 0; i < lavad.size(); i++) {
           System.out.println("Lavarropas: "+lavad.get(i).getPrecio());
               
        } for (int i = 0; i < tele.size(); i++) {
            System.out.println("Televisor: "+tele.get(i).getPrecio());
        }
                break;
            case 4: 
         do{
       lavad=new ArrayList();
        lav1.crearLavadora();
        sumaprecios=sumaprecios+lav1.getPrecio();
        lavad.add(lav1);
        cont++;
        //lav.setPrecio(0);
        System.out.println("usted creo "+cont+" Lavadora/s");
        
        lav2.crearLavadora();
        sumaprecios=sumaprecios+lav1.getPrecio();
        lavad.add(lav2);
        cont++;
        //lav.setPrecio(0);
        System.out.println("usted creo "+cont+" Lavadora/s");
        lav3.crearLavadora();
        sumaprecios=sumaprecios+lav1.getPrecio();
        lavad.add(lav2);
        cont++;
        //lav.setPrecio(0);
        System.out.println("usted creo "+cont+" Lavadora/s");
        lav4.crearLavadora();
        sumaprecios=sumaprecios+lav1.getPrecio();
        lavad.add(lav4);
        cont++;
        //lav.setPrecio(0);
        System.out.println("usted creo "+cont+" Lavadora/s");
        }while (cantlav>cont);
          for (int i = 0; i < lavad.size(); i++) {
           System.out.println("Lavarropas: "+lavad.get(i).getPrecio());
               
        } 
        
            default:
                do {
        tele=new ArrayList();
        tv1.crearTelevisor();
        sumaprecios=sumaprecios+tv1.getPrecio();
        tele.add(tv1);
        cont++;
        //tv.setPrecio(0);
         System.out.println("usted creo "+cont+" electrodomesticos,le queda  "+(t-cont)+" Televisor/es");
         tv2.crearTelevisor();
        sumaprecios=sumaprecios+tv2.getPrecio();
        tele.add(tv2);
        cont++;
        //tv.setPrecio(0);
         System.out.println("usted creo "+cont+" electrodomesticos,le queda  "+(t-cont)+" Televisor/es");
        
         tv3.crearTelevisor();
        sumaprecios=sumaprecios+tv3.getPrecio();
        tele.add(tv3);
        cont++;
        //tv.setPrecio(0);
         System.out.println("usted creo "+cont+" electrodomesticos,le queda  "+(t-cont)+" Televisor/es"); 
        tv4.crearTelevisor();
        sumaprecios=sumaprecios+tv3.getPrecio();
        tele.add(tv4);
        cont++;
        //tv.setPrecio(0);
         System.out.println("usted creo "+cont+" electrodomesticos,le queda  "+(t-cont)+" Televisor/es");
                }
        while (cont<t);
                for (int i = 0; i < tele.size(); i++) {
            System.out.println("Televisor: "+tele.get(i).getPrecio());}
             break;
        }
        
           System.out.println("La suma de los precios de los electrodomesticos es de: "+sumaprecios);  
        
        }
          
    
        } 

