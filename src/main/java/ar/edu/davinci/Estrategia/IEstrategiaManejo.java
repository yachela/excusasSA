package ar.edu.davinci.Estrategia;

import ar.edu.davinci.Dominio.Excusa.Excusa;
import ar.edu.davinci.Manejador.Encargado;

public interface IEstrategiaManejo {
    void manejar(Encargado encargado, Excusa excusa);
}
