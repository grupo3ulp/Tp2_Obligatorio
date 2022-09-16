package tplab2;

import static tplab2.Tplab2.leer;

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
    
    
    @Override
    public double calcularCosteDeCombustible(Double distancia) {
        return ((distancia / 100) * 7);
    }

    @Override
    public Auto crearVehiculo() {
        this.combustible = new Combustible();
        System.out.println("Ingrese la marca de su vehículo");
        marca = leer.next();
        System.out.println("Ingrese el tipo de combustible de su vehículo");
        combustible.setTipo(leer.next());
        System.out.println("Ingrese el precio por litro de su combustible");
        combustible.setPrecio(leer.nextDouble());
        System.out.println("Ingrese la patente de su auto");
        patente = leer.next();
        return this;
    }

}
