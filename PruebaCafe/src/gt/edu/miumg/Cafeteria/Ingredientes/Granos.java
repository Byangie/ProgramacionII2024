package gt.edu.miumg.Cafeteria.Ingredientes;

public class Granos implements Ingrediente{

   private String tipo;
   private double cantidad;

   //get y set

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    //Constructor

    public Granos(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    //Implementación
    @Override
    public void obtenerNombre() {

    }

    @Override
    public void obtenerCantidad() {

    }
}
