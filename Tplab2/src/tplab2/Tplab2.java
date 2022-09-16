package tplab2;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

public class Tplab2 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        String ciuo, ciud;
        boolean flag = true;
        boolean flag1 = true;

        ArrayList<Ciudad> ciudades = new ArrayList();
        Ciudad c1 = new Ciudad(10, 1d, "Latia");
        Ciudad c2 = new Ciudad(10, 20d, "Luson");
        Ciudad c3 = new Ciudad(10, 55d, "Mani");
        Ciudad c4 = new Ciudad(1, 49d, "Hala");
        Ciudad c5 = new Ciudad(1, 0d, "Dala");
        Ciudad c6 = new Ciudad(9, 20d, "Tamín");
        ciudades.add(c1);
        ciudades.add(c2);
        ciudades.add(c3);
        ciudades.add(c4);
        ciudades.add(c5);
        ciudades.add(c6);

        System.out.println("Bienvenido al calculador de costos de viaje de Turistour!");
        do {
            System.out.println("A continuación seleccione la ciudad de origen de la siguiente lista:");
            for (Ciudad ciudad : ciudades) {
                System.out.println(ciudad);
            }
            ciuo = leer.next();
            for (Ciudad ciudade : ciudades) {
                if (ciudade.getNombre().equalsIgnoreCase(ciuo)) {
                    System.out.println("Ciudad de origen guardada correctamente.");
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

        do {
            System.out.println("A continuación ingrese los datos de su vehículo:");
            System.out.println("¿Qué tipo de vehículo tiene? (Auto, camion, camioneta)");
            String vehi = leer.next();
            if (!vehi.equalsIgnoreCase("auto") && !vehi.equalsIgnoreCase("camion") && !vehi.equalsIgnoreCase("camioneta")) {
                System.out.println("Tipo de vehículo inválido");
            } else {
                switch (vehi) {
                    case "auto":
                        Auto a = new Auto();
                        a.crearVehiculo();
                        break;
                    case "camioneta":
                        Camioneta c = new Camioneta();
                        c.crearVehiculo();
                        break;
                    case "camion":
                        Camion ca = new Camion();
                        ca.crearVehiculo();
                        break;
                }
            }

        } while (flag);

    }

}
