package gt.edu.miumg.Cafeteria.Sucursal;

public class Empleado {
    private String nombre;
    private String puesto;
    private int salario;

    //Constructor
    public Empleado(String nombre, String puesto, int salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    // métodos
    public void trabajar(){
        System.out.println("Equipo trabajado");
    }

    public void tomarOrden(){
        System.out.println("Tomar Orden");
    }

}
