public class EstrategiaVaga implements IEstrategiaManejo {
    @Override
    public void manejar(Encargado encargado, Excusa excusa){
        if (encargado.getSiguiente() != null)
            encargado.getSiguiente().manejarExcusa(excusa);
    }
}
