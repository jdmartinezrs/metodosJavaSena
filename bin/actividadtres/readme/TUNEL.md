1. IDENTIFICAR QUÉ DEBE CONTROLAR EL SISTEMA

Tu sistema de monitoreo ambiental del túnel vial tiene varios procesos críticos.

Cada uno representa un módulo industrial diferente.

Proceso	Qué controla
Calidad del aire	Nivel de contaminación interna
Monóxido de carbono (CO)	Toxicidad del ambiente
Visibilidad	Presencia de humo o neblina
Extractores	Ventilación del túnel
Peajes de entrada	Control de acceso vehicular
Alarmas de evacuación	Emergencias críticas
Historial de incidentes	Registro de eventos
Flujo vehicular	Cantidad de vehículos
Riesgo humano	Seguridad de las personas
2. VARIABLES IMPORTANTES DEL SISTEMA

Aquí defines qué datos recibe el sistema.

Variables ambientales
Variable	Tipo	Qué representa
nivelCO	double	Concentración de monóxido
densidadVisibilidad	double	Qué tan denso está el humo
temperaturaTunel	double	Temperatura interna
humedad	double	Humedad ambiental
Variables operativas
Variable	Tipo	Qué representa
extractoresActivos	boolean	Estado ventilación
potenciaExtractores	int	Nivel de potencia
peajesAbiertos	boolean	Acceso vehicular
alarmaEvacuacion	boolean	Emergencia activa
Variables de tráfico
Variable	Tipo	Qué representa
vehiculosDentro	int	Vehículos actuales
flujoVehicular	double	Tráfico por minuto
3. CÓMO SE MIDEN LOS DATOS

Aquí debes pensar como un sistema industrial real.

Los sensores entregan lecturas constantemente.

Sensores principales
Sensor	Qué mide
Sensor CO	Monóxido de carbono
Sensor láser	Densidad de humo/neblina
Sensor térmico	Temperatura
Sensor tráfico	Vehículos dentro
4. MONÓXIDO DE CARBONO (CO)
Qué representa

El CO es un gas tóxico.

Mientras más alto:
→ mayor riesgo para conductores.

5. RANGOS DE SEGURIDAD DEL CO
Nivel CO	Estado
0 – 25 ppm	Seguro
26 – 50 ppm	Moderado
51 – 100 ppm	Peligroso
> 100 ppm	Crítico

(ppm = partes por millón)

6. FÓRMULA DEL ÍNDICE DE CALIDAD DEL AIRE INTERIOR

Aquí empieza la lógica matemática real.

El sistema combina:

contaminación CO
densidad de humo
visibilidad
Fórmula conceptual básica

ICAI=(CO×0.7)+(DV×0.3)

Donde:

Variable	Significado
ICAI	Índice Calidad Aire Interior
CO	Nivel monóxido
DV	Densidad visibilidad
7. PASO A PASO DEL CÁLCULO
Paso 1 — Obtener nivel de CO

El sensor reporta:

Variable	Valor
CO	80 ppm
Paso 2 — Obtener densidad de visibilidad

El sensor láser reporta:

Variable	Valor
DV	40
Paso 3 — Aplicar ponderaciones

El ministerio considera que:

CO afecta más
humo afecta menos

Entonces:

Factor	Peso
CO	70%
DV	30%
Paso 4 — Sustituir valores

ICAI=(80×0.7)+(40×0.3)

Paso 5 — Resolver operación

Primero:

Operación	Resultado
80 × 0.7	56
40 × 0.3	12

Luego:

ICAI=56+12=68

8. INTERPRETACIÓN DEL ÍNDICE
ICAI	Calidad
0 – 30	Óptima
31 – 60	Aceptable
61 – 80	Deficiente
> 80	Crítica
9. LÍMITE DE EXPOSICIÓN HUMANA

El gobierno define una constante legal.

Esa constante NO cambia.

Constante legal

LEH=100 ppm

Donde:

LEH = Límite de Exposición Humana.

10. VALIDACIÓN DEL RIESGO
Regla principal

Si:

CO>LEH

Entonces:

ambiente tóxico
riesgo humano extremo
activar emergencia
11. CONTROL DE EXTRACTORES

Los extractores dependen del ICAI.

Aire óptimo

Si:

Condición	Acción
ICAI < 30	Extractores mínimos
Aire deficiente

Si:

Condición	Acción
ICAI > 60	Potencia máxima
12. CIERRE DE PEAJES

Cuando el aire es peligroso:

no deben entrar más vehículos.
Regla operacional

Si:

ICAI>80

Entonces:

cerrar peajes
bloquear acceso
detener tráfico
13. EVACUACIÓN DEL TÚNEL

Aquí entra el protocolo crítico.

Condiciones de evacuación
Evento	Acción
CO extremo	Evacuar
Humo denso	Evacuar
Baja visibilidad	Evacuar
Fórmula conceptual de toxicidad

RT=CO+DV

Donde:

RT = Riesgo total.

14. HISTORIAL DE INCIDENTES

Cuando ocurre una emergencia:

el sistema debe guardar evidencia.

Datos que deben almacenarse
Dato	Ejemplo
Hora	14:30
Nivel CO	120 ppm
Densidad humo	90
Vehículos dentro	57
Estado emergencia	Evacuación
15. FLUJO GENERAL DEL SISTEMA

El sistema industrial completo funcionaría así:

ETAPA 1 — Sensores

Los sensores leen:

CO
humo
tráfico
temperatura
ETAPA 2 — Procesamiento

El sistema:

calcula ICAI
valida límites
detecta riesgos
ETAPA 3 — Decisiones

El sistema decide:

activar extractores
cerrar peajes
evacuar
ETAPA 4 — Registro

El sistema:

guarda historial
registra incidentes
genera reportes
16. ARQUITECTURA PROFESIONAL

No hagas un solo bloque enorme.

Piensa en módulos especializados.

Clases o módulos ideales
Clase	Responsabilidad
SensorCO	Lectura CO
SensorLaser	Visibilidad
CalidadAire	Cálculo ICAI
Extractor	Ventilación
Peaje	Control acceso
Alarma	Emergencias
Historial	Registro eventos
Reporte	Informes
17. IDEA INDUSTRIAL IMPORTANTE

Este sistema es:

crítico
automático
preventivo

Por eso debe:

validar rangos seguros
reaccionar rápido
registrar eventos
evitar errores humanos
18. CONSEJO DE DESARROLLO

Construye el proyecto por fases.

Fase 1
lectura CO
cálculo ICAI
validación riesgo
Fase 2
extractores
peajes
alarmas
Fase 3
historial
reportes
estadísticas
19. IDEA MÁS IMPORTANTE

Debes separar siempre:

Concepto	Función
Datos	Lecturas sensores
Validaciones	Reglas seguridad
Acciones	Alarmas y controles

Porque así trabajan los sistemas industriales reales.