// Excepción personalizada para saldo insuficiente
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje); // Pasamos el mensaje a la clase padre
    }
}

// Excepción personalizada para límite de sobregiro excedido
class LimiteSobregiroExcedidoException extends Exception {
    public LimiteSobregiroExcedidoException(String mensaje) {
        super(mensaje); // Pasamos el mensaje a la clase padre
    }
}

// Clase base CuentaBancaria
class CuentaBancaria {
    protected double saldo; // Saldo de la cuenta

    // Constructor que inicializa el saldo
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial; // Asignamos el saldo inicial
    }

    // Método para retirar dinero
    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + cantidad); // Lanzamos excepción
        }
        saldo -= cantidad; // Restamos la cantidad del saldo
        System.out.println("Retirado: " + cantidad + ". Nuevo saldo: " + saldo);
    }

    // Método para consultar el saldo
    public double consultarSaldo() {
        return saldo; // Retornamos el saldo actual
    }
}

// Clase derivada CuentaCorriente que hereda de CuentaBancaria
class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro; // Límite de sobregiro permitido

    // Constructor que inicializa el saldo y el límite de sobregiro
    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        super(saldoInicial); // Llamamos al constructor de la clase base
        this.limiteSobregiro = limiteSobregiro; // Asignamos el límite de sobregiro
    }

    // Sobrescritura del método retirar para permitir sobregiros
    @Override
    public void retirar(double cantidad) throws SaldoInsuficienteException, LimiteSobregiroExcedidoException {
        if (cantidad > saldo + limiteSobregiro) {
            throw new LimiteSobregiroExcedidoException("Límite de sobregiro excedido. Intento de retirar " + cantidad); // Lanzamos excepción
        }
        saldo -= cantidad; // Restamos la cantidad del saldo
        System.out.println("Retirado: " + cantidad + ". Nuevo saldo: " + saldo);
    }
}

// Clase principal con el método main
public class MainEjercicio5 {
    public static void main(String[] args) {
        try {
            // Creamos un objeto de la clase CuentaBancaria
            CuentaBancaria miCuenta = new CuentaBancaria(1000.0);
            miCuenta.retirar(500.0); // Retirar 500
            miCuenta.retirar(600.0); // Intentar retirar más de lo que hay (debería lanzar excepción)

        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage()); // Capturamos y mostramos el mensaje de la excepción
        }

        try {
            // Creamos un objeto de la clase CuentaCorriente
            CuentaCorriente miCuentaCorriente = new CuentaCorriente(1000.0, 500.0);
            miCuentaCorriente.retirar(1200.0); // Intentar retirar 1200 (debería permitirlo)
            miCuentaCorriente.retirar(600.0); // Intentar retirar más de lo permitido (debería lanzar excepción)

        } catch (SaldoInsuficienteException | LimiteSobregiroExcedidoException e) {
            System.out.println(e.getMessage()); // Capturamos y mostramos el mensaje de la excepción
        }
    }
}



















