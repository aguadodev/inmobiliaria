
package inmobiliaria;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Óscar Núñez Aguado <aguado@edu.xunta.es>
 */
public class InmobiliariaTest {
   
    ArrayList<Inmueble> inmuebles;
    Inmueble piso1, piso2, piso3, casa1, casa2;
    
    public InmobiliariaTest() {
        piso1 = new Piso("Calle Curtidoira", 100, 3, 2, 5);
        piso1.setPrecioAlquiler(500);
        piso1.setPrecioVenta(200000);

        // Crea otros dos pisos
        piso2 = new Piso("Praza Maior", 80, 2, 2, 3);
        piso2.setPrecioAlquiler(400);
        piso3 = new Piso("Calle Rosalía de Castro", 140, 4, 2, 2);
        piso3.setPrecioVenta(250000);

        // Crea una casa de 250m2 construídos, 3000m2 de terreno, 4 habitaciones y 3 baños en la dirección “Carretera de Marín”.
        casa1 = new Casa("Carretera de Marín", 250, 4, 3, 3000);
        casa1.setPrecioAlquiler(800);
        casa1.setPrecioVenta(350000);

        // Crea otra casa
        casa2 = new Casa("Lapaman", 150, 3, 2, 1000);
        casa2.setPrecioVenta(400000);
        
        inmuebles = new ArrayList<>();
        inmuebles.add(piso1);
        inmuebles.add(piso2);
        inmuebles.add(piso3);
        inmuebles.add(casa1);
        inmuebles.add(casa2);        
    }
    
    @Test
    public void testGetEnAlquiler(){
        List<Inmueble> resultado = new ArrayList<>();
        resultado.add(piso1);
        resultado.add(piso2);
        resultado.add(casa1);        
        
        assertEquals(resultado, Inmobiliaria.getEnAlquiler(inmuebles));                
    }    

    @Test
    public void testGetEnVenta(){
        List<Inmueble> resultado = new ArrayList<>();
        resultado.add(piso1);
        resultado.add(piso3);
        resultado.add(casa1);        
        resultado.add(casa2);        
        
        assertEquals(resultado, Inmobiliaria.getEnVenta(inmuebles));                
    }    

    @Test
    public void testGetPisos(){
        List<Inmueble> resultado = new ArrayList<>();
        resultado.add(piso1);
        resultado.add(piso2);
        resultado.add(piso3);        
        
        assertEquals(resultado, Inmobiliaria.getPisos(inmuebles));                
    }    

    @Test
    public void testGetCasas(){
        List<Inmueble> resultado = new ArrayList<>();
        resultado.add(casa1);        
        resultado.add(casa2);        
        
        assertEquals(resultado, Inmobiliaria.getCasas(inmuebles));                
    }    
    
    @Test
    public void testSortMetrosDesc(){
        List<Inmueble> resultado = new ArrayList<>();
        resultado.add(casa1);        
        resultado.add(casa2);        
        resultado.add(piso3);        
        resultado.add(piso1);        
        resultado.add(piso2);        
        
        List<Inmueble> resultadoOrdenada = new ArrayList<>(inmuebles);
        Inmueble.sortMetrosDesc(resultadoOrdenada);
        
        assertEquals(resultado, resultadoOrdenada);                
    }        
    
    @Test
    public void testSortHabMetrosDesc(){
        List<Inmueble> resultado = new ArrayList<>();
        resultado.add(casa1);        
        resultado.add(piso3);        
        resultado.add(casa2);        
        resultado.add(piso1);        
        resultado.add(piso2);        
        
        List<Inmueble> resultadoOrdenada = new ArrayList<>(inmuebles);
        Inmueble.sortHabMetrosDesc(resultadoOrdenada);
        
        assertEquals(resultado, resultadoOrdenada);                
    }        
           
    
      
    
}
