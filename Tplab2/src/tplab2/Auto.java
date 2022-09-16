
package tplab2;


public class Auto extends Vehiculo {

    public Auto() {
    }

    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    @Override
    public double calcularCosteDeCombustible(Double distancia) {
        return ((distancia/100)*7);
    }

    
    
}
