
package tplab2;

import java.util.Scanner;

public class Viaje {
    private Ciudad ciudadDeOrigen;
    private Ciudad ciudadDeDestino;
    private Vehiculo vehiculo;
    private Integer cantidadDePeajes;
    private Double distancia;

    public Viaje() {
    }

    public Viaje(Ciudad ciudadDeOrigen, Ciudad ciudadDeDestino, Vehiculo vehiculo, Integer cantidadDePeajes,
            Double distancia) {
        this.ciudadDeOrigen = ciudadDeOrigen;
        this.ciudadDeDestino = ciudadDeDestino;
        this.vehiculo = vehiculo;
        this.cantidadDePeajes = cantidadDePeajes;
        this.distancia = distancia;
    }

    public Viaje(Ciudad ciudadDeOrigen, Ciudad ciudadDeDestino, Vehiculo vehiculo, Integer cantidadDePeajes) {
        this.ciudadDeOrigen = ciudadDeOrigen;
        this.ciudadDeDestino = ciudadDeDestino;
        this.vehiculo = vehiculo;
        this.cantidadDePeajes = cantidadDePeajes;
    }

    public Ciudad getCiudadDeOrigen() {
        return ciudadDeOrigen;
    }

    public void setCiudadDeOrigen(Ciudad ciudadDeOrigen) {
        this.ciudadDeOrigen = ciudadDeOrigen;
    }

    public Ciudad getCiudadDeDestino() {
        return ciudadDeDestino;
    }

    public void setCiudadDeDestino(Ciudad ciudadDeDestino) {
        this.ciudadDeDestino = ciudadDeDestino;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Integer getCantidadDePeajes() {
        return cantidadDePeajes;
    }

    public void setCantidadDePeajes(Integer cantidadDePeajes) {
        this.cantidadDePeajes = cantidadDePeajes;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    //Se verifica primero si las ciudades están sobre la misma ruta, en ese caso, se calcula
    //la distancia restando ambos kilometrajes y devolviendo el valor absoluto del mismo.
    //En caso de que no estén sobre la misma ruta, se le pide la distancia al usuario.
    public void calcularDistancia() {
        Scanner leer = new Scanner(System.in);
        if (ciudadDeOrigen.getRuta() == ciudadDeDestino.getRuta()) {
            distancia = Math.abs((ciudadDeDestino.getKm() - ciudadDeOrigen.getKm()));
        } else {
            System.out.println("¿Qué distancia hay entre la ciudad de origen y la de destino?");
            distancia = leer.nextDouble();
        }

    }

    // Todos los peajes tienen un costo fijo según el tipo de vehículo
    // Los autos y camionetas pagan $100 y los camiones $150
    public Double calcularCostoDePeaje() {
        if (this.vehiculo instanceof Camion) {
            return (double) (this.cantidadDePeajes * 150);
        } else {
            return (double) (this.cantidadDePeajes * 100);
        }

    }

    //Se suman el costo del combustible y el costo del peaje
    public double calcularCostoTotal() {
        return calcularCosteDeCombustible(distancia) + calcularCostoDePeaje();

    }

    //Se le pasa por parámetro la distancia previamente calculada y se llama a
    //los métodos específicos de las subclases para calcular el combustible
    public double calcularCosteDeCombustible(Double distancia) {
        return this.vehiculo.calcularCosteDeCombustible(distancia);
    }

    @Override
    public String toString() {
        return "Viaje [cantidadDePeajes=" + cantidadDePeajes + ", ciudadDeDestino=" + ciudadDeDestino
                + ", ciudadDeOrigen=" + ciudadDeOrigen + ", distancia=" + distancia + ", vehiculo=" + vehiculo + "]";
    }

}
