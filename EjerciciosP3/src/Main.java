import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el numero de horas trabajadas: ");
        int horas = scanner.nextInt();

        System.out.print("Introduce el coste por hora: ");
        double costePorHora = scanner.nextDouble();

        double paga = horas * costePorHora;
        System.out.println("La paga correspondiente es: $" + paga);
    }
}


