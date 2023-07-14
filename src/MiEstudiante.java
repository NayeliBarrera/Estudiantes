import java.io.Serializable;

public class MiEstudiante implements Serializable {
    private static final long serialVersionUID=1L;
    private int Codigo;
    private int Cedula;
    private String Nombre;
    private String Apellido;

    public MiEstudiante(int codigo, int cedula, String nombre, String apellido) {
        Codigo = codigo;
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
    }
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
    public int getCedula() {
        return Cedula;
    }
    public void setCedula(int cedula) {
        Cedula = cedula;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    @Override
    public String toString() {
        return "MiEstudiante{" + "Codigo:" + Codigo +
                ", Cedula:" + Cedula +
                ", Nombre:'" + Nombre + '\'' +
                ", Apellido:'" + Apellido + '\'' +
                '}';
    }
}
