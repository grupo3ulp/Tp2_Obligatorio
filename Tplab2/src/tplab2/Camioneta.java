
package tplab2;

import static tplab2.Tplab2.leer;


public class Camioneta extends Vehiculo { 


    public Camioneta() {
    }

    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }
    
    

    @Override
    public double calcularCosteDeCombustible(Double distancia) {
        return (((distancia/100)*10)*combustible.getPrecio());
    }
    
    @Override
    public Camioneta crearVehiculo() {
        this.combustible = new Combustible();
        System.out.println("Ingrese la marca de su camioneta");
        marca = leer.next();
        System.out.println("Ingrese el tipo de combustible de su camioneta");
        combustible.setTipo(leer.next());
        System.out.println("Ingrese el precio por litro de su combustible");
        combustible.setPrecio(leer.nextDouble());
        System.out.println("Ingrese la patente de su camioneta");
        patente = leer.next();
        return this;
    }

    
    
    
}
