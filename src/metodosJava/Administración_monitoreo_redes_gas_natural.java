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
    String tipoStringector = "residencial/industrial";
    boolean accesoAutorizado = false;
    double vibracion = 0;
    boolean humoDetectado = false;
    boolean mantenimientoPendiente = false;
    double minPresionSegura = 0;
    double maxPresionSegura = 0;
    double deformacionTuberia= 0;

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
                System.out.print("¿Hay una fuga de gas? "+ fugaDegas);
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
                System.out.println("¿Hay una fuga de gas? "+ fugaDegas);
            }
        }
        return presionGas;
    }
        //vibración alta - double vibracion
//deformación alta - double deformacionTuberia
//temperatura extrema- double temperaturaTuberias
    public double revisionVibracionesEstructurales(String tipoEscogido){
        
        System.out.println("Revisión de nivles de vibración");
        System.out.println("Ingrese el nivel de vibración");
        vibracion = scanner.nextDouble();
        if (tipoEscogido.equals("Residencial")) {
            if (vibracion >= 0 && vibracion <= 3){
                System.out.println("Niveles de vibración seguros");
            }else if (vibracion > 3 ){
                System.out.println("Riesgo crítico por Vibración");
            }
        } else if (tipoEscogido.equals("Industrial")){
             if (vibracion >= 0 && vibracion <= 8){
                System.out.println("Niveles de vibración seguros");
            }else if (vibracion > 8 ){
                System.out.println("Riesgo crítico por Vibración");
            }
        }
return vibracion;
    }

    public static void main(String[] args) {
        Administración_monitoreo_redes_gas_natural gas = new Administración_monitoreo_redes_gas_natural();
        Scanner scanner = new Scanner(System.in);
        String sector = gas.especificarTipoDeSector();
        System.out.println("El tipo de sector escogido es " + sector);
        System.out.println("Revisión de daños estructurales");
        double presion = gas.registrarPresion(sector);
        double vibration = gas.revisionVibracionesEstructurales(sector);
    }
}

//humoDetectado	boolean	incendio
//mantenimientoPendiente	boolean	control técnico