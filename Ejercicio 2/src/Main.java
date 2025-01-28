import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese tu apellido paterno: ");
        String apellidop = sc.nextLine();
        System.out.println("Ingrese tu apellido materno: ");
        String apellidom = sc.nextLine();
        System.out.println(nombre.toUpperCase() + " " + apellidop.toUpperCase() + " " + apellidom.toUpperCase());
        System.out.println(nombre.toLowerCase() + " " + apellidop.toLowerCase() + " " + apellidom.toLowerCase());
        System.out.println((nombre.substring(0,1).toUpperCase() + nombre.substring(1).toLowerCase())+" " + (apellidop.substring(0,1).toUpperCase() + apellidop.substring(1).toLowerCase()) + " " + (apellidom.substring(0,1).toUpperCase() + apellidom.substring(1).toLowerCase()));
    }
}