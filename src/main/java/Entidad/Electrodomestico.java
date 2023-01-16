/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;



/**
 *
 * @author PC
 */
public class Electrodomestico {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Integer peso;

    public Electrodomestico() { 
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "leer=" + leer + ", precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    public void ComprobarConsumoEnergetico(char letra){
        
       switch (letra) {
            case 'A':this.consumoEnergetico=letra;
                break;
            case 'B':this.consumoEnergetico=letra;
                break;
            case 'C':this.consumoEnergetico=letra;
                break;
            case 'D':this.consumoEnergetico=letra;
                break;
            case 'E':this.consumoEnergetico=letra;
                break;
            case 'F':this.consumoEnergetico=letra;
                break;
            default:
                 this.consumoEnergetico='F';
       }
    }
public void comprobarColor(String c){
   
    if (c.equalsIgnoreCase("negro")|| c.equalsIgnoreCase("rojo")|| c.equalsIgnoreCase("azul")|| c.equalsIgnoreCase("gris")) {
        color=c;
        setColor(color);
        } else { color="blanco";setColor(color);
    }
   
}
 public void CrearElectrodomestico(){
     char letra;
     System.out.println("ingrese el color del electrodomestico (blanco, negro, rojo,azul y gris) ");
    String c=leer.next(); 
     comprobarColor(c);
     System.out.println("ingrese el consumo(A, B, C, E o F )");
     letra=leer.next().toUpperCase().charAt(0);
     ComprobarConsumoEnergetico(letra);
     precioFinal(letra);
     System.out.println("el precio por consumo energetico y por tamaño es "+this.precio+" el color es "+this.color+" y el peso es "+this.peso );
}
 public void precioFinal(char letra){
     
     switch (letra) {
          case 'A':
                this.precio += 2000;
                break;
            case 'B':
                this.precio += 1800;
                break;
            case 'C':
                this.precio += 1600;
                break;
            case 'D':
                this.precio += 1500;
                break;
            case 'E':
               this.precio += 1300;
                break;
            case 'F':
                this.precio += 1100;
                break;
            default:
                this.precio = 2000;

         
                     
     }
     
     
     System.out.println("ingrese el peso en kilogramos");
     this.peso=leer.nextInt();
    
     if (this.peso<20) {this.precio=this.precio+100;  
     }
     else if (this.peso>=20&&this.peso<=49) {this.precio=this.precio+500; 
        }
    else if (this.peso>=50&&this.peso<=80) {this.precio=this.precio+800;
         }
    else if (this.peso>80) {this.precio=this.precio+1000;
        
     }
     
 } 
    
    
}
