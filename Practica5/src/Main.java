import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.print("Ingrese un numero: ");
                int num = sc.nextInt();
                for (int i = 1; i <=num; i++) {
                    System.out.print(i + ",");
                }
            }
    }

