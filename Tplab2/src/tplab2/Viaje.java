
package tplab2;


public class Viaje {
    private Ciudad ciudadDeOrigen;
    private Ciudad ciudadDeDestino;
    private Vehiculo vehiculo;
    private Integer cantidadDePeajes;
    private Integer distancia;

    public Viaje() {
    }

    public Viaje(Ciudad ciudadDeOrigen, Ciudad ciudadDeDestino, Vehiculo vehiculo, Integer cantidadDePeajes, Integer distancia) {
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

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }
    
    public void calcularDistancia(){
        
    }
    
    public void calcularCostoDePeaje(){
        
    }
    
    public void calcularCostoTotal(){
        
    }
    
        public double calcularCosteDeCombustible(Double distancia) {
        return 0d;
    }
    
}
