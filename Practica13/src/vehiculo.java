import javax.swing.*;

public class vehiculo{

        private String placa;
        private String modelo;
        private double capacidadCarga;
        private conductores conductor;

        public vehiculo(String placa, String modelo, double capacidadCarga){
            this.placa = placa;
            this.modelo = modelo;
            this.capacidadCarga = capacidadCarga;
        }
        public void asignarConductor(conductores conductor){
            if (this.conductor == null){
                this.conductor = conductor;
            }else{
                JOptionPane.showMessageDialog(null, "El conductor ya ha sido asignado y no puede ser cambiado.");
            }
        }

    public conductores getConductor(){
            return conductor;
    }
    public String getPlaca(){
            return placa;
    }
    public String getModelo(){
            return modelo;
    }
    public double getCapacidadCarga(){
            return capacidadCarga;
    }
    public void setConductor(conductores conductor){
            this.conductor = conductor;
    }
    public void setPlaca(String placa){
            this.placa = placa;
    }
    public void setModelo(String modelo){
            this.modelo = modelo;
    }
    public void setCapacidadCarga(double capacidadCarga){
            this.capacidadCarga = capacidadCarga;
    }
}
