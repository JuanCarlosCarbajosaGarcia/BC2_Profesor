public class Profesor {
    private String nombre;
    private double salario;
    private String departamento;

    public Profesor(String nombre, double salario, String departamento) {
        setNombre(nombre);
        setSalario(salario);
        setDepartamento(departamento);
    }

    public void mostrarInformacion(){
        System.out.println("Salario: " + this.salario);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Departamento: " + this.departamento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <0){
            throw new IllegalArgumentException("El salario no puede ser negativo");
        }
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if (departamento == null || departamento.trim().isEmpty()) {
            throw new IllegalArgumentException("El departamento debe ser asignado");
        }
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return
                "[ nombre: " + nombre +
                ", salario: " + salario +
                ", departamento: " + departamento+
                " ]";
    }
}