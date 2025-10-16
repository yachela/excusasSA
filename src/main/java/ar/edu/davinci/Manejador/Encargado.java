package ar.edu.davinci.Manejador;

import ar.edu.davinci.Dominio.Empleado;
import ar.edu.davinci.Dominio.Excusa.*;
import ar.edu.davinci.Dominio.Excusa.Motivo.MotivoCorteSuministro;
import ar.edu.davinci.Estrategia.IEstrategiaManejo;

public abstract class Encargado extends Empleado implements IManejadorExcusa{

    protected IManejadorExcusa siguiente;
    private IEstrategiaManejo estrategia;

    public Encargado(String nombre, String email, int legado){
        super(nombre, email, legado);
    }

    public void setEstrategia(IEstrategiaManejo estrategia){
        this.estrategia = estrategia;
    }

    public void setSiguiente(IManejadorExcusa siguiente){
        this.siguiente = siguiente;
    }

    @Override
    public void manejarExcusa(Excusa excusa){
        if(estrategia != null){
            this.estrategia.manejar(this, excusa);
        }
    }

    public IManejadorExcusa getSiguiente(){
        return siguiente;
    }

    public boolean procesar(Excusa excusa) {
        return excusa.serProcesadaPor(this);
    }

    public abstract boolean procesar(ExcusaTrivial excusa);

    public abstract boolean procesarMotivoEspecifico(MotivoCorteSuministro motivoCorteSuministro, Excusa excusa);

    public abstract boolean procesar(ExcusaCompleja excusa);

    public abstract boolean procesar(ExcusaInverosimil excusa);

    public abstract boolean procesar(ExcusaModerada excusa);
}
