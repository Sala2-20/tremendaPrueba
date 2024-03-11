package EX2_UñaHernan;

public abstract class Empleado {
    int id;
    String nombre;
    double salarioBase = 3000;

    public Empleado() {

    }

    public void Empleado(int id, String nombre, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public double calcularSalario() {
        return calcularSalario();
    }

    public void mostrar() {
        System.out.println("El sueldo de " + nombre + " con id " + id + "es de: " + calcularSalario());
    }
}
