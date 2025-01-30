import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "POO123";
        System.out.print("Introduce la contraseña: ");
        String userInput = sc.nextLine();
        if (password.equalsIgnoreCase(userInput)) {
            System.out.println("Contraseña correcta.");
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }
}