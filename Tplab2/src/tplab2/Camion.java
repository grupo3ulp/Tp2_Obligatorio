
package tplab2;


public class Camion extends Vehiculo {

    public Camion() {
    }

    public Camion(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    @Override
    public double calcularCosteDeCombustible(Double distancia) {
        return ((distancia/100)*12);
    }

    
    
    
}
