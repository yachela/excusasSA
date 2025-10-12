
# Excusas S.A. - Sistema de Gestión de Excusas

## Patrones de Diseño Implementados

* **Chain of Responsibility:** Modela la línea de mando (`Recepcionista` -\> `Supervisor` -\> `Gerente` -\> `CEO`) por la que viaja una excusa hasta ser procesada.
* **Strategy:** Permite cambiar el comportamiento de un `Encargado` (`Normal`, `Vago`, `Productivo`) sin alterar su clase, encapsulando cada comportamiento en un objeto separado.
* **Builder:** Proporciona una API fluida para construir la compleja cadena de responsabilidad de una manera ordenada y legible.
* **Bridge:** Desacopla la abstracción de una `Excusa` (ej. `ExcusaTrivial`) de la implementación de su `Motivo` (ej. `MotivoSimple`), permitiendo que ambos varíen de forma independiente.
* **Factory Method:** Encapsula la lógica de creación de los objetos `Excusa`, combinando la abstracción y la implementación correctas del patrón Bridge.
* **Observer:** Permite que los `CEO`s se suscriban a un sistema central de notificaciones para ser avisados cuando otro `CEO` registra un prontuario.
* **Singleton:** Garantiza una única instancia para el `AdminProntuarios` y para el `SistemaDeNotificacionesCEO`, gestionando recursos compartidos de forma centralizada.

## Diagrama de Clases (UML)

```mermaid
classDiagram
    direction LR

    %% --- Builder para la Cadena de Responsabilidad ---
    class IBuilderLineaEncargados {
        <<Interface>>
        +agregarRecepcionista()
        +agregarSupervisor()
        +agregarGerente()
        +agregarCEO()
        +build(): LineaEncargados
    }
    class BuilderLineaCompleta
    class LineaEncargados {
        -primerEncargado: IManejadorExcusa
    }
    IBuilderLineaEncargados <|.. BuilderLineaCompleta
    BuilderLineaCompleta ..> LineaEncargados : crea

    %% --- Cadena de Responsabilidad (Handlers) ---
    class Empleado
    class IManejadorExcusa { <<Interface>> }
    class Encargado {
        <<Abstract>>
        #siguiente: IManejadorExcusa
        #estrategia: IEstrategiaManejo
    }
    Empleado <|-- Encargado
    IManejadorExcusa <|.. Encargado
    BuilderLineaCompleta ..> Encargado : instancia

    class Recepcionista
    class SupervisorDeArea
    class GerenteDeRRHH
    class CEO
    Encargado <|-- Recepcionista
    Encargado <|-- SupervisorDeArea
    Encargado <|-- GerenteDeRRHH
    Encargado <|-- CEO

    %% --- Strategy para el Comportamiento ---
    class IEstrategiaManejo { <<Interface>> }
    class EstrategiaNormal
    class EstrategiaVaga
    Encargado o--> IEstrategiaManejo
    IEstrategiaManejo <|.. EstrategiaNormal
    IEstrategiaManejo <|.. EstrategiaVaga

    %% --- Bridge y Factory Method para Excusas ---
    class Excusa {
        <<Abstract>>
        #motivo: IMotivo
        #empleado: Empleado
    }
    class ExcusaTrivial
    class ExcusaModerada
    Excusa <|-- ExcusaTrivial
    Excusa <|-- ExcusaModerada

    class IMotivo { <<Interface>> }
    class MotivoSimple
    class MotivoCorteSuministro
    Excusa o--> IMotivo
    IMotivo <|.. MotivoSimple
    IMotivo <|.. MotivoCorteSuministro

    class CreadorExcusa {
        <<Abstract>>
        +crearExcusa(Empleado): Excusa
    }
    class CreadorExcusasTriviales
    CreadorExcusa <|-- CreadorExcusasTriviales
    CreadorExcusa ..> Excusa : crea

    %% --- Observer y Singleton para CEO ---
    class Sujeto { <<Interface>> }
    class Observador { <<Interface>> }
    CEO ..> AdminProntuarios : utiliza
    CEO ..> SistemaDeNotificacionesCEO : informa a
    SistemaDeNotificacionesCEO o--> "*" Observador
    Observador <|.. CEO
    Sujeto <|.. SistemaDeNotificacionesCEO

    class AdminProntuarios {
        -static instance
        +getInstance()
    }
     class SistemaDeNotificacionesCEO {
        -static instance
        +getInstance()
    }

    %% --- Utilidades ---
    class EmailSender { <<Interface>> }
    Encargado ..> EmailSender : utiliza
```