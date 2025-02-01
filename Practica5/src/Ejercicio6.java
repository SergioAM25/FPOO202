import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo = 0;
        System.out.println("Escriba la bitacora de operaciones:");
        while (true) {
            String linea = sc.nextLine().trim();
            if (linea.isEmpty()) break;
            char operacion = linea.charAt(0);
            int monto = Integer.parseInt(linea.substring(2));
            if (operacion == 'D' || operacion == 'd') {
                saldo += monto;
            } else if (operacion == 'R' || operacion == 'r') {
                saldo -= monto;
            }
        }
        System.out.println("Saldo final: " + saldo);
    }
}

