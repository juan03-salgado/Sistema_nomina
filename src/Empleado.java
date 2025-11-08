public class Empleado {
    private String nombre;
    private String apellido;
    private String sexo;
    private int añosServicio;

    public Empleado(String nombre, String apellido, String sexo, int añosServicio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.añosServicio = añosServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAñosServicio() {
        return añosServicio;
    }

    public void setAñosServicio(int añosServicio) {
        this.añosServicio = añosServicio;
    }
}