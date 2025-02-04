import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine();
        System.out.println("Las letras de la palabra son:");
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println("Letra " + (i + 1) + ": " + palabra.charAt(i));
        }
    }
}