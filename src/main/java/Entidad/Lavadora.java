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
public class Lavadora extends Electrodomestico{
    Electrodomestico ele=new Electrodomestico();
    
    protected Integer carga;

    public Lavadora(Integer precio,String color,char consumoEnergetico,Integer peso) {
        super(precio, color, consumoEnergetico, peso);
    }

    public Lavadora() {
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }

    public void crearLavadora(){
       
       super.CrearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora ");
        this.carga=leer.nextInt();
        precioFinal();
        }
    public void precioFinal(){
        
        if (this.carga>30) {
            this.precio=this.precio+500;
            }
      //  ele.setPrecio(this.precio);
    
        System.out.println("El consumo energetico es: '"+this.consumoEnergetico+"'\n"
                + "El color es: '"+ this.color +"' \n"
                        + "y el peso es "+this.peso+"\n"
        + "El precio final será: $"+this.precio );
   }

}
