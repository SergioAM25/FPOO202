//Zona de importacion
import java.util.Scanner;

//Clase principal
public class Main {
    //metodo main o metodo principal
    public static void main(String[] args) {
        /*System.out.println("Hello world!");
        System.out.println("Sergio Alvarez Matias");*/

        //2. Cadenas
        /*String cadena= "sergio"+"alvarez"+"matias";
        System.out.println(cadena);
        //Conteo de longitud de cadena
        System.out.println(cadena.length());
        //Extraccion de caracteres en base a parametros
        System.out.println(cadena.substring(2,5));
        System.out.println(cadena.substring(2));
        System.out.println(cadena.substring(0,5));*/

        //3. Variables
        /*String cadena="333", cadena2, cadena3;
        int entero=3, entero2, entero3;
        double decimal=3.3563, decimal2, decimal3;

        //Convertir cadena a int
        entero2=Integer.parseInt(cadena);
        System.out.println(entero2);

        //Convertir double a int
        entero3=(int)decimal;
        System.out.println(entero3);

        //Convertir double a cadena
        cadena2=String.valueOf(decimal);
        System.out.println(cadena2);

        //Convertir int a double
        decimal2= Double.valueOf(entero);
        System.out.println(decimal2);

        //Conversion implicita
        int i=12;
        double numd= i;
        System.out.println(numd);*/

        //4. Solicitud de datos
        /*Scanner scn= new Scanner(System.in);
        System.out.println("Escribe una cadena:");
        String cadena= scn.nextLine();
        System.out.println("Escribe una numero entero:");
        int entero= scn.nextInt();
        System.out.println("Escribe una numero decimal:");
        double decimal= scn.nextDouble();
        System.out.println("Escribe una numero decimal guardado:"+decimal);
        System.out.println("Escribe una numero entero guardado:"+entero);
        System.out.println("Escribe una cadena guardada:"+cadena);*/

        //5. Boolean, operadores_logico y de comparacion
        /*System.out.println(10>9);//True
        System.out.println(10==9);//False
        System.out.println(10>9);//True
        System.out.println(10>=9);//True
        System.out.println(10<=9);//False
        System.out.println(10!=9);//True (diferente de)*/

        //Operadores logicos
        int x=3;
        System.out.println(x<5 && x>10);
        System.out.println(x<5 || x>10);
        System.out.println(!(x<5 && x>10));
        System.out.println(!(x<5 || x>10));









    }
}