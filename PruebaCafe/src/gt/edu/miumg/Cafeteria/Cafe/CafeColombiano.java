package gt.edu.miumg.Cafeteria.Cafe;

import gt.edu.miumg.Cafeteria.Ingredientes.Agua;
import gt.edu.miumg.Cafeteria.Ingredientes.Granos;
import gt.edu.miumg.Cafeteria.Ingredientes.Leche;

public class CafeColombiano extends Cafe {
    private String tipoGrano;

    //Constructor
    public CafeColombiano(String nombre, String tamano, int precio, Granos granos, Agua agua, Leche leche, String tipoGrano) {
        super(nombre, tamano, precio, granos, agua, leche);
        this.tipoGrano = tipoGrano;
    }


    //get y set
    public String getTipoGrano() {
        return tipoGrano;
    }

    public void setTipoGrano(String tipoGrano) {
        this.tipoGrano = tipoGrano;
    }

    //Herencia
    @Override
    public void Servir() {
        super.Servir();
    }

    @Override
    public void preparar() {
        super.preparar();
    }
}
