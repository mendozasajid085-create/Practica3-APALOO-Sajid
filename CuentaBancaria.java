public class CuentaBancaria implements Transaccionable{
    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    //metodos
    public double consultarSaldo(){
        return saldo;
    }
    public String obtenerNumero(){
        return numeroCuenta;
    }
    @Override
    public void depositar(double monto){
        if (monto > 0) {
            saldo += monto;
            System.out.println("Se ha depositado $"+monto+". Nuevo saldo: $"+saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor a 0.");
        }
    }
    @Override
    public void  retirar(double monto){
        if (monto > saldo) {
            System.out.println("Operación no válida, monto a retirar ($" + monto + ") es mayor al saldo disponible ($" + saldo + ").");
        } else if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a 0.");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso de: $" + monto + ". Saldo actual: $" + saldo);
        }
    }

    public double getSaldo() {return saldo;}

    public void setSaldo(double saldo) {this.saldo = saldo;}

    public String getNumeroCuenta() {return numeroCuenta;}

    public void setNumeroCuenta(String numeroCuenta) {this.numeroCuenta = numeroCuenta;}
    
}