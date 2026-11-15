public class CuentaAhorros extends CuentaBancaria {
    public double tasaInteres;

    public CuentaAhorros(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() {
        double interes = saldo * tasaInteres;
        saldo += interes;
        System.out.println("Interés aplicado. Nuevo saldo: $" + saldo);
    }

    // Sobrescribimos el retiro opcionalmente para agregar una validación propia de ahorros,
    // pero manteniendo el comportamiento lógico esperado sin lanzar excepciones sorpresa.
    @Override
    public void retirar(double monto) {
        double saldoMinimo = 10.0; // Restricción propia de la cuenta de ahorros
        if (monto > 0 && (saldo - monto) >= saldoMinimo) {
            saldo -= monto;
            System.out.println("Retiro de cuenta de ahorros exitoso. Saldo actual: $" + saldo);
        } else {
            System.out.println("No se puede retirar. Debe mantener un saldo mínimo de $" + saldoMinimo);
        }
    }
}
