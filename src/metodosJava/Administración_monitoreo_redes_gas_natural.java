package metodosJava;

import java.util.Scanner;

public class Administración_monitoreo_redes_gas_natural {


    static Scanner scanner = new Scanner(System.in);

//Detectar Fugas

//cambios peligrosos de presión
//iesgos de sobrepresión
//daños estructurales


//  Además, el sistema debe coordinar el suministro de gas hacia sectores residenciales, industriales y comerciales 
//  Garantizando estabilidad y seguridad operativa.
//  Alertas automáticas cuando se detecten riesgos de sobrepresión
// incendios 

//accesos no autorizados a instalaciones críticas.
//  El sistema también debe administrar mantenimientos preventivos y controlar inventarios de equipos
//  y repuestos especializados.

//  Asimismo, la plataforma debe generar reportes detallados sobre eficiencia operativa, 
//  incidentes de seguridad, consumo de gas y sostenibilidad ambiental.


//V A R I A B L E S 
double presionGas = 0;
double temperaturaTuberias = 0;
boolean fugaDegas = false;
double nivelGas = 0;
String tipoStringector = "residencial/industrial";
boolean accesoAutorizado = false;
double vibracion = "";
boolean humoDetectado = false;
boolean mantenimientoPendiente = false;

public String especificarTipoDeSector (){
String tipoEscogido = "";
String tipoSector [] = {"Residencial","Industrial"};
for(int i = 0; i<tipoSector.length; i ++){
}
System.out.println(" Especifique el tipo de sector ");
System.out.println(" Ingrese  #1 para Residencial  ");
System.out.println(" Ingrese  #2 para Industrial  ");
int decisionTipo = scanner.nextInt();
switch (decisionTipo){
    case 1:
        tipoSector = tipoSector[0];
        System.out.println("La residencia es de tipo " + tipoSector[0]);
        break;
    case 2:
        tipoSector = tipoSector[1];
System.out.println("La residencia es de tipo " + tipoSector[1]);
        break;
}
return tipoEscogido;
} 



public double registrarPresion(double presionActual, double presionAnterior){
    double diferenciaPresion =0;
    double minPresionSegura = 
    System.out.println("Ingrese el nivel de presión actual");
    presionActual = scanner.nextDouble();
    return presionActual;
}
 




    public static void main (String[] args){
Administración_monitoreo_redes_gas_natural gas = new Administración_monitoreo_redes_gas_natural();
 Scanner scanner = new Scanner(System.in);
    }
}