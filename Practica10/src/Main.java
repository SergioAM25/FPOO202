import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String longitud = JOptionPane.showInputDialog("Ingresa la longitud de la contraseña:");

        if (longitud == null || longitud.trim().isEmpty() || !longitud.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido.");
            return;
        }

        int length = Integer.parseInt(longitud);
        JCheckBox checkBox = new JCheckBox("Agregar mayúsculas");
        JCheckBox checkBoxEsp = new JCheckBox("Caracteres especiales");

        Object[] message = {"Seleccione opciones:", checkBox, checkBoxEsp};
        int option = JOptionPane.showConfirmDialog(null, message, "Confirmación", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            generar_pass pass = new generar_pass(length, checkBox.isSelected(), checkBoxEsp.isSelected());
            pass.mostrarPassword();
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
        }
    }
}