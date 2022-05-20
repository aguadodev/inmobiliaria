
package inmobiliaria;

/**
 *
 * @author Óscar Núñez Aguado <aguado@edu.xunta.es>
 */
public class Casa extends Inmueble {
    int m2Terreno;

    public Casa(String direccion, int m2, int numHab, int numBanhos, int m2Terreno) {
        super(direccion, m2, numHab, numBanhos);
        this.m2Terreno = m2Terreno;
    }
    
    @Override
    public String detalle() {
        String salida = "";
        
        salida += "Casa en " + direccion + ".\n";
        salida += m2 + " m2, " + numHab + " hab, " + numBanhos + " baños, con terreno de " + m2Terreno + " m2.\n";
        if (precioAlquiler != 0)
            salida += "Precio de Alquiler: " + precioAlquiler + " €\n";

        if (precioVenta != 0)        
            salida += "Precio de Venta: " + precioVenta + " €";
        
        return salida;
        
    }       
        
}
