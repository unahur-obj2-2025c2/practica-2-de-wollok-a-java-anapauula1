package me.gonzager.ex.operaciones;

import java.util.ArrayList;
import java.util.List;
import me.gonzager.ex.operaciones.Drones.Dron;

public class Escuadron {
    List<Dron> droneList = new ArrayList<>();
    // LISTA VACIA DE DRONES

     public Escuadron(List<Dron> droneList) {
        this.droneList = droneList;
    }
    /* -------- METODOS ------------- */
    // si el escuadron puede operar en mas de una zona
    public Boolean puedeOperar(Zona zona){
        return this.alMenosUnAvanzado() && this.eficienciaOperativa() * 1.5 > zona.getTamaño();
    }
    // al menos un dron avanzado
    public Boolean alMenosUnAvanzado(){
        return droneList.stream().anyMatch(droneList -> droneList.esAvanzado());
    }
    // eficiencia operativa
    public Integer eficienciaOperativa(){
        return droneList.stream().mapToInt(droneList -> droneList.eficienciaOperativa()).sum();
    }
    // mapToInt = pasa los datos a numericos !!!!
}
