public class EmpleadoAsalariado extends Empleado {

    private double salarioFijo;

    public EmpleadoAsalariado(String nombre, String apellido, String sexo, int añosServicios, double salarioFijo) {
        super(nombre, apellido, sexo, añosServicios);
        this.salarioFijo = salarioFijo;
    }

    public double getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    public double bonoMensual() {
        double bono = 0;
        if (getAñosServicios() >= 5) {
            bono = salarioFijo * 0.10;
        }
        return salarioFijo + bono;
    };

    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Años de servicio: " + getAñosServicios());
        System.out.println("Salario Fijo: $" + salarioFijo);

        if (getAñosServicios() >= 5) {
            System.out.println("Bono aplicado: 10%");
        } else {
            System.out.println("No aplica bono mensual");
        }

        System.out.println("Salario total mensual: $" + bonoMensual());
        System.out.println(" ");
    }
}

