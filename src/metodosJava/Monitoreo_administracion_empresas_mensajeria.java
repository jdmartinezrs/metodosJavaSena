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
String estadoEntrega = "";
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

    public PaqueteEncomienda[] registroDePaquetes (){
 System.out.println("Cuantas paquetes desea registrar");
  int cantidadPaquetes = scanner.nextInt();
PaqueteEncomienda[] encomienda = new PaqueteEncomienda[cantidadPaquetes];
scanner.nextLine();
        for (int i = 0; i < cantidadPaquetes; i++  ){
System.out.println("Registro del paquete " + (i + 1));
System.out.println("Ingrese el número de guía del paquete: ");
numeroGuia = scanner.nextLine();
System.out.println("Ingrese la ubicación del paquete: ");
ubicaacionActual = scanner.nextLine();
System.out.println("Ingrese el aproximado de tiempo de entrega en horas/minutos: ");
tiempoEntrega = scanner.nextDouble();
scanner.nextLine();
System.out.println("Ingrese el Estado de la entrega: BODEGA/REPARTO/ENTREGADO ");
estadoEntrega = scanner.nextLine();
encomienda[i] = new PaqueteEncomienda (numeroGuia , ubicaacionActual, tiempoEntrega,estadoEntrega);
        }
         return encomienda;
    }

   
public PaqueteEncomienda[] modificarEstadoEncomienda(PaqueteEncomienda[] encomienda){
    System.out.println("Ingrese el número de guía del paquete que desea modificar:");
    String guiaBuscada = scanner.nextLine();
    boolean encontrado = false;
    for (int i = 0; i < encomienda.length; i++) {
        if(encomienda[i].getNumeroGuia().equals(guiaBuscada)){
            System.out.println("Ingrese el nuevo estado de entrega:");
            String nuevoEstado = scanner.nextLine();
            encomienda[i].setEstadoEntrega(nuevoEstado);
            System.out.println("Estado actualizado correctamente");
            encontrado = true;
        }
    }
    if(encontrado == false){
        System.out.println("No se encontró ningún paquete con esa guía");
    }
    return encomienda;
}

public PaqueteEncomienda[] modificarUbicacionyTiempoActualEncomienda(
        PaqueteEncomienda[] encomienda){
    System.out.println(
            "Ingrese el número de guía del paquete que desea modificar:");
    String guiaBuscada = scanner.nextLine();
    boolean encontrado = false;
    for (int i = 0; i < encomienda.length; i++) {
        if(encomienda[i].getNumeroGuia().equals(guiaBuscada)){
            System.out.println("Ingrese la nueva ubicación actual:");
            String nuevaUbicacion = scanner.nextLine();
            encomienda[i].setUbicacion(nuevaUbicacion);
            encontrado = true;
            System.out.println("Ingrese el aproximado de tiempo de entrega actual en horas/minutos:");
            double nuevoTiempoEntrega = scanner.nextDouble();
            encomienda[i].setTiempoEntrega(nuevoTiempoEntrega );
            System.out.println("Ubicación y tiempo actualizados");
            return encomienda;
        }
    }if(!encontrado){
        System.out.println("No se encontró el paquete");
    }return encomienda;
}

    public static void main(String[] args){
    Monitoreo_administracion_empresas_mensajeria encomienda =
            new Monitoreo_administracion_empresas_mensajeria();
    PaqueteEncomienda[] paquetes = encomienda.registroDePaquetes();
    for(int i = 0; i < paquetes.length; i++){
        System.out.println(paquetes[i].numeroGuia);
        System.out.println(paquetes[i].ubicaacionActual);
        System.out.println(paquetes[i].tiempoEntrega);
        System.out.println(paquetes[i].estadoEntrega);
    }
    encomienda.modificarEstadoEncomienda(paquetes);
       for(int i = 0; i < paquetes.length; i++){
        System.out.println(paquetes[i].numeroGuia);
        System.out.println(paquetes[i].ubicaacionActual);
        System.out.println(paquetes[i].tiempoEntrega);
        System.out.println(paquetes[i].estadoEntrega);
    }
    encomienda.modificarUbicacionyTiempoActualEncomienda(paquetes);
       for(int i = 0; i < paquetes.length; i++){
        System.out.println(paquetes[i].numeroGuia);
        System.out.println(paquetes[i].ubicaacionActual);
        System.out.println(paquetes[i].tiempoEntrega);
        System.out.println(paquetes[i].estadoEntrega);
    }
}
}

/*Registro de paquetes
Seguimiento en tiempo real
Control de rutas
Gestión de vehículos
Centros logísticos
Entregas internacionales
Tráfico y clima
Prioridades de envío
Detección de pérdidas
Errores de clasificación
Fraudes logísticos
Control aduanero
Costos operativos
Consumo de combustible
Productividad de repartidores
Alertas automáticas
Reportes
Inventario logístico */