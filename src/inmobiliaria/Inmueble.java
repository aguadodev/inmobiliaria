 
package inmobiliaria;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Óscar Núñez Aguado <aguado@edu.xunta.es>
 */
public abstract class Inmueble implements Comparable<Inmueble> {
    String direccion;
    int m2;
    int numHab;
    int numBanhos;
    int precioAlquiler;
    int precioVenta;

    public Inmueble(String direccion, int m2, int numHab, int numBanhos) {
        this.direccion = direccion;
        this.m2 = m2;
        this.numHab = numHab;
        this.numBanhos = numBanhos;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }    
    
    @Override
    public String toString() {
        return "Inmueble en " + direccion + " (" + m2 + " m2, " + numHab + " hab)";
    }

    @Override
    public int compareTo(Inmueble o) {
        return m2 - o.m2;
    }       
    
    
    public abstract String detalle();
    
    
    
    static void sortMetrosDesc(List<Inmueble> lista){
        lista.sort(new Comparator<Inmueble>() {
            @Override
            public int compare(Inmueble o1, Inmueble o2) {
                return o2.m2 - o1.m2;
            }
        });
    }
 
    static void sortHabMetrosDesc(List<Inmueble> lista){
        lista.sort(new Comparator<Inmueble>() {
            @Override
            public int compare(Inmueble o1, Inmueble o2) {
                if (o2.numHab != o1.numHab)
                    return o2.numHab - o1.numHab;
                else 
                    return o2.m2 - o1.m2;
            }
        });        
    }

    static void sortPrecioAlquilerAsc(List<Inmueble> lista){
        lista.sort(new Comparator<Inmueble>() {
            @Override
            public int compare(Inmueble o1, Inmueble o2) {
                return o1.precioAlquiler - o2.precioAlquiler;
            }
        });
    }

    static void sortPrecioVentaAsc(List<Inmueble> lista){
        lista.sort(new Comparator<Inmueble>() {
            @Override
            public int compare(Inmueble o1, Inmueble o2) {
                return o1.precioVenta - o2.precioVenta;
            }
        });
    }
}
    
