package gt.edu.miumg.Cafeteria.Cafe;

import gt.edu.miumg.Cafeteria.Ingredientes.Agua;
import gt.edu.miumg.Cafeteria.Ingredientes.Granos;
import gt.edu.miumg.Cafeteria.Ingredientes.Leche;

public class EspressoItaliano extends Cafe{

    private String intensidad;

    //Constructor
    public EspressoItaliano(String nombre, String tamano, int precio, Granos granos, Agua agua, Leche leche, String intensidad) {
        super(nombre, tamano, precio, granos, agua, leche );
        this.intensidad = intensidad;
    }

    //get y set
    public String getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(String intensidad) {
        this.intensidad = intensidad;
    }

    //Herencia
    @Override
    public void preparar() {
        super.preparar();
    }

    @Override
    public void Servir() {
        super.Servir();
    }
}
