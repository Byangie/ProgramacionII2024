package gt.edu.miumg.Cafeteria.Sucursal;

public class Equipo {
    private String tipo;
    private String estado;

    //get y set
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //Constructor

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    //métodos
    public void encender(){
        System.out.println("Encendiendo Equipo");
    }

    public void apagar(){
        System.out.println("Apagando Equipo");
    }
    public void reparar(){
        System.out.println("Reparando Equipo");
    }
}
