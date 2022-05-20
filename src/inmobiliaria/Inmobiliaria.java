package inmobiliaria;

import java.util.*;

/**
 *
 * @author Óscar Núñez Aguado <aguado@edu.xunta.es>
 */
public class Inmobiliaria {

    public static void main(String[] args) {
        // 1.1. Modelo de Clases
        // Crea un piso en una 5a planta, de 100m2, 3 habitaciones y 2 baños en la dirección “Calle Curtidoira”. Establece los precios de alquiler y de Venta.
        Inmueble piso1 = new Piso("Calle Curtidoira", 100, 3, 2, 5);
        piso1.setPrecioAlquiler(500);
        piso1.setPrecioVenta(200000);

        // Crea otros dos pisos
        Inmueble piso2 = new Piso("Praza Maior", 80, 2, 2, 3);
        piso2.setPrecioAlquiler(400);
        Inmueble piso3 = new Piso("Calle Rosalía de Castro", 140, 4, 2, 2);
        piso3.setPrecioVenta(250000);

        // Crea una casa de 250m2 construídos, 3000m2 de terreno, 4 habitaciones y 3 baños en la dirección “Carretera de Marín”.
        Inmueble casa1 = new Casa("Carretera de Marín", 250, 4, 3, 3000);
        casa1.setPrecioAlquiler(800);
        casa1.setPrecioVenta(350000);

        // Crea otra casa
        Inmueble casa2 = new Casa("Lapaman", 150, 3, 2, 1000);
        casa2.setPrecioVenta(400000);

        // Imprimir Inmueble: Piso, Casa
        System.out.println(piso1);
        System.out.println(casa1);
        System.out.println("");

        // Mostrar Detalle Inmueble: Piso, Casa
        System.out.println(piso1.detalle());
        System.out.println("");
        System.out.println(piso2.detalle());
        System.out.println("");
        System.out.println(casa2.detalle());

        
        // 1.2. Lista de inmuebles
        ArrayList<Inmueble> inmuebles = new ArrayList<>();
        inmuebles.add(piso1);
        inmuebles.add(piso2);
        inmuebles.add(piso3);
        inmuebles.add(casa1);
        inmuebles.add(casa2);
        
        System.out.println("\nTODOS LOS INMUEBLES:");
        mostrarInmuebles(inmuebles);
        
        System.out.println("\nINMUEBLES EN ALQUILER:");
        mostrarInmuebles(getEnAlquiler(inmuebles));

        System.out.println("\nINMUEBLES EN VENTA:");
        mostrarInmuebles(getEnVenta(inmuebles));

        System.out.println("\nPISOS:");
        mostrarInmuebles(getPisos(inmuebles));

        System.out.println("\nCASAS:");
        mostrarInmuebles(getCasas(inmuebles));
        
        // 1.3. Ordenar inmuebles
        Collections.sort(inmuebles);
        System.out.println("\nINMUEBLES ORDENADOS POR m2 (ascendente):");
        mostrarInmuebles(inmuebles);        
        
        Inmueble.sortMetrosDesc(inmuebles);
        System.out.println("\nINMUEBLES ORDENADOS POR m2 (de mayor a menor):");
        mostrarInmuebles(inmuebles);        
        
        Inmueble.sortHabMetrosDesc(inmuebles);
        System.out.println("\nINMUEBLES ORDENADOS POR numHabitaciones y luego por m2 (de mayor a menor):");
        mostrarInmuebles(inmuebles);        


        // 1.4. Inmuebles favoritos de Usuarios
        // Crea dos usuarios y los imprime por pantalla
        Usuario usuario1 = new Usuario("Pedro");
        Usuario usuario2 = new Usuario("Alba");

        System.out.println("\nUSUARIOS:");
        System.out.println(usuario1);
        System.out.println(usuario2);
        usuario1.addFavorito(piso1); 
        usuario1.addFavorito(piso2); 
        usuario1.addFavorito(casa1); 
        usuario2.addFavorito(piso1); 
        usuario2.addFavorito(casa2); 
        
    }
    
    static void mostrarInmuebles(Collection<Inmueble> c){
        for(Inmueble i: c)
            System.out.println(i);
    }

    static Collection<Inmueble> getEnAlquiler(Collection<Inmueble> c){
        Collection<Inmueble> lista = new ArrayList<>();
        
        for(Inmueble i: c)
            if (i.getPrecioAlquiler() != 0)
                lista.add(i);
                
        return lista;
    }
    
    static Collection<Inmueble> getEnVenta(Collection<Inmueble> c){
        Collection<Inmueble> lista = new ArrayList<>();
        
        for(Inmueble i: c)
            if (i.getPrecioVenta() != 0)
                lista.add(i);
                
        return lista;
    }
    
    static Collection<Inmueble> getPisos(Collection<Inmueble> c){
        Collection<Inmueble> lista = new ArrayList<>();
        
        for(Inmueble i: c)
            if (i.getClass().getSimpleName().equals("Piso"))
                lista.add(i);
                
        return lista;
    }
    
    static Collection<Inmueble> getCasas(Collection<Inmueble> c){
        Collection<Inmueble> lista = new ArrayList<>();
        
        for(Inmueble i: c)
            if (i.getClass().getSimpleName().equals("Casa"))
                lista.add(i);
                
        return lista;
    }
    
    
}
