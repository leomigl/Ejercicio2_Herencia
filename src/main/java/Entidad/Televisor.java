/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author PC
 */
public class Televisor extends Electrodomestico{
    Electrodomestico ele=new Electrodomestico();
    protected Integer resolucion;
    protected boolean sintonizadorTDT;

    public Televisor(Integer precio,String color,char consumoEnergetico,Integer peso) {
        super(precio, color, consumoEnergetico, peso);
    }

    public Televisor() {
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Televisor{" + "ele=" + ele + ", resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
    public void crearTelevisor(){
        super.CrearElectrodomestico();
        System.out.println("Ingrese la resolucion del TV");
        this.resolucion=leer.nextInt();
        System.out.println("¿Su TV tiene sintonizador TDT?(S/N)");
        String op=leer.next();
        if (op.equalsIgnoreCase("S")) {this.sintonizadorTDT=true;
            System.out.println("El TV tiene sintonizador TDT");
            this.precio=this.precio+500;
        } else {this.sintonizadorTDT=false;
        }precioFinal();
        
    }
    public void precioFinal(){
        if (this.resolucion>40&&this.isSintonizadorTDT()==true) 
        {this.precio=this.precio+this.precio*0.3+500 ;
                }else if (this.resolucion>40&&this.isSintonizadorTDT()==false) {
            this.precio=this.precio+this.precio*0.3;
        }else {this.precio=this.precio;
                }  System.out.println("el precio final del televisores "+this.precio);
       //  ele.setPrecio(this.precio);
    }
}
