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
//ambiente
    double nivelCO = 0;
    double densidadVisibilidad = 0;
    double temperaturaTunel = 0;
    double humedad = 0;
    // operativas
    boolean extractoresActivos = false;
    int potenciaExtractores = 0;
    boolean peajesAbiertos = false;
    boolean alarmaEvacuacion = false;
    //trafico 
    int vehiculosDentro = 0;
    double vehiculosPorMinuto = 0;

Scanner  scanner = new Scanner(System.in);
    public double medirNivelesCO (){
        System.out.println("Ingreselod niveles de CO en ppm");
        nivelCO = scanner.nextDouble();

if(nivelCO >=0 && nivelCO <= 25){
    System.out.println(" Nivel CO Seguro");
}else if(nivelCO >=26 && nivelCO <= 50){
    System.out.println(" Nivel CO Moderado");
}else if(nivelCO >=51 && nivelCO <= 100){
    System.out.println("Nivel CO Peligroso");
}else if(nivelCO> 100){
    System.out.println("Nivel CO Crítico");
}
return nivelCO;
    }

    public double densidadVisibilidad (){
        System.out.println("Ingrese los niveles de desidad visibilidad");
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


    public static void main (String [] args){
        
    }
}
