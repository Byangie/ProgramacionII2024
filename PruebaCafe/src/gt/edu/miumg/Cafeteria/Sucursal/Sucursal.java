package gt.edu.miumg.Cafeteria.Sucursal;

import gt.edu.miumg.Cafeteria.Cafe.Cafe;
import gt.edu.miumg.Cafeteria.Ingredientes.Ingrediente;

import java.util.List;
import java.util.ArrayList;


public class Sucursal {
    private String nombre;
    private String direccion;
    //Asociacion
    private List<Empleado> empleados;
    private List<Equipo> equipos;
    private List<Ingrediente> ingredientes;
    //Agregación
    private List<Cafe> cafes;

    //Constructor
    public Sucursal(String nombre, String direccion, List<Empleado> empleados, List<Equipo> equipos, List<Ingrediente> ingredientes, List<Cafe> cafes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = (empleados != null) ? empleados : new ArrayList<>();
        this.equipos = (equipos != null) ? equipos : new ArrayList<>();
        this.ingredientes = (ingredientes != null) ? ingredientes : new ArrayList<>();
        this.cafes = (cafes != null) ? cafes : new ArrayList<>();
    }

    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public List<Cafe> getCafes() {
        return cafes;
    }

    //metodos
    public void agregarEmpleado (Empleado empleado){
        empleados.add(empleado);
    }
    public void agregarIngrediente (Ingrediente ingrediente){
       ingredientes.add(ingrediente);
    }
    public void agregarEquipo (Equipo equipo){
        equipos.add(equipo);
    }
    public void agregarEspecialidad (){
        System.out.println("Agregar Especialidad");
    }
}
