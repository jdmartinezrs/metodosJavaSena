package metodosJava;

import java.util.Scanner;

public class Monitoreo_administracion_empresas_mensajeria{
/*Caso 72: Sistema inteligente de administración y monitoreo de empresas de mensajería y paquetería 
Una empresa internacional de mensajería necesita implementar un sistema inteligente capaz 
de controlar envíos, centros de distribución, vehículos de transporte y entregas realizadas 
en diferentes países.

El sistema debe registrar información sobre paquetes, rutas de reparto, tiempos de entrega, 
estado de vehículos y ubicación de mercancías en tiempo real. 
La complejidad del problema radica en que diariamente se procesan millones de paquetes
con diferentes prioridades, tamaños y destinos. El programa debe analizar continuamente
tráfico vehicular, condiciones climáticas y capacidad operativa de los centros logísticos
para optimizar rutas y garantizar entregas rápidas y seguras. Además, el sistema debe
detectar pérdidas de paquetes, errores de clasificación, retrasos logísticos
o intentos de fraude durante el proceso de distribución. Cuando se identifique una anomalía,
el programa debe generar alertas automáticas y reorganizar la operación logística
para minimizar impactos. Otro desafío importante consiste en coordinar
simultáneamente transporte terrestre, aéreo y marítimo bajo diferentes
regulaciones internacionales y procesos aduaneros.
El sistema también debe calcular costos operativos,
consumo de combustible y niveles de productividad de los repartidores.
Asimismo, la plataforma debe generar reportes completos sobre puntualidad de entregas, 
rentabilidad, incidentes logísticos y satisfacción de clientes. El diseño debe ser modular
y escalable para permitir futuras integraciones con inteligencia artificial, 
drones de reparto y vehículos autónomos de distribución. 

 *///Variables
 String numeroGuia = "";
double pesoPaquete = 0;
double tamanoPaquete = 0;
String paisDestino = "";
String [] prioridad = {"ALTA", "MEDIA", "BAJA"};
String []estadoEntrega = {"TRANSITO","ENTREGADA"};
String ubicaacionActual = "";
double tiempoEntrega = 0;
boolean retrasoDetectado = false;
boolean paquetePerdido = false;
boolean intentoFraude = false;
double traficoVehicular = 0;
String clima = "";
double velocidadVehiculo = 0;
int capacidadCentro = 0;
int cargaActualCentro = 0;
boolean vehiculoDisponible = false;
boolean mantenimientoPendiente = false;
double productividadRepartidor = 0;
double costoOperacion = 0;


    static Scanner scanner = new Scanner(System.in);

    public String[][] registroDePaquetes (String[][] paquete){


        for (int i = 0; i < paquete.length; i++  ){
System.out.println("Registro del paquete " + (i + 1));
System.out.println("Ingrese el número del paquéte: ");
paquete[i][0] = scanner.nextLine();
System.out.println("Ingrese el número del paquéte: ");
paquete[i][1] = scanner.nextLine();
System.out.println("Ingrese el destino: ");
paquete[i][2] = scanner.nextLine();
        }
         return paquete;
    }

    public String[][] registrarRutaDeReparto (String [][] rutas){
for (int i = 0; i< rutas.length; i++){
    System.out.println("Registrar nombre ruta ");
    rutas[i][0] = scanner.nextLine();
    System.out.println("Resgitrar origen de la encomienda")
}
        


return rutas;
    }

    public static void main(String[] args){
        Monitoreo_administracion_empresas_mensajeria encomienda = new  Monitoreo_administracion_empresas_mensajeria();
        Scanner scanner = new Scanner(System.in);
         System.out.println("Ingrese cuantos paquetes desea registrar");
        int cantidadPaquetes = scanner.nextInt();
        scanner.nextLine();
        String [][] encomiendas = new String [cantidadPaquetes][3];
        encomienda.registroDePaquetes(encomiendas);
    }
}