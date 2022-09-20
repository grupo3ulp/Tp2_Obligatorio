package tplab2;


public class Ciudad {
    private Integer ruta;
    private Double km;
    private String nombre;

    public Ciudad() {
    }

    public Ciudad(Integer ruta, Double km, String nombre) {
        this.ruta = ruta;
        this.km = km;
        this.nombre = nombre;
    }

    public Integer getRuta() {
        return ruta;
    }

    public void setRuta(Integer ruta) {
        this.ruta = ruta;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + ", ruta " + ruta + ", km " + km;
    }
    
    
    
}
