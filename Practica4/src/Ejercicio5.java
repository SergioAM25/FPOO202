import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Introduce el primer numero: ");
double num = sc.nextDouble();
System.out.print("Introduce el segundo numero: ");
double num2 = sc.nextDouble();
System.out.print("Introduce un operador para la operacion (+, -, *, /): ");
char op = sc.next().charAt(0);

switch (op) {
    case '+': System.out.println("Resultado de la suma: " + num +" + " + num2 +"= " + (num + num2));
        break;
        case '-': System.out.println("Resultado de la resta: " + num +" - " + num2 +"= " + (num - num2));
        break;
        case '*': System.out.println("Resultado de la multiplicacion: " + num +" * " + num2 +"= " +  (num * num2));
        break;
        case '/': System.out.println("Resultado de la division: " + num +" / " + num2 +"= " +  (num / num2));
        break;
}
    }
}
