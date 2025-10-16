package ar.edu.davinci.Observer;

import ar.edu.davinci.Dominio.Excusa.Excusa;
import ar.edu.davinci.Manejador.CEO;

public interface Observador {
    void notificar(CEO ceoOriginador, Excusa excusa);

    void agregarObservador(Observador o);

    void sacarObservador(Observador o);

    void notificarObservadores(Excusa excusa);
}