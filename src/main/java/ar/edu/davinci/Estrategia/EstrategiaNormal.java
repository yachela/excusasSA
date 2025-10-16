package ar.edu.davinci.Estrategia;

import ar.edu.davinci.Dominio.Excusa.Excusa;
import ar.edu.davinci.Manejador.Encargado;

public class EstrategiaNormal implements IEstrategiaManejo {
    @Override
    public void manejar (Encargado encargado, Excusa excusa){
        boolean procesada = encargado.procesar(excusa);
        if (!procesada && encargado.getSiguiente() != null) {
            encargado.getSiguiente().manejarExcusa(excusa);
        }
    }
}
