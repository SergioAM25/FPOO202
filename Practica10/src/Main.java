import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        generar_pass pass = new generar_pass();
        String longitud = JOptionPane.showInputDialog("Ingresa la longitud de la contraseña:");

        if (longitud == null || longitud.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Longitud no vaalida.");
            return;
        }
        if (longitud.matches("\\d+")) {
            pass.lenght = Integer.parseInt(longitud);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un número valido.");
            return;
        }

        JCheckBox checkBox = new JCheckBox("Agregar mayusculas");
        JCheckBox checkBoxEsp = new JCheckBox("Caracteres especiales");

        Object[] message = {"Seleccione opciones:", checkBox, checkBoxEsp};
        int option = JOptionPane.showConfirmDialog(null, message, "Confirmacion", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            pass.include_May = checkBox.isSelected();
            pass.caract_Esp = checkBoxEsp.isSelected();
        } else {
            JOptionPane.showMessageDialog(null, "Operacion cancelada.");
            return;
        }

        pass.mostrarPassword();
    }
}