import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la edad del cliente: ");
        int edad = sc.nextInt();
        if (edad < 4) {
            System.out.println("Entrada gratuita.");
        } else if (edad <= 18) {
            System.out.println("El precio de la entrada es $110.");
        } else {
            System.out.println("El precio de la entrada es $190.");
        }
    }
}
