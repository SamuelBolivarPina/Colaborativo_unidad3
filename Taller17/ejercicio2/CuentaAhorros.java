public class CuentaAhorros extends CuentaBancaria{
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
}
