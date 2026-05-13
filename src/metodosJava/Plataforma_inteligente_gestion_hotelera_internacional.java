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

public double []definirUbicacion( double[] precioUbicaciones){
    for(int i = 0; i<precioUbicaciones.length; i++){
System.out.println("Ingrese el precio base de la ubicación # " + (i+1));
 precioUbicaciones[i]= scanner.nextDouble();
  
    }
    return precioUbicaciones;
}

public double []mostrarUbicacion ( double [] precioUbicaciones){
    for(int i = 0 ; i< precioUbicaciones.length; i++){
System.out.println("Ubicación "+" "+ (i+1)+ "precio base: "+ precioUbicaciones[i]);
    }
    return precioUbicaciones;
}

public double escogerUbicacion (double[] precioUbicaciones){
    double precioBase = 0;
    int ubicacionEscogida = 0;

    System.out.println("Escoger ubicación");
    System.out.println("digite 1 para ubicación #1");
    System.out.println("digite 2 para ubicación #2");
    System.out.println("digite 3 para ubicación #3");
    ubicacionEscogida = scanner.nextInt();

    if (ubicacionEscogida==1){
precioBase = precioUbicaciones[0];
        
        
    }else if (ubicacionEscogida==2){
precioBase = precioUbicaciones[1];
    
    }else if (ubicacionEscogida==3){
precioBase = precioUbicaciones[2];
     
    }
    System.out.println("Monto añadido: "+ precioBase);
    return precioBase;

}

public double calcularPrecioHabitacionUbicacion (double preciohabitacion, double precioBase ){
    double precioHabitacionUbicacion = preciohabitacion + precioBase ;
return precioHabitacionUbicacion;
}

public double realizarDescuentosPorMembresia (double precioHabitacionUbicacion){

    int decicionMembresia = 0;

    System.out.println("Descuentos por membrecía");
    System.out.println("Seleccione 1: Si es cliente PREMIUM");
    System.out.println("Seleccione 2: Si es cliente PLATINO");
    System.out.println("Seleccione 3: Si es cliente BASIC");
    decicionMembresia = scanner.nextInt();
    switch (decicionMembresia ){

        case 1:
           precioHabitacionUbicacion -= precioHabitacionUbicacion* 0.20;
            break;
        case 2:
           precioHabitacionUbicacion -= precioHabitacionUbicacion* 0.10;
           break;
           case 3 :
            break;
    }

return precioHabitacionUbicacion;

}
public static void main(String[] args){

    Plataforma_inteligente_gestion_hotelera_internacional tarifa = new Plataforma_inteligente_gestion_hotelera_internacional();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Úbicaciones disponibles ");
    //int cantidad = scanner.nextInt();
    double[]ubicacion = new double[3];
    ubicacion = tarifa.definirUbicacion(ubicacion);
    tarifa.mostrarUbicacion(ubicacion);
    double precioSeleccionado = tarifa.escogerUbicacion(ubicacion);
    double precioFinal = tarifa.validarTemporadaTuristica();
    System.out.println("Precio final: " + precioFinal);
    double precioFinalConUbicacion = tarifa.calcularPrecioHabitacionUbicacion(precioSeleccionado,precioFinal);
    System.out.println("Precio incluyendo monto base de ubicación equivale a: " +  precioFinalConUbicacion);
    double precioConDescuento = tarifa.realizarDescuentosPorMembresia(precioFinalConUbicacion);
    System.out.println("El precio con descuento por membrecía es : "+ precioConDescuento);
}
}
