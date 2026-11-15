public class MainCuentaLSP {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA TALLER 17: PRINCIPIO LSP (CUENTAS BANCARIAS) ---");

        // Sustitución de Liskov: La referencia base (CuentaBancaria) apunta a una CuentaAhorros
        CuentaBancaria miCuenta = new CuentaAhorros(500.0, 0.05);

        // Operaciones a través de la interfaz de la clase base
        miCuenta.depositar(200.0);
        miCuenta.retirar(100.0);

        System.out.println("Saldo final consultado: $" + miCuenta.getSaldo());
    }
}
