

package metodosJava;

import java.util.Scanner;

public class Integracion_inteligencia_artificial_para_analisis_tactico_en_deportes_de_equipo {
	
	// En un club profesional de baloncesto, los entrenadores necesitan un sistema que analice tácticas de juego con inteligencia artificial.
	//El sistema debe recibir datos de partidos (posesiones, tiros, rebotes, asistencias), procesarlos y generar recomendaciones tácticas en tiempo real.
	//No basta con estadísticas: debe identificar patrones de juego, detectar fortalezas y debilidades del rival y sugerir ajustes estratégicos durante el
	//partido, como reforzar la defensa en zona si el rival falla en tiros exteriores.
	//Este escenario es complejo porque exige trabajar con grandes volúmenes de datos, aplicar algoritmos de IA y generar recomendaciones tácticas en vivo.
	//En Java, los estudiantes deberán pensar en cómo estructurar módulos para registrar estadísticas, aplicar modelos de IA y generar reportes estratégicos,
	//con un diseño modular que pueda reutilizarse en otros deportes de equipo como fútbol o voleibol. 


    Scanner scanner = new Scanner(System.in);

    // Método para registrar estadísticas
    public String[] registrarEstadisticas(String[] estadisticas) {

        for (int i = 0; i < estadisticas.length; i++) {

            System.out.println("Ingrese la estadística del partido:");
            estadisticas[i] = scanner.nextLine();
        }

        return estadisticas;
    }

    // Método para mostrar estadísticas
    public void mostrarEstadisticas(String[] estadisticas) {

        System.out.println("\nEstadísticas registradas:");

        for (int i = 0; i < estadisticas.length; i++) {
            System.out.println(estadisticas[i]);
        }
    }

    // Método para generar recomendaciones tácticas
    public void generarRecomendacion(String[] estadisticas) {

        System.out.println("\nRecomendaciones tácticas:");

        for (int i = 0; i < estadisticas.length; i++) {

            if (estadisticas[i].equalsIgnoreCase("muchos tiros fallados")) {
                System.out.println("Reforzar entrenamiento de tiros exteriores");
            }

            else if (estadisticas[i].equalsIgnoreCase("pocos rebotes")) {
                System.out.println("Mejorar defensa y posicionamiento");
            }

            else {
                System.out.println("Mantener estrategia actual");
            }
        }
    }

    public static void main(String[] args) {

        Integracion_inteligencia_artificial_para_analisis_tactico_en_deportes_de_equipo sistema =
                new Integracion_inteligencia_artificial_para_analisis_tactico_en_deportes_de_equipo();

        String[] datosPartido = new String[3];

        sistema.registrarEstadisticas(datosPartido);

        sistema.mostrarEstadisticas(datosPartido);

        sistema.generarRecomendacion(datosPartido);
    }
}