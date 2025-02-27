import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String cuenta = JOptionPane.showInputDialog("Ingresa tu número de cuenta: ");
        int numeroCuenta = Integer.parseInt(cuenta);

        String titular = JOptionPane.showInputDialog("Titular de la cuenta: ");

        String edad = JOptionPane.showInputDialog("Ingresa tu edad: ");
        int edadCl = Integer.parseInt(edad);

        String saldo = JOptionPane.showInputDialog("Ingresa el saldo inicial: ");
        double saldoCl = Double.parseDouble(saldo);

        cuenta cliente = new cuenta(numeroCuenta, titular, edadCl, saldoCl);

        String[] opciones = {"Consultar saldo", "Ingresar efectivo", "Retirar efectivo", "Depositar a una cuenta"};
        int opcion = JOptionPane.showOptionDialog(
                null, "Elige una opción:", "Caja Popular",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]
        );

        switch (opcion) {
            case 0:
                cliente.consultarSaldo();
                break;
            case 1:
                cliente.ingresarEfectivo();
                break;
            case 2:
                cliente.retirarEfectivo();
                break;
            case 3:
                cliente.depositarCuenta();
                break;
        }
    }
}