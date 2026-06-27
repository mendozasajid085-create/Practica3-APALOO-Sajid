public class CuentaCorriente extends CuentaBancaria{
    private double comision;
    public CuentaCorriente(String numeroCuenta, double saldo, double comision) {
        super(numeroCuenta, saldo);
        this.comision = comision;
    }
    public void girarCheque(double monto){
        if (monto>super.getSaldo() || monto<0){
            System.out.println("Error monto invalido al saldo");
        }else{
            super.retirar(monto);
            System.out.println("El cheque ah sido girado correctamente. El saldo acutal es de: "+getSaldo());
        }
    }
    public void cobrarComision(){
        double montoComision = comision * getSaldo();
        System.out.println("Cobrando comisión por manejo de cuenta (" + (comision * 100) + "%)...");
        retirar(montoComision);
    }

//getter y setters
    public double getComision() {return comision;}

    public void setComision(double comision) {this.comision = comision;}
    
}