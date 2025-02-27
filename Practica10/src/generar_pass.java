import javax.swing.*;

public class generar_pass {
    private int lenght = 8;
    private boolean include_May;
    private boolean caract_Esp;
    private static String Numero = "0123456789";
    private static String Mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String Minusculas = "abcdefghijklmnopqrstuvwxyz";
    private static String Especiales = "!@#$%&*?_-";

    public generar_pass(int lenght, boolean include_May, boolean caract_Esp) {
        this.lenght = lenght;
        this.include_May = include_May;
        this.caract_Esp = caract_Esp;
    }

    public String getPassword() {
        String caracteres = Numero + Minusculas;
        if (include_May) caracteres += Mayusculas;
        if (caract_Esp) caracteres += Especiales;
        String pswd = "";
        for (int i = 0; i < lenght; i++) {
            pswd += caracteres.charAt((int) (Math.random() * caracteres.length()));
        }

        return pswd;
    }
    public void mostrarPassword() {
        String mensaje = "Contraseña generada con exito\n\nLa contraseña es:\n" + getPassword();
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public boolean isInclude_May() {
        return include_May;
    }

    public void setInclude_May(boolean include_May) {
        this.include_May = include_May;
    }

    public boolean isCaract_Esp() {
        return caract_Esp;
    }

    public void setCaract_Esp(boolean caract_Esp) {
        this.caract_Esp = caract_Esp;
    }

    public static String getNumero() {
        return Numero;
    }

    public static void setNumero(String numero) {
        Numero = numero;
    }

    public static String getMayusculas() {
        return Mayusculas;
    }

    public static void setMayusculas(String mayusculas) {
        Mayusculas = mayusculas;
    }

    public static String getMinusculas() {
        return Minusculas;
    }

    public static void setMinusculas(String minusculas) {
        Minusculas = minusculas;
    }

    public static String getEspeciales() {
        return Especiales;
    }

    public static void setEspeciales(String especiales) {
        Especiales = especiales;
    }
}