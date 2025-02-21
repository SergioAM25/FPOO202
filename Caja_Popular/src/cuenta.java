import javax.swing.JOptionPane;
public class cuenta {
    public int numeroCuenta;
    public String titular;
    public int edad;
    public double saldo;

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
}

