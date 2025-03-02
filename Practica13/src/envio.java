import javax.swing.*;

public class envio{

    private String codigoEnvio;
    private String destino;
    private double peso;

    public envio(String codigoEnvio, String destino){
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = 0;
    }

    public envio(String codigoEnvio, String destino, double peso){
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public static envio crearEnvio(){
        String codigo = JOptionPane.showInputDialog("Ingrese el código del envío:");
        String destino = JOptionPane.showInputDialog("Ingrese el destino del envío:");
        String pesoC = JOptionPane.showInputDialog("Ingrese el peso del envío (opcional, deje vacío si no aplica):");

        if (pesoC.isEmpty()){
            return new envio(codigo, destino);
        }else{
            double peso = Double.parseDouble(pesoC);
            return new envio(codigo, destino, peso);
        }
    }
    public String getCodigoEnvio(){
        return codigoEnvio;
    }
    public String getDestino(){
        return destino;
    }
    public double getPeso(){
        return peso;
    }
    public void setCodigoEnvio(String codigoEnvio){
        this.codigoEnvio = codigoEnvio;
    }
    public void setDestino(String destino){
        this.destino = destino;
    }
}
