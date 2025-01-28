import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero cualquiera: ");
        int numero = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
            suma += i;

        }
System.out.println("La suma es: " + suma);
    }
}