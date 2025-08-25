package me.gonzager.ex.operaciones.Misiones;

import me.gonzager.ex.operaciones.Drones.Dron;

public abstract class Mision {

    public abstract Integer eficienciaOperativa();
    // es un metodo asbtracto osea que en las otras dos clases
    // lo tengo que hacer dar un valor porque sino TIRA ERROR

    public abstract Boolean esAvanzadoSegunMision(Dron dron);
    // LE PASO POR PARAMETRO EL DRON PERO COMO NO SE CUAL ES EN PARTICULAR
    // ENTONCES LE PASO EL TIPO DRON EN SI
}
