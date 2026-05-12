package metodosJava;

import java.util.Scanner;

public class gestion_monitoreo_museos_inteligentes {

    // El sistema debe registrar información sobre piezas de arte, temperatura
    // ambiental,
    // niveles de humedad, iluminación y movimientos de personas dentro de las
    // diferentes salas del museo.

    // La complejidad del problema surge porque muchas obras poseen un valor
    // histórico incalculable
    // y requieren condiciones ambientales estrictamente controladas para evitar
    // deterioro.

    // El programa debe analizar continuamente datos de sensores ambientales para
    // detectar cambios peligrosos de temperatura,
    // humedad o exposición

    // a la luz que puedan afectar pinturas, esculturas o documentos antiguos.
    // Además,

    // el sistema debe controlar accesos de visitantes,

    // monitorear cámaras de seguridad y detectar comportamientos
    // sospechosos o intentos de robo mediante inteligencia de video y sensores de
    // movimiento.
    // Cuando se detecte una anomalía, el sistema debe activar alarmas automáticas y
    // notificar al personal de seguridad.

    // Otro desafío importante consiste en gestionar grandes cantidades de
    // visitantes durante exposiciones especiales o temporadas turísticas.
    // El programa debe calcular niveles de ocupación, optimizar rutas de recorrido
    // y evitar aglomeraciones que puedan representar riesgos para las obras o los
    // asistentes.
    // Asimismo, la plataforma debe generar reportes completos sobre cantidad de
    // visitantes, conservación de piezas, incidentes de seguridad y eficiencia
    // operativa.
    // El diseño debe ser modular y escalable para permitir futuras integraciones
    // con realidad aumentada,
    // inteligencia artificial y sistemas interactivos avanzados para mejorar la
    // experiencia cultural de los visitantes.
    Scanner scanner = new Scanner(System.in);

    // Métodos de registro de obras

    public ObraDeArte[] registrarObrasDeArte() {

        System.out.println("Cuantas obras de arte desea registrar");
        int cantidadObras = scanner.nextInt();
        scanner.nextLine();
        ObraDeArte[] obras = new ObraDeArte[cantidadObras];
        for (int i = 0; i < cantidadObras; i++) {
            System.out.print("Ingrese el nombre de la obra: ");
            String nombre = scanner.nextLine();
            System.out.print("La obra posee valor historico /true o false: ");
            boolean valorHistorico = scanner.nextBoolean();
            scanner.nextLine();
            System.out.print("Ingrese el tipo de obra: ");
            String tipoObra = scanner.nextLine();
            obras[i] = new ObraDeArte(nombre, valorHistorico, tipoObra);

        }
        // registrar si posee valor historico
        // Registrar Tipo de obra de arte
        return obras;
    }

    public double registrarValidarTemperaturaDelAmbiente(double temperatura) {
        double temperaturaAmbienteIdeal = 20;
        System.out.println("Ingrese la temperatura actual");
        temperatura = scanner.nextDouble();

        if (temperatura > temperaturaAmbienteIdeal) {
            System.out.println("!La temperatura está alta para las obras de arte");
        } else {
            System.out.println("La temperatura es ideal");
        }
        return temperatura;
    }

    public double[] registrarNivelesDeHumedad(double[] humedad) {
        // detectar cambios peligrosos de Humedad
        for (int i = 1; i < humedad.length; i++) {
            System.out.println("Ingrese los valores del punto" + (i + 1));
            humedad[i] = scaner.nextDouble();

            if (i > 0) {
                if (humedad[i] - humedad[i - 1] > 30) {
                    System.out.println("Se detectó un cambio peligroso de humedad en el punto: " + (i));
                }

            }
        }
        return humedad;
    }
/* public double registrarRevisionNivelesDeIluminacion(double iluminacion) {

    }
 */
   
    // Métodos de control y seguridad

    public void alertaAnomalia() {
        System.out.println("!!!!! Se detectó una Anomalía !!!!!");
    }

    // MÉTODOS DE CONTROL DE ACCESO
    public VisitanteMuseo[] registrarAccesoSala() {
         int aforoMaxSala = 10;
        VisitanteMuseo[] visitantes = new VisitanteMuseo[aforoMaxSala];
       int contador = 0;
        do {
            System.out.println("Ingresar un visitante");
            System.out.println("Ingrese el nombre del visitante");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el documento del visitante");
            String documento = scanner.nextLine();
            System.out.println("Ingrese la edad del visitante");
            String edad= scanner.nextLine();
            System.out.println("Para dejar de registrar visitantes ingrese el #1 , de lo contrario escriba el #2");
            scanner.nextInt();
            int decicionRegistro = scanner.nextInt();
            visitantes[contador]= new VisitanteMuseo(nombre, documento, edad);
            contador++;
        }while(contador < aforoMaxSala && decicionRegistro != 1 );
return visitantes;
    }

    public void reportesVisitantes (VisitanteMuseo[] visitantes) {
for (int i = 0 ; i <visitantes.length ; i++){
System.out.println(visitantes[i].nombre);
System.out.println(visitantes[i].documento);
System.out.println(visitantes[i].edad);
}
    }

    public boolean[] registroDeAnomalias(bolean anomalia) {

    }

    public static void main(String[] args) {
        gestion_monitoreo_museos_inteligentes museos = new gestion_monitoreo_museos_inteligentes();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenidos al sistema de gestión y");
        System.out.println("Monitoreo de museos inteligentes");
        System.out.println("----------------------------------------------");
        System.out.println("Ingrese el # 1 para registrar una obra de arte");
        System.out.println("Ingrese el # 2 para registrar visitantes");
        System.out.println("Ingrese el # 3 para verificar estado de las salas");
        System.out.println("-----------------------------------------------");
        int decicionMenu = scanner.nextInt();

        if (decicionMenu == 1) {
            ObraDeArte[] obrasRegistradas = museos.registrarObrasDeArte();
            for (int i = 0; i < obrasRegistradas.length; i++) {
                System.out.println(obrasRegistradas[i].nombre);
                System.out.println(obrasRegistradas[i].valorHistorico);
                System.out.println(obrasRegistradas[i].tipoObra);
            }
        } else if (decicionMenu == 2) {
            System.out.println("Bienvenido, registre un visitante");
            VisitanteMuseo[] visitante = museos.registrarAccesoSala();
            System.out.println("Reporte de visitantes");
            museos.reportesVisitantes(visitantes);

        } else if (decicionMenu == 3) {
            System.out.println("Verificar condiciones de las salas ");
            String temp = museos.registrarValidarTemperaturaDelAmbiente(opcion);
            System.out.println("Temperatura registrada: " + temp);
            System.out.println("Verificar que no existan cambios peligrosos de humedad");
            double humedad[] = new double[5];
            humedad = museos.registrarNivelesDeHumedad(humedad);
        }

    }
}
