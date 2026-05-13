package metodosJava;

import java.util.Scanner;

public class Administración_monitoreo_redes_gas_natural {

    static Scanner scanner = new Scanner(System.in);

    // Detectar Fugas

    // cambios peligrosos de presión
    // iesgos de sobrepresión
    // daños estructurales

    // Además, el sistema debe coordinar el suministro de gas hacia sectores
    // residenciales, industriales y comerciales
    // Garantizando estabilidad y seguridad operativa.
    // Alertas automáticas cuando se detecten riesgos de sobrepresión
    // incendios

    // accesos no autorizados a instalaciones críticas.
    // El sistema también debe administrar mantenimientos preventivos y controlar
    // inventarios de equipos
    // y repuestos especializados.

    // Asimismo, la plataforma debe generar reportes detallados sobre eficiencia
    // operativa,
    // incidentes de seguridad, consumo de gas y sostenibilidad ambiental.

    // V A R I A B L E S
    double presionGas = 0;
    double temperaturaTuberias = 0;
    boolean fugaDegas = false;
    double nivelGas = 0;
    String tipoStringector = "";
    boolean accesoAutorizado = false;
    double vibracion = 0;
    boolean humoDetectado = false;
    boolean gasDetectado = false;
    boolean mantenimientoPendiente = false;
    double minPresionSegura = 0;
    double maxPresionSegura = 0;
    double deformacionTuberia= 0;
    boolean incendio = false;

    public String especificarTipoDeSector() {
        String tipoEscogido = "";
        String tipoSector[] = { "Residencial", "Industrial" };
        for (int i = 0; i < tipoSector.length; i++) {
        }
        System.out.println(" Especifique el tipo de sector ");
        System.out.println(" Ingrese  #1 para Residencial  ");
        System.out.println(" Ingrese  #2 para Industrial  ");
        int decisionTipo = scanner.nextInt();
        switch (decisionTipo) {
            case 1:
                tipoEscogido = tipoSector[0];
                System.out.println("La residencia es de tipo " + tipoSector[0]);
                break;
            case 2:
                tipoEscogido = tipoSector[1];
                System.out.println("La residencia es de tipo " + tipoSector[1]);
                break;
        }
        return tipoEscogido;
    }

    public double registrarPresion(String tipoEscogido) {
        System.out.println("Ingrese el valor de la presión de gas actual");
        double presionGas = scanner.nextDouble();
        if (tipoEscogido.equals("Residencial")) {
            minPresionSegura = 20;
            maxPresionSegura = 60;
            if (presionGas > maxPresionSegura) {
                System.out.println("Alerta Cerrar la válvula");
            }
            if (presionGas < minPresionSegura) {
                System.out.println("Alerta gas en el aire");
                fugaDegas = true;
                mantenimientoPendiente = true;
                System.out.print("¿Hay una fuga de gas? "+ fugaDegas);
                System.out.print("¿Requiere Mantenimiento? "+ mantenimientoPendiente );

            }
        }
        if (tipoEscogido.equals("Industrial")) {
            minPresionSegura = 70;
            maxPresionSegura = 150;
            if (presionGas > maxPresionSegura) {
                System.out.println("Alerta Cerrar la válvula");
            }
            if (presionGas < minPresionSegura) {
                System.out.println("Alerta gas en el aire");
                fugaDegas = true;
                mantenimientoPendiente = true;
                System.out.println("¿Hay una fuga de gas? "+ fugaDegas);
                System.out.print("¿Requiere Mantenimiento? "+ mantenimientoPendiente );
            }
        }
        return presionGas;
    }
   
    public double revisionVibracionesEstructurales(String tipoEscogido){
        
        System.out.println("Revisión de nivles de vibración");
        System.out.println("Ingrese el nivel de vibración");
        vibracion = scanner.nextDouble();
        if (tipoEscogido.equals("Residencial")) {
            if (vibracion >= 0 && vibracion <= 3){
                System.out.println("Niveles de vibración seguros");
            }else if (vibracion > 3 ){
                System.out.println("Riesgo crítico por Vibración");
                mantenimientoPendiente = true;
                System.out.print("¿Requiere Mantenimiento? "+ mantenimientoPendiente );

            }
        } else if (tipoEscogido.equals("Industrial")){
             if (vibracion >= 0 && vibracion <= 8){
                System.out.println("Niveles de vibración seguros");
            }else if (vibracion > 8 ){
                System.out.println("Riesgo crítico por Vibración");
                mantenimientoPendiente = true;
                System.out.print("¿Requiere Mantenimiento? "+ mantenimientoPendiente );
            }
        }
return vibracion;
    }

    public double revisiondeformacionTuberia(String tipoEscogido){
        System.out.println("Ingrese el nivel de deformación de tubería");
        deformacionTuberia = scanner.nextDouble();
          if (tipoEscogido.equals("Residencial")) {
            if (deformacionTuberia>= 0 && deformacionTuberia <= 2){
                System.out.println("Niveles de deformación seguros es igual o menor a 2mm");
            }else if (vibracion > 3 ){
                System.out.println("Riesgo crítico por deformación de tuberías supera lo 3mm");
                mantenimientoPendiente = true;
                System.out.print("¿Requiere Mantenimiento? "+ mantenimientoPendiente );
            }
        } else if (tipoEscogido.equals("Industrial")){
             if (deformacionTuberia >= 0 && deformacionTuberia <= 5){
                System.out.println("Niveles de deformación de tubería seguros no supera los 5mm");
            }else if (deformacionTuberia > 5 ){
                System.out.println("Riesgo crítico deformación de tubería, la deformación supera los 5mm");
                mantenimientoPendiente = true;
                System.out.print("¿Requiere Mantenimiento? "+ mantenimientoPendiente );
            }
        }
        return deformacionTuberia; 
    }

   
public double revisionTemperaturaTuberias(String tipoEscogido){
    System.out.println("Ingrese la temperatura actual de la tubería");
    temperaturaTuberias = scanner.nextDouble();
    if (tipoEscogido.equals("Residencial")) {
        if (temperaturaTuberias >= 20 && temperaturaTuberias <= 50){
            System.out.println("Niveles de temperatura estables,se encuentra entre: 20 – 50 °C");
        } else if (temperaturaTuberias > 50 ){
            System.out.println("Alerta Alta Temperatura: Riesgo crítico por superar los 50 °C");
            humoDetectado = true;
            System.out.println("Se detecta Humo en las tuberías");
            mantenimientoPendiente = true;
            System.out.println("¿Requiere Mantenimiento? " + mantenimientoPendiente);
        } else if (temperaturaTuberias <= 0){
            System.out.println("Alerta Alta :riesgo de congelamiento o fracturas");
        } else if (temperaturaTuberias > 0 && temperaturaTuberias < 20 ){
            System.out.println("Alerta Baja :riesgo de congelamiento o fracturas");
        }

    } else if (tipoEscogido.equals("Industrial")) {
        if (temperaturaTuberias >= 20 && temperaturaTuberias <= 70){
            System.out.println("Niveles de temperatura estables,se encuentra entre: 20 – 70 °C");
        } else if (temperaturaTuberias > 70){
            System.out.println("Alerta Alta Temperatura: Riesgo crítico por superar los 70°C");
            humoDetectado = true;
            System.out.println("Se detecta Humo en las tuberías");
            mantenimientoPendiente = true;
            System.out.println("¿Requiere Mantenimiento? " + mantenimientoPendiente);
        } else if (temperaturaTuberias <= 0){
            System.out.println("Alerta Alta :riesgo de congelamiento o fracturas");
        } else if (temperaturaTuberias > 0 && temperaturaTuberias < 20 ){
            System.out.println("Alerta Baja :riesgo de congelamiento o fracturas");
        }
    }

    return temperaturaTuberias;
}
           
public boolean protocoloIncendio(String tipoEscogido,double temperaturaTuberias,double presionGas){
    if(tipoEscogido.equals("Residencial") && temperaturaTuberias > 50){
        System.out.println("Activación de protocolo INCENDIOS Residenciales por temperatura extrema");
        if(humoDetectado == true){
            System.out.println("Se detecta HUMO en la zona");
        }if(fugaDegas == true){
            System.out.println("Se detecta GAS en la zona");
        }if(fugaDegas == true && humoDetectado == true){
            incendio = true;
            System.out.println("ALERTA INCENDIO: " + incendio + " llamar a los bomberos");
        }
    } else if(tipoEscogido.equals("Industrial") && temperaturaTuberias >= 70){
        System.out.println("Activación de protocolo INCENDIOS Industriales por temperatura extrema");
        if(fugaDegas == true){
            System.out.println("Se detecta GAS en la zona");
        }if(humoDetectado == true){
            System.out.println("Se detecta HUMO en la zona");
        }if(fugaDegas == true && humoDetectado == true){
            incendio = true;
            System.out.println("ALERTA INCENDIO: " + incendio + " llamar a los bomberos");
        }
    }
    return incendio;
}
         public boolean reporteEstructuralGeneral(double presionGas,double vibracion,double deformacionTuberia,double temperaturaTuberias,String tipoEscogido){
System.out.println ("Reporte general de infraestructura");
System.out.println ("Presión de gas: "+ presionGas);
System.out.println ("Vibración: "+ vibracion);
System.out.println ("Deformación de tubería : "+ deformacionTuberia);
System.out.println ("Temperatura de tubería : "+ temperaturaTuberias);
            return mantenimientoPendiente;
        }

    public static void main(String[] args) {
        Administración_monitoreo_redes_gas_natural gas = new Administración_monitoreo_redes_gas_natural();
        Scanner scanner = new Scanner(System.in);
        String sector = gas.especificarTipoDeSector();
        System.out.println("El tipo de sector escogido es " + sector);
        System.out.println("Revisión de daños estructurales");
        double presion = gas.registrarPresion(sector);
        double vibration = gas.revisionVibracionesEstructurales(sector);
        double deformacion = gas.revisiondeformacionTuberia(sector);
        double temperatura = gas.revisionTemperaturaTuberias(sector);
        boolean incendio = gas.protocoloIncendio(sector,temperatura, presion);
    }
}



//humoDetectado	boolean	incendio
/*Si vibracion > 10
O deformacion > 5
O temperatura > 90
O temperatura < 0

Entonces:
Posible daño estructural*/
//mantenimientoPendiente	boolean	control técnico