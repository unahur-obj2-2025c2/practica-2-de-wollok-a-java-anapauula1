package me.gonzager.ex.operaciones.Misiones;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.ex.operaciones.Drones.Dron;
import me.gonzager.ex.operaciones.Sensores.Sensor;

public class Vigilancia extends Mision {
    List<Sensor> sensoresLista = new ArrayList<>(); // ¿esto es correcto? fijarse
    // ARRAY LIST PARA CREAR UNA LISTA VACIA 

    @Override
    public Integer eficienciaOperativa() {
        // MAP TO INT TRASFORMA CADA SENSOR EN NUMERICO INT
        return sensoresLista.stream().mapToInt(sensoresLista -> sensoresLista.eficienciaOperativa()).sum();
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        // ALL MATCH SI TODOS CUMPLEN LA CONDICION = TRUE
        return sensoresLista.stream().allMatch(sensoresLista -> sensoresLista.esDuradero()); // esto es una lista 
    }
}
