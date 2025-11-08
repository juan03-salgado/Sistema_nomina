public class Empleado {
    private String nombre;
    private String apellido;
    private String sexo;
    private int añosServicios;

    public Empleado(String nombre, String apellido, String sexo, int añosServicios){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.añosServicios = añosServicios;
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

    public int getAñosServicios() {
        return añosServicios;
    }

    public void setAñosServicios(int añosServicios) {
        this.añosServicios = añosServicios;
    }
}