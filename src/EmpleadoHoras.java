public class EmpleadoHoras extends Empleado{
    private double tarifaHoras;
    private int horasTrabajadas;

    public EmpleadoHoras(String nombre, String apellido, String sexo, int añosServicios, double tarifaHoras, int horasTrabajadas) {
        super(nombre, apellido, sexo, añosServicios);
        this.tarifaHoras = tarifaHoras;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHoras;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHoras = tarifaHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalario() {
        int horasNormales = Math.min(horasTrabajadas, 40);
        int horasExtras = Math.max(horasTrabajadas - 40, 0);
        return (horasNormales * tarifaHoras) + (horasExtras * tarifaHoras * 1.5);
    }

    public void mostrarInformacion() {
        System.out.println("*****Empleado por Horas*****");
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Años de servicio: " + getAñosServicios());
        System.out.println("Tarifa por hora: $" + tarifaHoras);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("No aplica bono");
        System.out.println("Salario total semanal: $" + calcularSalario());
        System.out.println();
    }

}
