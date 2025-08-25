package me.gonzager.ex.operaciones.Drones;

import me.gonzager.ex.operaciones.Misiones.Mision;

public abstract class Dron {
    // ATRIBUTOS
    private Integer autonomia = 0;
    private final Integer procesamiento;
    private Mision mision; 
    // ES DE TIPO MISION LA NUEVA VARIABLE

    // PRIMER VALOR POR DEFECTO
    public Dron(){
        this.procesamiento = 0;   
    }
    // CONSTRUCTOR
    public Dron(Integer autonomia, Integer procesamiento, Mision mision) {
        this.autonomia = autonomia;
        this.procesamiento = procesamiento;
        this.mision = mision;
    }
    // GETTER AUTONOMIA
    public Integer getAutonomia() {
        return autonomia;
    }
    // GETTER PROCESAMIENTO
    public Integer getProcesamiento() {
        return procesamiento;
    } 
    // GETTER MISION
    public Mision getMision() {
        return mision;
    }
    // SETTER AUTONOMIA = VARIABLE
    public void setAutonomia(Integer autonomia) {
        this.autonomia = autonomia;
    }
    // SETTER MISION = VARIABLE
    public void setMision(Mision mision) {
        this.mision = mision;
    }

    /* --------- METODOS --------------- */
    // ¿quien lo puede ver? + tipo de dato que devuelve + nombre
    public Integer eficienciaOperativa(){
        return this.autonomia * 10 + mision.eficienciaOperativa();
        /*
          PARA PREGUNTAR MI AUTONOMIA UTILIZO THIS AHORA SI LA AUTONOMIA
          LA NECESITA OTRA CLASE QUE YO NO CONOZCO AHI UTILIZAMOS GETAUTONOMIA
         */
    }
    public abstract Boolean esAvazandoSegunTipo();
    // ABSTRACTO PORQUE AL VALOR DEL METODO LO DEBE PONER
    // CADA DRON EN PARTICULAR NO LA SUPERCLASE

    public Boolean esAvanzado(){
       return this.esAvazandoSegunTipo() || mision.esAvanzadoSegunMision(this);
    }
    // THIS PORQUE EL METODO ESTA EN DRON
}

