import javax.swing.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String opcion = JOptionPane.showInputDialog("Seleccione una opción:\n1. Agregar empleado\n2. Listar empleados\n3. Salir");
            if (opcion == null || opcion.equals("3")) break;

            switch (opcion) {
                case "1":
                    agregarEmpleado();
                    break;
                case "2":
                    listarEmpleados();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }
    }

    private static void agregarEmpleado() {
        String tipo = JOptionPane.showInputDialog("Seleccione el tipo de empleado:\n1. Conductor\n2. Administrativo");
        if (tipo == null) return;

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID:"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario:"));

        if (tipo.equals("1")) {
            String licencia = JOptionPane.showInputDialog("Ingrese el tipo de licencia:");
            empleados.add(new Conductor(nombre, id, salario, licencia));
        } else if (tipo.equals("2")) {
            String departamento = JOptionPane.showInputDialog("Ingrese el departamento:");
            empleados.add(new Administrativo(nombre, id, salario, departamento));
        } else {
            JOptionPane.showMessageDialog(null, "Tipo inválido");
        }
    }

    private static void listarEmpleados() {
        if (empleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
            return;
        }
        for (Empleado e : empleados) {
            e.mostrarInfo();
        }
    }
}