package me.gonzager.ex.operaciones.Misiones;

import me.gonzager.ex.operaciones.Drones.Dron;

public class Transporte extends Mision {

    @Override
    public Integer eficienciaOperativa() {
        return 2;
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        return dron.getAutonomia() >= 50;
    }
}
