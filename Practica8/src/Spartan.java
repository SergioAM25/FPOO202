public class Spartan {
    public String nombre;
    int escudo, salud;
    String armaPrincipal;

    public void mostrarInfo() {
        System.out.println("--------Informacion del Spartan--------");
        System.out.println("Nombre: "+nombre);
        System.out.println("% de Salud: "+salud);
        System.out.println("% de Escudo: "+escudo);
        System.out.println("Arma Principal: "+armaPrincipal);
        System.out.println("---------------------------------------");
    }//llave mostrarinfo
    public void Atacar(String enemigo){
        System.out.println(nombre+" ataca a "+enemigo+" con el " +armaPrincipal);
    }
    public void recargarArma(int municiones){
       int restantes =10;
       int total=restantes+municiones;
       System.out.println(armaPrincipal+" ahora tiene disponible "+total+" balas ");
    }
    public void correr(boolean status){
        if (status){
            System.out.println(nombre+" esta corriendo");
        }else{
            System.out.println(nombre+" se detuvo");
        }
    }
}//llave de la clase
