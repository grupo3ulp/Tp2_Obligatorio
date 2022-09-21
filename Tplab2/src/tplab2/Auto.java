package tplab2;

import static tplab2.Tplab2.leer;

import java.util.InputMismatchException;

public class Auto extends Vehiculo {
    
    public Auto() {
    }

    public Auto(String marca, String patente, Combustible combustible) {
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
    
    //Según la consigna, un auto gasta 7L de combustible cada 100km, calculamos 
    //cuanto combustible gasta en la distancia total del viaje y lo multiplicamos
    //por el precio por litro del combustible cargado.
    @Override
    public double calcularCosteDeCombustible(Double distancia) {
        return (((distancia / 100) * 7)*combustible.getPrecio());
    }

    @Override
    public Auto crearVehiculo() {
        this.combustible = new Combustible();
        System.out.println("Ingrese la marca de su auto");
        marca = leer.next();
        System.out.println("Ingrese el tipo de combustible de su auto");
        combustible.setTipo(leer.next());
        boolean c = false;
        do {
            try {
                System.out.println("Ingrese el precio por litro de su combustible");
                combustible.setPrecio(leer.nextDouble());
                c = true;
            } catch (InputMismatchException e) {
                System.out.println("Opción no válida. Se espera recibir un número.");
                System.out.println("_____________________________________________________________________");
                leer.next();
            }
        } while (!c);
        System.out.println("Ingrese la patente de su auto");
        patente = leer.next();
        return this;
    }


}
