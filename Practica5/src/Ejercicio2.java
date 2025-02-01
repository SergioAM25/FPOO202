import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        for (int i = num; i >= 0; i--) {
            System.out.print(i + ",");

        }

    }
}
