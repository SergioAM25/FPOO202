public class Main {
    public static void main(String[] args) {

        //Crear la primer instancia o objeto.
        Spartan masterChief = new Spartan();

        //Usar atributos.
        masterChief.nombre="Chek El Barbaro";
        masterChief.salud=100;
        masterChief.escudo=500;
        masterChief.armaPrincipal="AK-47";

        //invocamos los metodos.
        masterChief.mostrarInfo();
        masterChief.Atacar("Kratos");
        masterChief.recargarArma(75);
        masterChief.correr(true);


        //Segunda Instancia
        Spartan SantiTanque = new Spartan();

        //Usar atributos.
        SantiTanque.nombre="Santi";
        SantiTanque.salud=100;
        SantiTanque.escudo=500;
        SantiTanque.armaPrincipal="Dos Cuchillos";

        //invocamos los metodos.
        SantiTanque.mostrarInfo();
        SantiTanque.Atacar("BrianTractoCamion");
        SantiTanque.recargarArma(75);
        SantiTanque.correr(false);
    }
}

