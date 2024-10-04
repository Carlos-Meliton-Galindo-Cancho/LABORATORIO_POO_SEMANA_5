// Clase base Persona
class Persona {
    // Método saludar que imprime un saludo genérico
    public void saludar() {
        System.out.println("Hola, soy una persona."); 
    }
}

// Clase derivada Estudiante que hereda de Persona
class Estudiante extends Persona {
    // Atributo específico para Estudiante
    private String nombre; 

    // Constructor para inicializar el nombre del estudiante
    public Estudiante(String nombre) {
        this.nombre = nombre; 
    }

    // Sobrescritura del método saludar para incluir el nombre del estudiante
    @Override
    public void saludar() {
        System.out.println("Hola, soy " + nombre + ", un estudiante."); 
    }

    // Sobrecarga del método saludar que acepta un parámetro
    public void saludar(String otroNombre) {
        System.out.println("Hola " + otroNombre + ", soy " + nombre + "."); 
    }
}

// Clase principal con el método main

public class MainEjercicio3 {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Persona
        Persona persona = new Persona();
        // Llamamos al método saludar de Persona
        persona.saludar(); // Salida: Hola, soy una persona.

        // Creamos un objeto de la clase Estudiante
        Estudiante estudiante = new Estudiante("Juan"); 
        // Llamamos al método saludar de Estudiante
        estudiante.saludar(); // Salida: Hola, soy Juan, un estudiante.

        // Llamamos al método saludar sobrecargado con un parámetro
        estudiante.saludar("María"); // Salida: Hola María, soy Juan.
    }
}











