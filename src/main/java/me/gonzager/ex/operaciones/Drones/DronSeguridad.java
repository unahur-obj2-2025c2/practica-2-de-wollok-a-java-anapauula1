package me.gonzager.ex.operaciones.Drones;

import me.gonzager.ex.operaciones.Misiones.Mision;

public class DronSeguridad extends Dron{
    public DronSeguridad(){
        super(); // HEREDA EL VALOR POR DEFECTO
    }
    public DronSeguridad (Integer autonomia, Integer procesamiento, Mision mision){
        super(autonomia, procesamiento, mision);
    }
    // SOBREESCRIBO EL METODO ASBTRACTO
    @Override
    public Boolean esAvazandoSegunTipo() {
        return this.getProcesamiento() > 50;
        // TENGO QUE PONER EL THIS
    }
}
