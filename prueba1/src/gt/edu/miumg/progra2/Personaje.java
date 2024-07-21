package gt.edu.miumg.progra2;

public abstract class Personaje {

     private String nombre;
     private String descripcion;
     private long tamaño;
     private int poder;
     private int vida;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getTamaño() {
        return tamaño;
    }

    public void setTamaño(long tamaño) {
        this.tamaño = tamaño;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public abstract void desplazarse () ;
    public abstract int mostrarVida ();
    public abstract void mostrarPoder ();
}



