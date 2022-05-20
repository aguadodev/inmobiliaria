
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
    
    static Collection<Inmueble> favoritosUnion(Usuario u1, Usuario u2){
        Collection inmuebles = new TreeSet(u1.inmueblesFav);
        inmuebles.addAll(u2.inmueblesFav);
        return inmuebles;
    }
    
    static Collection<Inmueble> favoritosInterseccion(Usuario u1, Usuario u2){
        Collection inmuebles = new TreeSet(u1.inmueblesFav);
        inmuebles.retainAll(u2.inmueblesFav);
        return inmuebles;
    }

}
