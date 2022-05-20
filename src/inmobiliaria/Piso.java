
package inmobiliaria;

/**
 *
 * @author Óscar Núñez Aguado <aguado@edu.xunta.es>
 */
public class Piso extends Inmueble {
    int planta;

    public Piso(String direccion, int m2, int numHab, int numBanhos, int planta) {
        super(direccion, m2, numHab, numBanhos);
        this.planta = planta;
    }

    @Override
    public String detalle() {
        String salida = "";
        
        salida += "Piso en " + direccion + ".\n";
        salida += m2 + "m2, " + numHab + " hab, " + numBanhos + " baños, " + planta + "ª planta.\n";
        if (precioAlquiler != 0)
            salida += "Precio de Alquiler: " + precioAlquiler + " €\n";

        if (precioVenta != 0)        
            salida += "Precio de Venta: " + precioVenta + " €";
        
        return salida;
    }        
    
}
