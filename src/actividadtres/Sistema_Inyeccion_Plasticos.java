package actividadtres;
import java.util.Scanner;
public class Sistema_Inyeccion_Plasticos{
    //Requerimiento del Cliente: 
    // "Necesitamos un componente que controle la presión de inyección
    //  y la temperatura del molde en nuestras máquinas de extrusión.
    // 
     //Existe una 'Constante de Viscosidad del Polímero' 
     // que es estándar para cada tipo de material en toda nuestra planta,
     //  por lo que el cálculo de la fuerza de cierre debe ser una función global.
     //  La lógica debe evaluar si el plástico fluirá correctamente; 
     // si la temperatura es muy baja, debe ordenar un precalentamiento, 
     // pero si la presión excede el límite de seguridad del molde,
     //  debe abortar el ciclo.

     //  Si por error el sensor envía una temperatura de 0°C
     //  o una presión negativa, el sistema debe disparar un error de
     //  'Fallo de Termocupla' y devolver un reporte con los valores 
     // anómalos detectados.

     //  El programador debe asegurar que la validación de estos límites
     //  sea el primer paso antes de cualquier cálculo de ingeniería."
     Scanner scanner = new Scanner(System.in);

     public static void main(String args[]){
        Sistema_Inyeccion_Plasticos  MinutadeRequerimientos = new Sistema_Inyeccion_Plasticos();
        Scanner scanner = new Scanner(System.in);
     }
}
