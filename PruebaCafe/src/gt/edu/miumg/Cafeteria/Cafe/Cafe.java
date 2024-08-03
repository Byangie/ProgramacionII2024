package gt.edu.miumg.Cafeteria.Cafe;

import gt.edu.miumg.Cafeteria.Ingredientes.Agua;
import gt.edu.miumg.Cafeteria.Ingredientes.Granos;
import gt.edu.miumg.Cafeteria.Ingredientes.Leche;

public class Cafe {
    private String nombre;
    private String tamaño;
    private int precio;
    //Composición
    private Granos granos;
    private Agua agua;
    private Leche leche;

    //Constructor
    public Cafe(String nombre, String tamano, int precio, Granos granos, Agua agua, Leche leche) {
        this.nombre = nombre;
        this.tamaño = tamano;
        this.precio = precio;
        this.granos = granos;
        this.agua = agua;
        this.leche = leche;
    }

    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Granos getGranos() {
        return granos;
    }

    public void setGranos(Granos granos) {
        this.granos = granos;
    }

    public Agua getAgua() {
        return agua;
    }

    public void setAgua(Agua agua) {
        this.agua = agua;
    }

    public Leche getLeche() {
        return leche;
    }

    public void setLeche(Leche leche) {
        this.leche = leche;
    }

    //Metodos
    public void preparar(){
        System.out.println("Preparando Cafe");
    }
    public void Servir(){
        System.out.println("Sirviendo Cafe");
    }
}
