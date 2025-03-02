import javax.swing.*;

public class entregas {

    private String numeroGuia;
    private String estado;

    public entregas(String numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";
    }

    public void actualizarEstado(String nuevoEstado) {
        String actualizarEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En Proceso / Entregado):");
        if (nuevoEstado.equals("En Proceso") || nuevoEstado.equals("Entregado")) {
            this.estado = nuevoEstado;
        } else {
            JOptionPane.showMessageDialog(null, "Estado no valido.");
        }
    }
    public String getNumeroGuia(){
        return numeroGuia;
    }
    public String getEstado(){
        return estado;
    }
    public void setNumeroGuia(String numeroGuia){
        this.numeroGuia = numeroGuia;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
}
