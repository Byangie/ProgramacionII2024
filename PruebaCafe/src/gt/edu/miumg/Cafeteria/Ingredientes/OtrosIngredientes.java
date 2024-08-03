package gt.edu.miumg.Cafeteria.Ingredientes;

public class OtrosIngredientes implements Ingrediente{

    private String nombre;
    private double cantidad;

    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    //Constructor

    public OtrosIngredientes(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    //Implementacion
    @Override
    public void obtenerNombre() {

    }

    @Override
    public void obtenerCantidad() {

    }
}
