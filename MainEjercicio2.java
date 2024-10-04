// Definición de la interfaz Movible
interface Movible {
    // Método abstracto que debe ser implementado por las clases que implementen esta interfaz
    void moverse(); 
}

// Clase Coche que implementa la interfaz Movible
class Coche implements Movible {
    // Atributo específico para Coche
    private String marca; 

    // Constructor para inicializar el atributo de Coche
    public Coche(String marca) {
        this.marca = marca; 
    }

    // Implementación del método moverse para Coche
    @Override
    public void moverse() {
        System.out.println("El coche " + marca + " se mueve por la carretera."); 
    }
}

// Clase Avion que implementa la interfaz Movible
class Avion implements Movible {
    // Atributo específico para Avion
    private String modelo; 

    // Constructor para inicializar el atributo de Avion
    public Avion(String modelo) {
        this.modelo = modelo; 
    }

    // Implementación del método moverse para Avion
    @Override
    public void moverse() {
        System.out.println("El avión " + modelo + " vuela por el cielo."); 
    }
}

// Clase principal con el método main

public class MainEjercicio2{
    public static void main(String[] args) {
        // Creamos un objeto de la clase Coche
        Coche miCoche = new Coche("Toyota"); 
        // Llamamos al método moverse del coche
        miCoche.moverse(); // Salida: El coche Toyota se mueve por la carretera.

        // Creamos un objeto de la clase Avion
        Avion miAvion = new Avion("Boeing 747"); 
        // Llamamos al método moverse del avión
        miAvion.moverse(); // Salida: El avión Boeing 747 vuela por el cielo.
    }
}











