package ar.edu.davinci.Estrategia;

import ar.edu.davinci.Dominio.Excusa.Excusa;
import ar.edu.davinci.Manejador.Encargado;

public class EstrategiaVaga implements IEstrategiaManejo {
    @Override
    public void manejar(Encargado encargado, Excusa excusa){
        if (encargado.getSiguiente() != null)
            encargado.getSiguiente().manejarExcusa(excusa);
    }
}
