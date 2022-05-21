
package inmobiliaria;

import java.util.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Óscar Núñez Aguado <aguado@edu.xunta.es>
 */
public class UsuarioTest {
    Usuario usuario1, usuario2, usuario3, usuario4, usuario5; 
    Inmueble piso1, piso2, piso3, casa1, casa2;
    
    public UsuarioTest() {
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
        
        // 1.4. Inmuebles favoritos de Usuarios
        // Crea dos usuarios y los imprime por pantalla
        usuario1 = new Usuario("Pedro");
        usuario2 = new Usuario("Alba");   
        usuario1.addFavorito(piso1); 
        usuario1.addFavorito(piso2); 
        usuario1.addFavorito(casa1); 
        usuario2.addFavorito(piso1); 
        usuario2.addFavorito(casa2);         
    }

    @Test
    public void testAddFavorito() {
        assertEquals(false, usuario1.addFavorito(piso1));
        assertEquals(true, usuario1.addFavorito(piso3));
        // Elimina el favorito añadido para dejar los objetos como estaban inicialmente
        usuario1.removeFavorito(piso3);
    }

    @Test
    public void testRemoveFavorito() {
        assertEquals(false, usuario1.removeFavorito(casa2));
        assertEquals(true, usuario1.removeFavorito(piso1));
        // Añade el favorito eliminado para dejar los objetos como estaban inicialmente        
        usuario1.addFavorito(piso1);
    }


    @Test
    public void testFavoritosUnion() {
        usuario1 = new Usuario("Pedro");
        usuario2 = new Usuario("Alba");   
        usuario1.addFavorito(piso1); 
        usuario1.addFavorito(piso2); 
        usuario1.addFavorito(casa1); 
        usuario2.addFavorito(piso1); 
        usuario2.addFavorito(casa2);    
        
        Collection<Inmueble> resultado = new HashSet<>();
        resultado.add(casa1);        
        resultado.add(casa2);        
        resultado.add(piso1);        
        resultado.add(piso2);      
        
        assertEquals(resultado, Usuario.favoritosUnion(usuario1, usuario2));  
    }

    @Test
    public void testFavoritosInterseccion() {
        usuario1 = new Usuario("Pedro");
        usuario2 = new Usuario("Alba");   
        usuario1.addFavorito(piso1); 
        usuario1.addFavorito(piso2); 
        usuario1.addFavorito(casa1); 
        usuario2.addFavorito(piso1); 
        usuario2.addFavorito(casa2);    
        
        Collection<Inmueble> resultado = new HashSet<>();      
        resultado.add(piso1);        
        
        assertEquals(resultado, Usuario.favoritosInterseccion(usuario1, usuario2));  
    }
    
    
}
