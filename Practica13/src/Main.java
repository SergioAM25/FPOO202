import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<vehiculo> vehiculos = new ArrayList<>();
    private static List<conductores> listaConductores = new ArrayList<>();
    private static List<envio> envios = new ArrayList<>();
    private static List<entregas> listaEntregas = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú:\n" +
                            "1. Registrar Vehículo\n" +
                            "2. Registrar Conductor\n" +
                            "3. Asignar Conductor a Vehículo\n" +
                            "4. Registrar Envío\n" +
                            "5. Registrar Entrega\n" +
                            "6. Actualizar Estado de Entrega\n" +
                            "7. Mostrar Información\n" +
                            "8. Salir");

            if (opcion == null || opcion.isEmpty()) continue;

            switch (opcion) {
                case "1": registrarVehiculo(); break;
                case "2": registrarConductor(); break;
                case "3": asignarConductor(); break;
                case "4": registrarEnvio(); break;
                case "5": registrarEntrega(); break;
                case "6": actualizarEstadoEntrega(); break;
                case "7": mostrarInformacion(); break;
                case "8":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intente nuevamente.");
            }
        }
    }

    private static void registrarVehiculo() {
        String placa = JOptionPane.showInputDialog("Ingrese la placa:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo:");
        double capacidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga:"));
        vehiculos.add(new vehiculo(placa, modelo, capacidad));
        JOptionPane.showMessageDialog(null, "Vehículo registrado exitosamente.");
    }

    private static void registrarConductor() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
        String id = JOptionPane.showInputDialog("Ingrese la identificación:");
        String licencia = JOptionPane.showInputDialog("Ingrese la licencia:");
        listaConductores.add(new conductores(nombre, id, licencia));
        JOptionPane.showMessageDialog(null, "Conductor registrado exitosamente.");
    }

    private static void asignarConductor() {
        if (vehiculos.isEmpty() || listaConductores.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe registrar al menos un vehículo y un conductor.");
            return;
        }
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo a asignar:");
        for (vehiculo v : vehiculos) {
            if (v.getPlaca().equals(placa) && v.getConductor() == null) {
                v.asignarConductor(listaConductores.get(0));
                JOptionPane.showMessageDialog(null, "Conductor asignado exitosamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Vehículo no encontrado o ya tiene un conductor.");
    }

    private static void registrarEnvio() {
        String codigoEnvio = JOptionPane.showInputDialog("Ingrese el código de envío:");
        String destino = JOptionPane.showInputDialog("Ingrese el destino:");
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso:"));
        envios.add(new envio(codigoEnvio, destino, peso));
        JOptionPane.showMessageDialog(null, "Envío registrado exitosamente.");
    }

    private static void registrarEntrega() {
        String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía:");
        listaEntregas.add(new entregas(numeroGuia));
        JOptionPane.showMessageDialog(null, "Entrega registrada exitosamente.");
    }

    private static void actualizarEstadoEntrega() {
        if (listaEntregas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay entregas registradas.");
            return;
        }
        String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía de la entrega a actualizar:");
        for (entregas e : listaEntregas) {
            if (e.getNumeroGuia().equals(numeroGuia)) {
                String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En tránsito / Entregado):");
                if (nuevoEstado.equals("En tránsito") || nuevoEstado.equals("Entregado")) {
                    e.actualizarEstado(nuevoEstado);
                    JOptionPane.showMessageDialog(null, "Estado actualizado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Estado inválido.");
                }
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Entrega no encontrada.");
    }

    private static void mostrarInformacion() {
        StringBuilder info = new StringBuilder("Información del sistema:\n\n");
        for (vehiculo v : vehiculos) info.append(v).append("\n");
        for (envio e : envios) info.append(e).append("\n");
        for (entregas ent : listaEntregas) info.append(ent).append("\n");
        JOptionPane.showMessageDialog(null, info.toString());
    }
}