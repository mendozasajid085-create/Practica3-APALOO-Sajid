public class CuentaAhorro extends CuentaBancaria{
    private double montoLimite;
    private double tasa;
    private double intereses;
   public CuentaAhorro (String numeroCuenta, double saldo, double montoLimite, double tasa){
    super(numeroCuenta, saldo);
    this.montoLimite=montoLimite;
    this.tasa=tasa;
   } 
    public double calcularInteres(){
        intereses=(tasa*super.getSaldo()/100);
        return intereses;
    }

    public void aplicarInteres(){
        double interes = calcularInteres();
        if (interes > 0) {
            depositar(interes);
        } else {
            System.out.println("No hay intereses por aplicar (saldo o tasa en 0).");
        }
    }

    @Override
    public void retirar(double monto){
        if (monto > montoLimite) {
            System.out.println("Operación no válida, el monto a retirar ($" + monto + ") supera el límite permitido ($" + montoLimite + ").");
        } else {
            super.retirar(monto);
        }
    }

//getters y setters
    public double getMontoLimite() {
        return montoLimite;
    }

    public void setMontoLimite(double montoLimite) {
        this.montoLimite = montoLimite;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }
}