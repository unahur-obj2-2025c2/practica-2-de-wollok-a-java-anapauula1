package me.gonzager.ex.operaciones;

public class Zona {
    private final Integer tamaño;
    private Integer operacionRecibida = 0;

    // CONSTRUCTOR PARA INSTANCIAR CLASES
    public Zona(Integer tamaño, Integer operacionRecibida) {
        this.tamaño = tamaño;
        this.operacionRecibida = operacionRecibida;
    }
    // GETTER DE AMBAS ATRIBUTOS
    public Integer getTamaño() {
        return tamaño;
    }
    public Integer getOperacionRecibida() {
        return operacionRecibida;
    }

    /* ----- METODO --------- */
    public void recibirOperacion(Integer operacionRecibida){
        this.operacionRecibida += 1;
    }
}
