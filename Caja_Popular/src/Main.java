import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        cuenta Cliente= new cuenta();
        String cuenta = JOptionPane.showInputDialog("Ingresa tu numero de cuenta: ");
        int numeroCuenta = Integer.parseInt(cuenta);
        Cliente.numeroCuenta=  numeroCuenta;
        String titular = JOptionPane.showInputDialog("Titular de la cuenta: ");
        Cliente.titular= titular;
        String in_Edad = JOptionPane.showInputDialog("Ingresa tu edad: ");
        int edad = Integer.parseInt(in_Edad);
        Cliente.edad= edad;
        String in_Saldo = JOptionPane.showInputDialog("Ingresa el saldo inicial: ");
        double saldo = Double.parseDouble(in_Saldo);
        Cliente.saldo= saldo;
        String[] opciones = {"Consultar saldo", "Ingresar efectivo", "Retirar efectivo", "Depositar a una cuenta"};
        int opcion = JOptionPane.showOptionDialog(
                null, "Elige una opcion:", "Caja Popular",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, opciones, opciones[0]
        );
        switch(opcion){
            case 0:
                Cliente.consultarSaldo();
                break;
            case 1:
                Cliente.ingresarEfectivo();
                break;
            case 2:
                Cliente.retirarEfectivo();
                break;
            case 3:
                Cliente.depositarCuenta();
                break;
        }
    }
}