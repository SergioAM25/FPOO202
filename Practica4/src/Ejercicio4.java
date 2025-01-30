import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra: ");
        String palabra = sc.nextLine();
        String palabra2 = palabra.replaceAll(" ", "");
        String invertida = new StringBuilder(palabra2).reverse().toString();
        if (palabra2.equals(invertida)) {
            System.out.println("La palabra es palindroma");
        } else {
            System.out.println("La palabra no es palindroma");

        }
    }
}
