public class EmpleadoComision extends Empleado{
    private double salarioBase;
    private double ventas;
    private double porcentajeComision;

    public EmpleadoComision(String nombre, String apellido, String sexo, int añosServicio, double salarioBase, double ventas, double porcentajeComision) {
        super(nombre, apellido, sexo, añosServicio);
        this.salarioBase = salarioBase;
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public double calcularSalario() {
        double salario = salarioBase + (ventas * porcentajeComision / 100);
        if (ventas > 20000000) {
            salario += ventas * 0.03;
        }
        return salario;
    }

    public void mostrarInformacion() {
        System.out.println("=== Empleado por Comisión ===");
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Años de servicio: " + getAñosServicio());
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Ventas realizadas: $" + ventas);
        System.out.println("Porcentaje comisión: " + porcentajeComision + "%");

        if (ventas > 20000000) {
            System.out.println("Bono adicional del 3% aplicado.");
        } else {
            System.out.println("No aplica bono adicional.");
        }

        System.out.println("Salario total mensual: $" + calcularSalario());
        System.out.println();
    }


}