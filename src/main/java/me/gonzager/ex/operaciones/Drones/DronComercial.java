package me.gonzager.ex.operaciones.Drones;

import me.gonzager.ex.operaciones.Misiones.Mision;

public class DronComercial extends Dron{
    
    public DronComercial(){
        super(); // HEREDA EL VALOR POR DEFECTO
    }

    public DronComercial (Integer autonomia, Integer procesamiento, Mision mision){
        super(autonomia, procesamiento, mision);
    }

    @Override
    public Boolean esAvazandoSegunTipo() {
        return Boolean.FALSE;
    }

    
}
