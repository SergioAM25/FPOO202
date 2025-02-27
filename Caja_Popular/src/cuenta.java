import javax.swing.JOptionPane;

public class cuenta {
    private int numeroCuenta;
    private String titular;
    private int edad;
    private double saldo;

    public cuenta(int numeroCuenta, String titular, int edad, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }
    public void consultarSaldo(){
        String input=JOptionPane.showInputDialog("Titular: " + titular + "Saldo: " + saldo);
    }
    public void ingresarEfectivo(){
        String input=JOptionPane.showInputDialog("Ingrese el monto: ");
        double monto=Double.parseDouble(input);
        saldo+=monto;
        String mensaje= ("El ingreso fue exitoso\n ");
        mensaje+="El saldo es:\n " + saldo;
        JOptionPane.showMessageDialog(null, mensaje);

    }
    public void retirarEfectivo(){
        String input=JOptionPane.showInputDialog("Ingrese el monto a retirar: ");
        double monto=Double.parseDouble(input);
        saldo-=monto;
        String mensaje= ("El retiro fue exitoso\n ");
        mensaje+="El saldo es:\n " + saldo;
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public void depositarCuenta(){
        String input=JOptionPane.showInputDialog("Ingrese el monto a depositar: ");
        String input2=JOptionPane.showInputDialog("Ingrese el numero de cuenta a depositar: ");
        double monto=Double.parseDouble(input);
        saldo-=monto;
        String mensaje= ("El deposito fue exitoso\n ");
        mensaje+="El saldo es:\n " + saldo;
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

