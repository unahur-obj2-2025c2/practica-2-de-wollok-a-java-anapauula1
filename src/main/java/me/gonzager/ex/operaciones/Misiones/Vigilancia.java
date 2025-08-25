package me.gonzager.ex.operaciones.Misiones;

import me.gonzager.ex.operaciones.Drones.Dron;

public class Vigilancia extends Mision {

    @Override
    public Integer eficienciaOperativa() {
        return 3;
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        return Boolean.TRUE; // esto es una lista 
    }
}
