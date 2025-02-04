import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = sc.nextInt();
        if (numero < 0) {
        } else {
            System.out.println("Serie:");
            while (numero != 1) {
                System.out.print(numero + " ");
                if (numero % 2 == 0) {
                    numero = numero / 2;
                } else {
                    numero = numero * 3 + 1;
                }
            }
            System.out.println(1);
        }
    }
}



