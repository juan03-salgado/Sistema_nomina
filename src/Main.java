import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("SISTEMA DE EMPLEADOS");
            System.out.println("1. Empleado Asalariado");
            System.out.println("2. Empleado por Horas");
            System.out.println("3. Empleado por Comisión");
            System.out.println("4. Empleado Temporal");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("Sexo: ");
                    String sexo = sc.nextLine();
                    System.out.print("Años de servicio: ");
                    int años = sc.nextInt();
                    System.out.print("Salario fijo: ");
                    double salarioFijo = sc.nextDouble();

                    EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(nombre, apellido, sexo, años, salarioFijo);
                    empleadoAsalariado.mostrarInformacion();
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    String nombre1 = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellido1 = sc.nextLine();
                    System.out.print("Sexo: ");
                    String sexo1 = sc.nextLine();
                    System.out.print("Años de servicio: ");
                    int años1 = sc.nextInt();
                    System.out.print("Tarifa por hora: ");
                    double tarifa1 = sc.nextDouble();
                    System.out.print("Horas trabajadas: ");
                    int horas = sc.nextInt();

                    EmpleadoHoras empleadoHoras = new EmpleadoHoras(nombre1, apellido1, sexo1, años1, tarifa1, horas);
                    empleadoHoras.mostrarInformacion();
                    break;

                case 3:
                    System.out.print("Nombre: ");
                    String nombre2 = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellido2 = sc.nextLine();
                    System.out.print("Sexo: ");
                    String sexo2 = sc.nextLine();
                    System.out.print("Años de servicio: ");
                    int años2 = sc.nextInt();
                    System.out.print("Salario base: ");
                    double base = sc.nextDouble();
                    System.out.print("Ventas realizadas: ");
                    double ventas = sc.nextDouble();
                    System.out.print("Porcentaje de comisión (%): ");
                    double comision = sc.nextDouble();

                    EmpleadoComision empleadoComision = new EmpleadoComision(nombre2, apellido2, sexo2, años2, base, ventas, comision);
                    empleadoComision.mostrarInformacion();
                    break;

                case 4:
                    System.out.print("Nombre: ");
                    String nombre3 = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellido3 = sc.nextLine();
                    System.out.print("Sexo: ");
                    String sexo3 = sc.nextLine();
                    System.out.print("Años de servicio: ");
                    int años3 = sc.nextInt();
                    System.out.print("Salario fijo mensual: ");
                    double salarioTemp = sc.nextDouble();
                    System.out.print("Duración del contrato (meses): ");
                    int duracion = sc.nextInt();

                    EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal(nombre3, apellido3, sexo3, años3, salarioTemp, duracion);
                    empleadoTemporal.mostrarInformacion();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
