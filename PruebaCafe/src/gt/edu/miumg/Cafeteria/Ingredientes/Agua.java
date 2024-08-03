package gt.edu.miumg.Cafeteria.Ingredientes;

public class Agua implements Ingrediente{

    private double cantidad;

    //get y set
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    //Constructor

    public Agua(double cantidad) {
        this.cantidad = cantidad;
    }

    //Herencia
    @Override
    public void obtenerNombre() {

    }

    @Override
    public void obtenerCantidad() {


    }
}
