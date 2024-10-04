// Clase abstracta Forma
abstract class Forma {
    // Método abstracto que debe ser implementado por las subclases
    public abstract double calcularArea(); // No tiene implementación aquí
}

// Clase concreta Triangulo que hereda de Forma
class Triangulo extends Forma {
    // Atributos específicos para Triangulo
    private double base; 
    private double altura; 

    // Constructor para inicializar los atributos de Triangulo
    public Triangulo(double base, double altura) {
        this.base = base; 
        this.altura = altura; 
    }

    // Implementación del método calcularArea para Triangulo
    @Override
    public double calcularArea() {
        return (base * altura) / 2; 
    }
}

// Clase concreta Cuadrado que hereda de Forma
class Cuadrado extends Forma {
    // Atributo específico para Cuadrado
    private double lado; 

    // Constructor para inicializar el atributo de Cuadrado
    public Cuadrado(double lado) {
        this.lado = lado; 
    }

    // Implementación del método calcularArea para Cuadrado
    @Override
    public double calcularArea() {
        return lado * lado; 
    }
}

// Clase principal con el método main

public class MainEjercicio1 {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Triangulo
        Triangulo miTriangulo = new Triangulo(5.0, 3.0); // Base 5.0 y altura 3.0
        // Mostramos el área del triángulo
        System.out.println("Área del Triángulo: " + miTriangulo.calcularArea()); // Salida: 7.5

        // Creamos un objeto de la clase Cuadrado
        Cuadrado miCuadrado = new Cuadrado(4.0); // Lado 4.0
        // Mostramos el área del cuadrado
        System.out.println("Área del Cuadrado: " + miCuadrado.calcularArea()); // Salida: 16.0
    }
}
















