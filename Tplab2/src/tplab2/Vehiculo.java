package tplab2;

public abstract class Vehiculo<T> {

    protected String marca;
    protected String patente;
    protected Combustible combustible;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String patente, Combustible combustible) {
        this.marca = marca;
        this.patente = patente;
        this.combustible = combustible;
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

    public double calcularCosteDeCombustible(Double distancia) {
        return 0d;
    }

    public abstract T crearVehiculo();

    @Override
    public String toString() {
        return "\t"+"+ Combustible: " + combustible+"\n"
                +"\t"+"+ Marca: " + marca +"\n"
                +"\t"+"+ Patente: " + patente;
    }
    

}
