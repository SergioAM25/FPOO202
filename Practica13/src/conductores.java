public class conductores{

    private String nombre;
    private String identificacion;
    private String licencia;

    public conductores(String nombre, String identificacion, String licencia){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.licencia = licencia;
    }

    public String getNombre(){
        return nombre;
    }
    public String getIdentificacion(){
        return identificacion;
    }
    public String getLicencia(){
        return licencia;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }
    public void setLicencia(String licencia){
        this.licencia = licencia;
    }
}
