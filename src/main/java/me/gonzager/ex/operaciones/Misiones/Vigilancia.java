package me.gonzager.ex.operaciones.Misiones;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.ex.operaciones.Drones.Dron;
import me.gonzager.ex.operaciones.Sensores.Sensor;

public class Vigilancia extends Mision {
    List<Sensor> sensoresLista = new ArrayList<>(); 
    // ARRAY LIST PARA CREAR UNA LISTA VACIA 

    @Override
    public Integer eficienciaOperativa() {
        return sensoresLista.stream().mapToInt(sensoresLista -> sensoresLista.eficienciaOperativa()).sum();
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        return sensoresLista.stream().allMatch(sensoresLista -> sensoresLista.esDuradero()); // esto es una lista 
    }
}
