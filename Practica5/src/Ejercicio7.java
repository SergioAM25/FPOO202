import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la base del arbol: ");
        int base = sc.nextInt();
        int fila=1;
        while (fila <= base) {
            for (int i = 0; i < (base-fila)/2;i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < fila; i++) {
                System.out.print("*");
            }
            System.out.println();
            fila += 2;
        }
    }
}

