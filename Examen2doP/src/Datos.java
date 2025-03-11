import javax.swing.JOptionPane;

public class Datos {

    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int anoNacimiento;
    private String Carrera;
    private String Matricula;

    public Datos(String matricula) {
        Matricula = matricula;
    }

    public Datos(String nombre, String apellidoP, String apellidoM, int anoNacimiento, String carrera) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.anoNacimiento = anoNacimiento;
        Carrera = carrera;
    }

    public void consultarMatricula(int opcion) {
    String mensaje = ("La matricula es: IGULO8725SIS79"+ "\n" + "Nombre: " + this.nombre + "\n" + "Apellido Paterno: " + this.apellidoP + "\n" + "Apellido Materno: " + this.apellidoM + "\n" + "Año Nacimiento: " + this.anoNacimiento + "\n" + "Carrera: " + Carrera);
    JOptionPane.showMessageDialog(null, mensaje);
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }
}
