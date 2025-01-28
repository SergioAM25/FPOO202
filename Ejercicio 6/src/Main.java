import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Introduce una frase: ");
                String frase = scanner.nextLine();
                String fraseInvertida = new StringBuilder(frase).reverse().toString();
                System.out.println("La frase invertida es: " + fraseInvertida);
            }
        }

