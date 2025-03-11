import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");

        String apellidoP = JOptionPane.showInputDialog("Ingrese el apellido paterno: ");

        String apellidoM = JOptionPane.showInputDialog("Ingrese el apellido materno: ");

        int anoNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento: "));

        String carrera = JOptionPane.showInputDialog("Ingrese su carrera: ");

        Datos datos = new Datos(nombre, apellidoP, apellidoM, anoNacimiento, carrera);

        String[] opciones = {"Consultar Matrícula"};
        int opcion = JOptionPane.showOptionDialog(
                null, "Elige una opcion:", "Matrícula",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]
        );

        switch (opcion) {
            case 0:
                datos.consultarMatricula(opcion);
                break;
        }

    }
}
