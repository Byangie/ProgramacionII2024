import gt.edu.miumg.Cafeteria.Cafe.Cafe;
import gt.edu.miumg.Cafeteria.Cafe.CafeColombiano;
import gt.edu.miumg.Cafeteria.Cafe.EspressoItaliano;
import gt.edu.miumg.Cafeteria.Ingredientes.Ingrediente;
import gt.edu.miumg.Cafeteria.Ingredientes.Granos;
import gt.edu.miumg.Cafeteria.Ingredientes.Agua;
import gt.edu.miumg.Cafeteria.Ingredientes.Leche;
import gt.edu.miumg.Cafeteria.Ingredientes.OtrosIngredientes;
import gt.edu.miumg.Cafeteria.Sucursal.Sucursal;
import gt.edu.miumg.Cafeteria.Sucursal.Empleado;
import gt.edu.miumg.Cafeteria.Sucursal.Equipo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crear empleados
        Empleado empleado1 = new Empleado("Juan Pérez", "Encargado", 2500);
        Empleado empleado2 = new Empleado("Ana Gómez", "Cajero", 2000);

        // Crear equipos
        Equipo equipo1 = new Equipo("Máquina de café", "Funcional");
        Equipo equipo2 = new Equipo("Molinillo", "En reparación");


        // Crear cafés
        Granos granos = new Granos("Arábica", 50);
        Agua agua = new Agua(100);
        Leche leche = new Leche("Entera", 500);

        Cafe espressoItaliano = new EspressoItaliano("Espresso Italiano", "Pequeño", 5, granos, agua, leche, "Fuerte");
        Cafe cafeColombiano = new CafeColombiano("Cafe Colombiano", "Grande", 15, granos, agua, leche, "Pequeño");

        //Lista de Empleados
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado1);
        empleados.add(empleado2);

        //Lista de Equipos
        List<Equipo> equipos = new ArrayList<>();
        equipos.add(equipo1);
        equipos.add(equipo2);

        //Lista de ingredientes
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(granos);
        ingredientes.add(agua);
        ingredientes.add(leche);

        //Lista de Cafes
        List<Cafe> cafes = new ArrayList<>();
        cafes.add(espressoItaliano);
        cafes.add(cafeColombiano);

        // Instanciar una sucursal
        Sucursal sucursal = new Sucursal("Sucursal Guatemala", "Zona 2", empleados, equipos, ingredientes, cafes);

        // Usar los métodos de la sucursal
        sucursal.agregarEmpleado(new Empleado("Luis Martínez", "Limpiador", 1500));
        sucursal.agregarIngrediente(new OtrosIngredientes("Azúcar", 200));
        sucursal.agregarEquipo(new Equipo("Molino de café", "Nuevo"));


        //Imprimir
        System.out.println("Sucursal: " + sucursal.getNombre());
        System.out.println("Dirección: " + sucursal.getDireccion());
        System.out.println("Empleados:");
        for (Empleado empleado : sucursal.getEmpleados()) {
            System.out.println("- " + empleado.getNombre() + ", " + empleado.getPuesto() + ", Salario: " + empleado.getSalario());
        }
        System.out.println("Equipos:");
        for (Equipo equipo : sucursal.getEquipos()) {
            System.out.println("- " + equipo.getTipo() + ", Estado: " + equipo.getEstado());
        }

        System.out.println("Cafés:");
        for (Cafe cafe : sucursal.getCafes()) {
            System.out.println("- " + cafe.getNombre() + ", Tamaño: " + cafe.getTamaño() + ", Precio: " + cafe.getPrecio());
        }


    }
}
