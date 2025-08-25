package me.gonzager.ex.operaciones.Sensores;

public class Sensor {
    private final Integer capacidad;
    private final Integer durabilidad;
    private final Boolean mejorasTecnologicas;

    // CONSTRUCTOR PARA CREAR SENSORES
    public Sensor(Integer capacidad, Integer durabilidad, Boolean mejorasTecnologicas) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.mejorasTecnologicas = mejorasTecnologicas;
    }
    // GETTER CAPACIDAD = CONSTANTE
    public Integer getCapacidad() {
        return capacidad;
    }
    // GETTER DURABILIDAD = CONSTANTE
    public Integer getDurabilidad() {
        return durabilidad;
    }
    // GETTER MEJORAS = CONSTANTE
    public Boolean getMejorasTecnologicas() {
        return mejorasTecnologicas;
    }

    /* ----------- METODOS ------------- */
    public Integer eficienciaOperativa(){
        if(this.mejorasTecnologicas){
            return this.capacidad * 2;
        }
        else{
            return this.capacidad;
        }
    }
    public Boolean esDuradero(){
        return this.durabilidad > 2 * this.capacidad;
    }
}
