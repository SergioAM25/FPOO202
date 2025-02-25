public class Main {
    public static void main(String[] args) {

        //Crear la primer instancia u objeto.
        Spartan masterChief = new Spartan("Chek El Barbaro", 100, 150, "AK-47");

        //Usar atributos.
        /*masterChief.setNombre();
        masterChief.setSalud();
        masterChief.setEscudo();
        masterChief.setArmaPrincipal();*/

        //invocamos los metodos.
        masterChief.mostrarInfo();
        masterChief.Atacar("Kratos");
        masterChief.recargarArma(75);
        masterChief.correr(true);

        //usamos get y set para cambiar atributo nombre
        masterChief.setNombre("Sergio Alvarez");
        masterChief.mostrarInfo();
        masterChief.getNombre();
        System.out.println(masterChief.getNombre());

        //Segunda instancia u objeto
        Spartan SantiTanque = new Spartan("Santi Tanque", 100, 500, "Revolver");

        //Usar atributos.
        /*SantiTanque.setNombre();
        SantiTanque.setSalud();
        SantiTanque.setEscudo();
        SantiTanque.setArmaPrincipal();*/

        //invocamos los metodos.
        SantiTanque.mostrarInfo();
        SantiTanque.Atacar("BrianTractoCamion");
        SantiTanque.recargarArma(75);
        SantiTanque.correr(false);
    }
}

