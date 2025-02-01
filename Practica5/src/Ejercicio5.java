import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        System.out.print("Introduce una letra: ");
        char letra = sc.next().charAt(0);
        int contador = 0;
        for (char c : frase.toCharArray()) {
            if (c == letra) {
                contador++;
            }
        }
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
        sc.close();
    }
}
