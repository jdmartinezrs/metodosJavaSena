package actividadtres;
import java.util.Scanner;

public class Monitor_purificacion_aire_en_tunel_sena {

    //Usted ha sido contratado para desarrollar el software de monitoreo ambiental de un túnel 
    // vial de largo alcance.
    // 
    // El sistema recibe los niveles de monóxido de carbono (CO) y 
    // la densidad de visibilidad (neblina o humo) reportada por los sensores láser.
    //  A partir de esta información, el programa debe calcular el "Índice de Calidad del Aire Interior".

    //  El Ministerio de Transporte ha fijado un "Límite de Exposición Humana" 
    // que es una constante legal para todos los túneles del país, 
    // permitiendo que el cálculo de riesgo se realice de forma global. 

    // Tras obtener el índice de calidad, el sistema debe gestionar los extractores:
    //  si el aire es óptimo, se mantienen al mínimo; si es deficiente, 
    // se activan a plena potencia y se cierran los peajes de entrada.

    //  El sistema debe garantizar que si el nivel de CO llega a un punto de toxicidad extrema, 
    // se disparen las alarmas de evacuación y se genere un historial que guarde la densidad de visibilidad 
    // y el número de vehículos que se encuentran dentro del túnel en ese momento. 

    double nivelCO = 0;
    double densidadVisibilidad = 0;
    double temperaturaTunel = 0;
    double humedad = 0;
    
    boolean extractoresActivos = false;
    int potenciaExtractores = 0;
    boolean peajesAbiertos = false;
    boolean alarmaEvacuacion = false;
    
    int vehiculosDentro = 0;
   
    String horaIncidente = "";

    

Scanner  scanner = new Scanner(System.in);

    public double medirNivelesCO (){
        double limiteExposicionHumana = 100;
        System.out.println("Ingreselod niveles de CO en ppm");
        nivelCO = scanner.nextDouble();

if(nivelCO >=0 && nivelCO <= 25){
    System.out.println(" Nivel CO Seguro");
}else if(nivelCO >=26 && nivelCO <= 50){
    System.out.println(" Nivel CO Moderado");
}else if(nivelCO >=51 && nivelCO <= 100){
    System.out.println("Nivel CO Peligroso");
}else if(nivelCO> limiteExposicionHumana){
    System.out.println("Nivel CO Crítico , no apto para exposición Humana");
}
return nivelCO;
    }

    public double densidadVisibilidad(){
        System.out.println("sensor láser: Ingrese los niveles de desidad visibilidad");
        densidadVisibilidad = scanner.nextDouble();
        return densidadVisibilidad;

    }
    public double indiceCalidadAireInterior (double nivelCO , double densidadVisibilidad){

        double indiceCalidadAireInterior = (nivelCO *0.7)+(densidadVisibilidad*0.3);
if(indiceCalidadAireInterior >= 0 && indiceCalidadAireInterior <= 30){
    System.out.println("Índice de calidad aire interior ÓPTIMA ");
}else if (indiceCalidadAireInterior >=31  && indiceCalidadAireInterior <= 60){
    System.out.println("Índice de calidad aire interior ACEPTABLE");
}else if (indiceCalidadAireInterior >=61  && indiceCalidadAireInterior <= 80){
    System.out.println("Índice de calidad aire interior DEFICIENTE");
}else if (indiceCalidadAireInterior >=80 ){
    System.out.println("Índice de calidad aire interior CRÍTICA");
}
return indiceCalidadAireInterior;
    }

    public double controlExtractores (double indiceCalidadAireInterior){

        if(indiceCalidadAireInterior< 30){
extractoresActivos = true;
potenciaExtractores = 40;
System.out.println("Extractores encendidos a BAJA marcha");
System.out.println("Potencia de Extractores" + potenciaExtractores);
        } else if (indiceCalidadAireInterior > 60){
    extractoresActivos = true;
potenciaExtractores = 100;
System.out.println("Extractores encendidos a MÁXIMA marcha");
System.out.println("Potencia de Extractores" + potenciaExtractores);
    }
return indiceCalidadAireInterior;
}
      public boolean cierreDePeajes ( double indiceCalidadAireInterior, double nivelCO){
        if(indiceCalidadAireInterior > 80){
peajesAbiertos = false;
System.out.println("Baja Visibilidad");
System.out.println("Detener Tráfico");
System.out.println("Cerrando peajes");

        }else if (nivelCO > 100){
            System.out.println("El aire es peligroso");
            System.out.println("Detener Tráfico");
System.out.println("Cerrando peajes");
peajesAbiertos = false;
        }else {

        peajesAbiertos = true;
        System.out.println("Peajes abiertos");
        System.out.println("Tráfico permitido");
    }
return peajesAbiertos;
      }

public boolean evacuacionTunel (boolean peajesAbiertos,double indiceCalidadAireInterior, double nivelCO){
   double riesgototal = indiceCalidadAireInterior + nivelCO;
    if(peajesAbiertos == false){
        System.out.println("entra el protocolo crítico");
        System.out.println("EVACUACIÓN DEL TÚNEL");
        System.out.println("RIESGO TOTAL: " + riesgototal);
        alarmaEvacuacion = true;
        System.out.println("ALARMA EVACUACIÓN: " + alarmaEvacuacion);
    }
return alarmaEvacuacion;
}

public void historialIncidente(boolean alarmaEvacuacion,double indiceCalidadAireInterior, double nivelCO){
if(alarmaEvacuacion == true){
    System.out.println("REGISTRO HISTORIAL DE INCIDENTES");
    System.out.println("Ingrese la hora del incidente ");
    scanner.nextLine();
    horaIncidente = scanner.nextLine();
    System.out.println("Cunatos vehículos estaban dentro");
    vehiculosDentro = scanner.nextInt();
    System.out.println("Nivel Co : "+ nivelCO);
    System.out.println("indice Calidad Aire Interior : "+ indiceCalidadAireInterior);
    System.out.println("Estado emergencia	Evacuación");
}
}
    public static void main (String [] args){
        Monitor_purificacion_aire_en_tunel_sena tunel = new Monitor_purificacion_aire_en_tunel_sena();
        double CO = tunel.medirNivelesCO();
        double DV = tunel.densidadVisibilidad();
        double ICAI = tunel.indiceCalidadAireInterior(CO,DV);
        double extractor = tunel.controlExtractores(ICAI);
        boolean peajes = tunel.cierreDePeajes(ICAI,CO);
        boolean evacuacion = tunel.evacuacionTunel(peajes,ICAI,CO);
        tunel.historialIncidente(evacuacion,ICAI,CO);

    }
}
