package ar.edu.davinci.Builder;

public interface BuilderLineaEncargados {
    BuilderLineaEncargados agregarRecepcionista();
    BuilderLineaEncargados agregarSupervisor();
    BuilderLineaEncargados agregarGerente();
    BuilderLineaEncargados agregarCEO();
    LineaEncargados build();
}