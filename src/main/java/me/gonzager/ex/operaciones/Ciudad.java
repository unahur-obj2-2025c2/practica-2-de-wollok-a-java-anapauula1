package me.gonzager.ex.operaciones;

public class Ciudad {
    private static Ciudad instance = null;

    private Integer maximaCantidadPorEscuadron = 10;

    private Ciudad() {}

    public static Ciudad getInstance() {
        if (instance == null) {
            instance = new Ciudad();
        }
        return instance;
    }
    public void setMaximaCantidadPorEscuadron(Integer maximaCantidadPorEscuadron) {
        this.maximaCantidadPorEscuadron = maximaCantidadPorEscuadron;
    }
    public Integer getMaximaCantidadPorEscuadron() {
        return maximaCantidadPorEscuadron;
    }
}
