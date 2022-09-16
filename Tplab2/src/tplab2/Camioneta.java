
package tplab2;


public class Camioneta extends Vehiculo { 


    public Camioneta() {
    }

    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    @Override
    public double calcularCosteDeCombustible(Double distancia) {
        return ((distancia/100)*10);
    }

    
    
    
}
