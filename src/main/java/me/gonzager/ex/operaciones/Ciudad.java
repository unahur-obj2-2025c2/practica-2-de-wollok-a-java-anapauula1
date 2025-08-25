package me.gonzager.ex.operaciones;

public class Ciudad {
    private static Ciudad instance = null;
    // GUARDO UNA UNICA INSTANCIA DE CIUDAD
    private Integer maximaCantidadPorEscuadron = 10;

    private Ciudad() {}
    // CONSTRUCTOR ---> PRIVADO
    // NADIE POR FUERA PUEDE CREAR INSTANCIAS DE LA CIUDAD

    public static Ciudad getInstance() {
        /*
         ESTE METODO CONTROLA QUE SE CREE UNA SOLA INSTANCIA
         */
        if (instance == null) {
            instance = new Ciudad();
        }
        return instance;
    }
    // GETTER Y SETTER DE LA VARIABLE
    public void setMaximaCantidadPorEscuadron(Integer maximaCantidadPorEscuadron) {
        this.maximaCantidadPorEscuadron = maximaCantidadPorEscuadron;
    }
    public Integer getMaximaCantidadPorEscuadron() {
        return maximaCantidadPorEscuadron;
    }
}
