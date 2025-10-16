package ar.edu.davinci.Manejador;

import ar.edu.davinci.Dominio.Excusa.Excusa;

public interface IManejadorExcusa {
    void setSiguiente(IManejadorExcusa siguiente);
    void manejarExcusa(Excusa excusa);
}
