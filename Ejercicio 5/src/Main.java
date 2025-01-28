import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PEDIDOS");
        System.out.println("Ingrese el numero de payasos vendidos: ");
        int num = sc.nextInt();
        System.out.println("Ingrese el numero de muñecas vendidas: ");
        int mu = sc.nextInt();
        int pesoTotal = (num * 112) + (mu * 75);
        System.out.println("El peso total: " + pesoTotal + "gr");

    }
}