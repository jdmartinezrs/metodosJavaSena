package metodosJava;
import java.util.Scanner;

public class Plataforma_inteligente_gestion_hotelera_internacional {
    //Caso 11: Plataforma inteligente de gestión hotelera internacional
 //Una cadena hotelera internacional necesita desarrollar un sistema avanzado capaz 
 // de administrar reservas, habitaciones, servicios adicionales y operaciones financieras
 //  en múltiples hoteles ubicados en diferentes países.
 // 
 Scanner  scanner = new Scanner (System.in) ;

public String [][]reservaDeHabitaciones( String [][] habitaciones ){

    String[] campos =  {"nombre", "apellido", "cedula" , "Servicio adicional"};

    for(int i = 0 ;i< habitaciones.length; i++){

        System.out.println("Registro de habitación " + (i+1));
        for(int j = 0 ; j< habitaciones[i].length; j ++){
System.out.println("Ingrese su: " + campos[j] + ": " );
habitaciones[i][j] = scanner.nextLine();
        }

    }
 //El sistema debe registrar
 // información detallada de huéspedes, disponibilidad de habitaciones, 
 // temporadas turísticas, métodos de pago y servicios contratados, incluyendo restaurantes,
 //  transporte y actividades recreativas. 
return habitaciones;

 }
 public double validarTemporadaTuristica (){
int temporada = 0;
double preciohabitacion = 0;
System.out.println("Ingrese el precio de la habitación ");
preciohabitacion = scanner.nextDouble();

System.out.println("Validar si es una fecha de temporada turística");
System.out.println("Ingrese: ");
System.out.println("1. Si la reserva es en DICIEMBRE/ENERO ");
System.out.println("2. Si la reserva es en SEMANA SANTA ");
System.out.println("3. Si la reserva es en JUNIO/JULIO ");
System.out.println("4. Si la reserva es en un DÍA FESTÍVO ");
System.out.println("5. Si la reserva es en una FECHA DISTÍNTA ");
 temporada = scanner.nextInt();

    switch (temporada) {
        case 1: 
        System.out.println("Es una temporada turística");
        System.out.println("la reserva es en DICIEMBRE/ENERO, el precio aumenta 30%");
        preciohabitacion = preciohabitacion + ( preciohabitacion* 0.30 );
        break;

        case 2:
        System.out.println("Es una temporada turística");
        System.out.println("la reserva es en SEMANA SANTA, el precio aumenta 20%");
        preciohabitacion = preciohabitacion + ( preciohabitacion* 0.20 );
        break;

        case 3:
       System.out.println("Es una temporada turística");
       System.out.println("la reserva es en JUNIO/JULIO, el precio  aumenta 35%");
        preciohabitacion = preciohabitacion + ( preciohabitacion* 0.35 );
        break;

       case 4:
       System.out.println("Es una temporada turística");
       System.out.println("la reserva es en un DÍA FESTÍVO , el precio  aumenta 10%");
        preciohabitacion = preciohabitacion + ( preciohabitacion* 0.10 );
        break;

        case 5:
       System.out.println("NO Es una temporada turística");
       System.out.println(" el precio  aumenta NO aumenta");
        break;

    }
    return preciohabitacion;
}

public static void main(String[] args){
    Plataforma_inteligente_gestion_hotelera_internacional tarifa = new Plataforma_inteligente_gestion_hotelera_internacional();

    double precioFinal = tarifa.validarTemporadaTuristica();

     System.out.println("Precio final: " + precioFinal);
}
 
 //La complejidad del problema aumenta porque las tarifas cambian dinámicamente según 
 // temporada, demanda, ubicación y eventos especiales.
 
 //  El sistema debe calcular 
 // automáticamente precios actualizados, aplicar descuentos personalizados
 //  y evitar problemas de sobreventa de habitaciones.
 // 
 
 //Además, debe detectar 
 // inconsistencias como reservas duplicadas, pagos incompletos o cancelaciones 
 // fraudulentas. 
 // 
 
 //Otro desafío importante consiste en coordinar la disponibilidad
 //  de habitaciones en tiempo real entre plataformas digitales, agencias de viaje 
 // y sistemas internos del hotel.
 // 
 
 //El programa también debe controlar el estado de 
 // limpieza y mantenimiento de cada habitación, generando alertas cuando se detecten 
 // retrasos en servicios operativos. Además,
 // 
 
 //el sistema debe analizar el comportamiento
 //  de los clientes para generar recomendaciones personalizadas y mejorar la experiencia 
 // de hospedaje.
 // 
 
 
 //También debe producir reportes financieros sobre ingresos, ocupación
 //  hotelera, rentabilidad por temporada y nivel de satisfacción de huéspedes.


 //  La plataforma debe diseñarse de forma modular y escalable para permitir 
 // futuras integraciones con inteligencia artificial, reconocimiento facial, 
 // asistentes virtuales y sistemas automatizados de atención al cliente 
 // sin necesidad de reconstruir completamente el software. 

}
