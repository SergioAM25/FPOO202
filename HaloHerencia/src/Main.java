public class Main {
    public static void main(String[] args) {

        SpartanII jefemaestro= new SpartanII("John", 90, "rifle de asalto", 0);
        jefemaestro.mostrarInfo();
        jefemaestro.usarManejoAvanzado();
        jefemaestro.atacar("Covenant");
        jefemaestro.recibirDano(50);
        jefemaestro.recargarEscudo();

        SpartanIII chekmaestro=  new SpartanIII("Chekmaestro", 200, "Bazooka", 0);
        chekmaestro.mostrarInfo();
        chekmaestro.camuflajeActivo();
        chekmaestro.atacar("BrianCamion");
        chekmaestro.recibirDano(50);
        chekmaestro.recargarEscudo();

        SpartanIV jeffHardy=  new SpartanIV("Jeff Hardy", 100, "Swanton Bomb", 0);
        jeffHardy.mostrarInfo();
        jeffHardy.usarPropulsores();
        jeffHardy.atacar("CM Punk");
        jeffHardy.recibirDano(50);
        jeffHardy.recargarEscudo();
    }
}