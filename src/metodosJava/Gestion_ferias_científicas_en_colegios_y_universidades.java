package metodosJava;

import java.util.Scanner;

public class Gestion_ferias_científicas_en_colegios_y_universidades {

	
		//  En una institución educativa, cada año se organiza una feria científica donde los estudiantes presentan proyectos de investigación y prototipos tecnológicos. 
		//El reto consiste en diseñar un sistema que permita registrar los proyectos, asignar jurados y calcular los puntajes finales.
		
		//El escenario es complejo porque cada proyecto se evalúa en varias dimensiones: creatividad, rigor científico y aplicabilidad práctica.
		
		//Además, los jurados pueden ser internos (profesores) o externos (invitados de otras instituciones), lo que genera diversidad en los criterios de evaluación. 
		//El sistema debe consolidar las calificaciones, detectar discrepancias significativas y generar un ranking de proyectos.
		
		//Otro aspecto crítico es la logística: algunos proyectos requieren recursos especiales, como acceso a laboratorios o equipos de cómputo,
		//y el sistema debe registrar estas solicitudes y verificar si fueron atendidas. También debe generar reportes para los organizadores,
		//mostrando qué proyectos cumplen con los requisitos y cuáles necesitan ajustes. 
		 static Scanner scanner = new Scanner(System.in);
		
		public static String[] registroProyectos (String[] proyectos) {
			
			for (int i = 0 ; i < proyectos.length ; i++) {
				System.out.println("Ingrese el nombre del proyecto");
				proyectos[i] = scanner.nextLine();
				
			}
		return proyectos;
		}
		
		public static void main (String[] args) {
			
			String [] array = new String[4];
			
			registroProyectos(array);
			
			System.out.println("Los proyectos registrados son: ");
			for(int i = 0 ; i<array.length; i++) {
				System.out.println(array[i]);
			}
		

	}

}
