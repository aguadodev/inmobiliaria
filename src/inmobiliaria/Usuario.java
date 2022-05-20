
package inmobiliaria;

import java.util.*;

/**
 *
 * @author Óscar Núñez Aguado <aguado@edu.xunta.es>
 */
public class Usuario {
    String nombre;
    Collection<Inmueble> inmueblesFav;

    public Usuario(String nombre) {
        this.nombre = nombre;
        inmueblesFav = new TreeSet();
    }

    @Override
    public String toString() {
        return nombre;
    }

    boolean addFavorito(Inmueble i){
        return inmueblesFav.add(i);
    }

    boolean removeFavorito(Inmueble i){
        return inmueblesFav.remove(i);
    }
    
    Collection<Inmueble> favoritosUnion(Usuario u1, Usuario u2){
        
        return 
    }
    
    Collection<Inmueble> favoritosInterseccion(Usuario u1, Usuario u2){
        return
    }
    
    Collection<Inmueble> noFavoritos(Usuario u1, Usuario u2){
        return
    }
}
