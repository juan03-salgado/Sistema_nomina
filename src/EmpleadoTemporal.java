public class EmpleadoTemporal extends Empleado {
    private double salarioFijo;
    private int duracionContratoMeses;

    public EmpleadoTemporal(String nombre, String apellido, String sexo, int añosServicios, double salarioFijo, int duracionContratoMeses) {
        super(nombre, apellido, sexo, añosServicios);
        this.salarioFijo = salarioFijo;
        this.duracionContratoMeses = duracionContratoMeses;
    }

    public double getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    public int getDuracionContratoMeses() {
        return duracionContratoMeses;
    }

    public void setDuracionContratoMeses(int duracionContratoMeses) {
        this.duracionContratoMeses = duracionContratoMeses;
    }

    public double calcularSalario() {
        return salarioFijo;
    }

    public void mostrarInformacion() {
        System.out.println("*****Empleado Temporal*****");
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Años de servicio: " + getAñosServicios());
        System.out.println("Duracion del contrato: " + duracionContratoMeses + " meses");
        System.out.println("Salario fijo mensual: $" + salarioFijo);
        System.out.println("No aplican bonos ni beneficios adicionales.");
        System.out.println("Salario total mensual: $" + calcularSalario());
        System.out.println();
    }
}