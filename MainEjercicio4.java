// Clase base Vehiculo
class Vehiculo {
    // Atributo de la clase Vehiculo
    protected String marca; 

    // Constructor que inicializa la marca del vehículo
    public Vehiculo(String marca) {
        this.marca = marca; 
    }

    // Método para mostrar la marca del vehículo
    public void mostrarMarca() {
        System.out.println("Marca del vehículo: " + marca); 
    }
}

// Clase derivada Coche que hereda de Vehiculo
class Coche extends Vehiculo {
    // Atributo específico para Coche
    private int puertas; 

    // Constructor que inicializa la marca y el número de puertas
    public Coche(String marca, int puertas) {
        super(marca); // Llamamos al constructor de la clase base para inicializar la marca
        this.puertas = puertas; 
    }

    // Método para mostrar información del coche
    public void mostrarInfo() {
        mostrarMarca(); // Llamamos al método de la clase base para mostrar la marca
        System.out.println("Número de puertas: " + puertas); 
    }
}

// Clase principal con el método main

public class MainEjercicio4 {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Coche
        Coche miCoche = new Coche("Toyota", 4);     
        // Mostramos la información del coche
        miCoche.mostrarInfo(); // Salida: Marca del vehículo: Toyota y Número de puertas: 4
    }
}








