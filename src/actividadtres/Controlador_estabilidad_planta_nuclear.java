package actividadtres;
import java.util.Scanner;


public class Controlador_estabilidad_planta_nuclear {
    //Usted debe programar el sistema de gestión térmica de las barras de combustible
    //  en una planta de generación nucleoeléctrica de última generación.

    //  El software recibe como señales de entrada el flujo de neutrones por centímetro cuadrado 
    // y el nivel del refrigerante líquido en el tanque de moderación. 
    // A partir de estos valores, el programa debe procesar el "Factor de Reactividad del Núcleo".
    //  La planta sigue una "Norma de Seguridad Nuclear Nacional" 
    // que define el límite de temperatura de fusión de las varillas de uranio,
    //  el cual es un estándar fijo para todos los reactores del complejo, 
    // permitiendo que el cálculo del margen de seguridad se realice de forma global 
    // por cualquier sistema de monitoreo.
    //  Tras obtener el factor de reactividad, 
    // el sistema debe decidir el posicionamiento de las barras de control: si el factor es estable, 
    // se mantiene la generación de energía al 100%; si la reactividad aumenta peligrosamente, 
    // se deben insertar las barras de grafito para absorber neutrones; 
    // y si se detecta una pérdida de refrigerante que comprometa la refrigeración,
    //  se debe activar el protocolo de "Parada de Emergencia Scram"
    // , inundando el núcleo con boro.

    //  La precisión en la programación es una cuestión de seguridad pública;
    //  si los sensores de neutrones reportan un valor de cero durante la operación activa
    //  o si el nivel de refrigerante se reporta como un valor negativo, 
    // el programa debe activar el protocolo de "Aislamiento de Contención Total". 
    
    // Este método debe devolver un informe de diagnóstico detallado que contenga la reactividad previa al fallo,
    //  el nivel de líquido registrado y el tiempo estimado para alcanzar la temperatura crítica.
    //  El aprendiz enfrentará el reto de diseñar métodos que manejen variables de alta precisión y
    //  aseguren que la lógica de software responda correctamente ante condiciones de riesgo extremo. 
    
    //Nucleares
    double nivelRefrigerante = 0; // Neutrones/cm²
    double factorReactividadNucleo = 0; //Nivel actividad nuclear
    double temperaturaNucleo = 0; //temperatura reactor
    double presionReactor = 0; //Presión Interna
    double flujoNeutrones = 0;
    //Refrigeración
  //Cantidad Líquido moderador
    double temperaturaRefrijerante = 0; //Temperatura refrigerante
    boolean perdidaRefrigerante = false; // Falla refrigeración

    //Variables de Seguridad
    double margenSeguridad = 0;
    boolean barrasInsertadas = false; //Estado barras control
    boolean scramActivo = false; //Emergencia nuclear
    boolean contencionTotal = false; //Aislamiento reactor
    boolean reactorActivo = false; //Reactor operando

    double velocidadCalentamiento = 0;
    double tiempoTemperaturaCritica = 0;
    Scanner scanner = new Scanner(System.in); 
    /*
Sensor neutrónico	Flujo de neutrones
Sensor térmico	Temperatura núcleo
Sensor presión	Presión reactor
Sensor nivel	Refrigerante líquido */

public double registrarFlujoNeutronico(){
    System.out.println("Sensor neutrónico registra flujo de neutrones ");
    System.out.println("Ingrese la cantidad de neutrones actual");
    flujoNeutrones =  scanner.nextDouble();
    if(flujoNeutrones == 0){
        contencionTotal = true;
        System.out.println("CONTENCIÓN TOTAL ACTIVADA");
    }
    else if(flujoNeutrones > 0 && flujoNeutrones < 300){
        System.out.println("Flujo ESTABLE");
    }else if (flujoNeutrones >= 301 && flujoNeutrones < 700){
        System.out.println("Flujo ELEVADO");
    }else if (flujoNeutrones >= 701 && flujoNeutrones < 1000){
        System.out.println("Flujo PELIGROSO");
    }else if(flujoNeutrones> 1000){
        System.out.println("Flujo CRÍTICO");
}
return flujoNeutrones;
}

public double revisionNivelRefrigerante(){
    System.out.println("Sin refrigeración:\r\n" + //
                "→ el reactor puede fundirse.");
                System.out.println("Sensor nivel registra el porcentaje de Refrijerante actual");
                System.out.println("Ingrese el nivel de refrijerante");
                nivelRefrigerante = scanner.nextDouble();
                 if(nivelRefrigerante >= 0 && nivelRefrigerante < 20){

        System.out.println("Nivel refrigerante: " + nivelRefrigerante + "%");
        System.out.println("EMERGENCIA");

        scramActivo = true;

        System.out.println("SCRAM ACTIVADO");
        System.out.println("Inundando núcleo con boro");
        System.out.println("Insertando barras de control");
        System.out.println("Deteniendo reacción nuclear");

    }else if(nivelRefrigerante < 0){

        contencionTotal = true;

        System.out.println("ERROR DE SENSOR");
        System.out.println("CONTENCIÓN TOTAL ACTIVADA");
       
    }else if (nivelRefrigerante >= 80 && nivelRefrigerante < 100){
        System.out.println("Nivel refrigerante: " + nivelRefrigerante + "%");
        System.out.println("SEGURO");
    }else if (nivelRefrigerante >= 50 && nivelRefrigerante < 79){
        System.out.println("Nivel refrigerante: " + nivelRefrigerante + "%");
        System.out.println("PRECAUCIÓN");
    }else if(nivelRefrigerante >= 20 && nivelRefrigerante < 49){
        System.out.println("Nivel refrigerante: " + nivelRefrigerante + "%");
        System.out.println("RIESGO ALTO");
}else if(nivelRefrigerante < 20){
        System.out.println("Nivel refrigerante: " + nivelRefrigerante + "%");
        System.out.println("EMERGENCIA");
}  
return nivelRefrigerante;
}
//FACTOR DE REACTIVIDAD DEL NÚCLEO
public double encontrarfactorReactividadNucleo(double nivelRefrigerante, double flujoNeutrones){
    factorReactividadNucleo = (flujoNeutrones*0.8)-(nivelRefrigerante*0.2);
    if(factorReactividadNucleo >= 0 && factorReactividadNucleo <= 300){
        System.out.println("Estado reactor: ESTABLE");
    } if(factorReactividadNucleo >= 301 && factorReactividadNucleo <= 600){
        System.out.println("Estado reactor: RIESGO MODERADO");
    } if(factorReactividadNucleo >= 601 && factorReactividadNucleo <= 800){
        System.out.println("Estado reactor: REACTIVIDAD ALTA");
    }if(factorReactividadNucleo > 800){
        System.out.println("Estado reactor: EMERGENCIA NUCLEAR");
    }
    return factorReactividadNucleo;
}

public double normaDeSeguridadNuclear(){
    
    double TemperaturaDeFusionDeUranio = 2800; //temperatura crítica
//Si el núcleo alcanza esa temperatura:
//→ posible desastre nuclear.
return TemperaturaDeFusionDeUranio;
}

public double calcularCuantoFaltaParaLlegarAlPuntoCritico (double TemperaturaDeFusionDeUranio ){
    System.out.println("Sensor térmico: cual es la temperatura actua del núcleo");
     temperaturaNucleo = scanner.nextDouble();
     margenSeguridad = TemperaturaDeFusionDeUranio - temperaturaNucleo;
return margenSeguridad;
}

    /**Las barras absorben neutrones.
Menos neutrones:
→ menos reacción nuclear. */
public double controlBarrasGrafito (double factorReactividadNucleo){
    if(factorReactividadNucleo >= 0 && factorReactividadNucleo <= 300){
        System.out.println("Mantener Energía");
    }else if(factorReactividadNucleo >= 301 && factorReactividadNucleo <= 600){
        System.out.println("Mantener Energía");
    }else if(factorReactividadNucleo >= 601 && factorReactividadNucleo <= 800){
        System.out.println("INSERTAR BARRAS DE GRAFITO");
        barrasInsertadas = true;
        if(barrasInsertadas == true){
        factorReactividadNucleo= factorReactividadNucleo - 250;
        }
        System.out.println("BARRAS DE GRAFITO INSERTADAS " + barrasInsertadas);
     }if(factorReactividadNucleo > 800){
        System.out.println("Estado reactor: EMERGENCIA NUCLEAR");
        System.out.println("factor Reactividad Nucleo crítico SCRAM ");
        scramActivo = true;
        System.out.println(" SCRAM Activo " + scramActivo  );
        System.out.println("parada inmediata del reactor");
        System.out.println("Insertar barras\tFrenar fisión\r\n" + //
                        "Liberar boro\tAbsorber neutrones\r\n" + //
                        "Cortar potencia\tSeguridad");

    }
return factorReactividadNucleo;
}

public double generacionCienPorcientoRevision (double factorReactividadNucleo){
if(factorReactividadNucleo >= 0 && factorReactividadNucleo <= 300){
        System.out.println("Barras parcialmente retiradas");
    }else if(factorReactividadNucleo >= 301 && factorReactividadNucleo <= 600){
        System.out.println("Barras parcialmente retiradas");}
        return factorReactividadNucleo;
}

public double calcularTiempoRestanteParaTemperaturaCritica (double TemperaturaDeFusionDeUranio
   ){
    System.out.println("Ingrese velocidad de calentamiento");
    velocidadCalentamiento = scanner.nextDouble();

 double tiempoTemperaturaCritica = (TemperaturaDeFusionDeUranio - temperaturaNucleo) /velocidadCalentamiento;
  System.out.println(
"Tiempo estimado para temperatura crítica: "
+ tiempoTemperaturaCritica + " minutos"
);
 return tiempoTemperaturaCritica;

}

    public static void main (String [] args){
        Controlador_estabilidad_planta_nuclear AtomoSafe = new  Controlador_estabilidad_planta_nuclear();
double SensorNeutronico = AtomoSafe.registrarFlujoNeutronico();
double SensorNivel = AtomoSafe.revisionNivelRefrigerante();
double FRN = AtomoSafe.encontrarfactorReactividadNucleo(SensorNivel, SensorNeutronico);
double MS = AtomoSafe.calcularCuantoFaltaParaLlegarAlPuntoCritico(FRN);
double barras= AtomoSafe.controlBarrasGrafito(FRN);
double generacionCien= AtomoSafe.generacionCienPorcientoRevision(FRN);
double norma = AtomoSafe.normaDeSeguridadNuclear();
   double TTC = AtomoSafe.calcularTiempoRestanteParaTemperaturaCritica(norma);
}
}
