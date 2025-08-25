package me.gonzager.ex.operaciones.Misiones;

import me.gonzager.ex.operaciones.Drones.Dron;

public class Exploracion extends Mision{
    @Override
    public Integer eficienciaOperativa() {
        return 1;
    }
    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        return dron.eficienciaOperativa() % 2 == 0;
    }
    // ES AVANZADO SI LA DIVISION ES NUMERO PAR
}
