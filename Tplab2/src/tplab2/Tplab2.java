package tplab2;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

public class Tplab2 {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        String ciuo, ciud;
        boolean flag = true;
        boolean flag1 = true;
        boolean flag3 = true;

        //Creamos un nuevo viaje
        Viaje v = new Viaje();

        //Creamos un ArrayList para guardar todas las ciudades disponibles para elegir
        ArrayList<Ciudad> ciudades = new ArrayList();
        Ciudad c1 = new Ciudad(10, 1d, "Latia");
        Ciudad c2 = new Ciudad(10, 20d, "Luson");
        Ciudad c3 = new Ciudad(10, 55d, "Mani");
        Ciudad c4 = new Ciudad(1, 49d, "Hala");
        Ciudad c5 = new Ciudad(1, 0d, "Dala");
        Ciudad c6 = new Ciudad(9, 20d, "Tamin");
        ciudades.add(c1);
        ciudades.add(c2);
        ciudades.add(c3);
        ciudades.add(c4);
        ciudades.add(c5);
        ciudades.add(c6);

        System.out.println("Bienvenido al calculador de costos de viaje de Turistour!");

        //Le mostramos al usuario todas las ciudades disponibles para que elija la ciudad de origen y destino
        //Una vez que se eligen las 2 ciudades correctamente, se setean en Viaje y se llama al método de calcular distancia.
        do {
            System.out.println("A continuación seleccione la ciudad de origen de la siguiente lista:");
            for (Ciudad ciudad : ciudades) {
                System.out.println(ciudad);
            }
            ciuo = leer.next();
            for (Ciudad ciudade : ciudades) {
                if (ciudade.getNombre().equalsIgnoreCase(ciuo)) {
                    System.out.println("Ciudad de origen guardada correctamente.");
                    v.setCiudadDeOrigen(ciudade);
                    flag = false;
                }
            }

            if (flag) {
                System.out.println("No se encuentra la ciudad de origen.");
            }
            System.out.println("_____________________________________________________________________");
        } while (flag);

        do {
            System.out.println("A continuación seleccione la ciudad de destino de la siguiente lista:");
            for (Ciudad ciudad : ciudades) {
                System.out.println(ciudad);
            }
            ciud = leer.next();
            if (!ciud.equalsIgnoreCase(ciuo)) {
                for (Ciudad ciudade : ciudades) {
                    if (ciudade.getNombre().equalsIgnoreCase(ciud)) {
                        System.out.println("Ciudad de destino guardada correctamente.");
                        v.setCiudadDeDestino(ciudade);
                        v.calcularDistancia();
                        flag1 = false;
                    }
                }
                if (flag1) {
                    System.out.println("No se encuentra la ciudad de destino.");
                }
            } else {
                System.out.println("Ciudad de origen y destino coinciden, elija otra vez.");
            }
            System.out.println("_____________________________________________________________________");
        } while (flag1);


        //Le preguntamos al usuario cuántos peajes hay en el camino y lo seteamos en el atributo del viaje creado.
        System.out.println("¿Cuántos peajes hay entre las ciudades?");
        int peajes = leer.nextInt();
        v.setCantidadDePeajes(peajes);
        System.out.println("_____________________________________________________________________");

        //Acá creamos el vehículo del usuario, chequeamos que sea un vehículo válido y con un switch
        //llamamos a los métodos de "crearVehiculo" específico de cada tipo de vehículo;
        //Para finalizar, seteamos el vehículo creado dentro del atributo vehículo de Viaje.
        do {
            System.out.println("A continuación ingrese los datos de su vehículo:");
            System.out.println("¿Qué tipo de vehículo tiene? (Auto, camion, camioneta)");
            String vehi = leer.next();
            if (!vehi.equalsIgnoreCase("auto") && !vehi.equalsIgnoreCase("camion")
                    && !vehi.equalsIgnoreCase("camioneta")) {
                System.out.println("Tipo de vehículo inválido");
            } else {
                switch (vehi) {
                    case "auto":
                        Auto a = new Auto();
                        a.crearVehiculo();
                        v.setVehiculo(a);
                        flag = false;
                        break;
                    case "camioneta":
                        Camioneta c = new Camioneta();
                        c.crearVehiculo();
                        v.setVehiculo(c);
                        flag = false;
                        break;
                    case "camion":
                        Camion ca = new Camion();
                        ca.crearVehiculo();
                        v.setVehiculo(ca);
                        flag = false;
                        break;
                }
            }

        } while (flag3);
        System.out.println("_____________________________________________________________________");

        //Imprimimos los detalles finales del viaje y todos los costos calculados
        System.out.println("Los detalles de su viaje son los siguientes:");
        System.out.println(v);

        System.out.println("El costo de peajes será igual a: $" + v.calcularCostoDePeaje());
        System.out.println("El costo de combustible será igual a: $" + v.calcularCosteDeCombustible(v.getDistancia()));
        System.out.println("El costo total del viaje será igual a: $" + v.calcularCostoTotal());
    }

}
