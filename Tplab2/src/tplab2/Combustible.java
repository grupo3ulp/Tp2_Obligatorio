
package tplab2;


public class Combustible {
    private String tipo;
    private Double precio;

    public Combustible() {
    }

    public Combustible(String tipo, Double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Combustible{" + "Tipo: " + tipo + ", Precio: " + precio + '}';
    }
    
       
    
}
