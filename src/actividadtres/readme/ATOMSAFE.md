1. IDENTIFICAR QUÉ DEBE CONTROLAR EL SISTEMA

Tu sistema corresponde a un entorno crítico de ingeniería nuclear.

El software debe controlar múltiples procesos al mismo tiempo.

Procesos principales
Proceso	Qué controla
Flujo neutrónico	Actividad nuclear
Refrigeración	Temperatura del núcleo
Reactividad	Estabilidad del reactor
Barras de control	Absorción de neutrones
Sistema SCRAM	Parada de emergencia
Contención total	Aislamiento nuclear
Temperatura núcleo	Riesgo de fusión
Diagnóstico	Estado del reactor
Seguridad pública	Prevención de accidentes
2. VARIABLES IMPORTANTES DEL SISTEMA

Aquí defines las señales físicas que llegan desde sensores industriales.

Variables nucleares
Variable	Tipo	Qué representa

flujoNeutrones	double	Neutrones/cm²
factorReactividad	double	Nivel actividad nuclear
temperaturaNucleo	double	Temperatura reactor
presionReactor	double	Presión interna

Variables de refrigeración
Variable	Tipo	Qué representa
nivelRefrigerante	double	Cantidad líquido moderador
temperaturaRefrigerante	double	Temperatura refrigerante
perdidaRefrigerante	boolean	Falla refrigeración


Variables de seguridad
Variable	Tipo	Qué representa
barrasInsertadas	boolean	Estado barras control
scramActivo	boolean	Emergencia nuclear
contencionTotal	boolean	Aislamiento reactor
reactorActivo	boolean	Reactor operando
3. QUÉ MIDEN LOS SENSORES

Debes pensar como un sistema nuclear real.

Los sensores monitorean continuamente el reactor.

Sensores principales
Sensor	Qué mide
Sensor neutrónico	Flujo de neutrones
Sensor térmico	Temperatura núcleo
Sensor presión	Presión reactor
Sensor nivel	Refrigerante líquido
4. FLUJO DE NEUTRONES
Qué representa

El flujo neutrónico indica:

intensidad de reacción nuclear
velocidad de fisión
generación energética

Mientras más neutrones:
→ mayor reacción nuclear.

5. RANGOS DE SEGURIDAD
Flujo neutrónico	Estado
0 – 300	Estable
301 – 700	Elevado
701 – 1000	Peligroso
> 1000	Crítico

6. NIVEL DEL REFRIGERANTE

El refrigerante absorbe calor del núcleo.

Sin refrigeración:
→ el reactor puede fundirse.

Rangos de refrigeración
Nivel refrigerante	Estado
80 – 100%	Seguro
50 – 79%	Precaución
20 – 49%	Riesgo alto
< 20%	Emergencia
7. FACTOR DE REACTIVIDAD DEL NÚCLEO

Aquí comienza la lógica matemática principal.

El sistema combina:

flujo neutrónico
capacidad de refrigeración
Fórmula conceptual

FRN=(FN×0.8)−(NR×0.2)

Significado variables
Variable	Significado
FRN	Factor Reactividad Núcleo
FN	Flujo neutrones
NR	Nivel refrigerante
8. PASO A PASO DEL CÁLCULO
Paso 1 — Leer flujo neutrónico

El sensor reporta:

Variable	Valor
FN	850
Paso 2 — Leer refrigerante
Variable	Valor
NR	40
Paso 3 — Aplicar ponderaciones

La planta considera:

neutrones = factor más peligroso
refrigeración = factor estabilizador
Paso 4 — Sustituir valores

FRN=(850×0.8)−(40×0.2)

Paso 5 — Resolver operaciones
Operación	Resultado
850 × 0.8	680
40 × 0.2	8
Paso 6 — Resultado final

FRN=680−8=672

9. INTERPRETACIÓN DEL FACTOR
FRN	Estado reactor
0 – 300	Estable
301 – 600	Riesgo moderado
601 – 800	Reactividad alta
> 800	Emergencia nuclear
10. NORMA DE SEGURIDAD NUCLEAR

La planta usa un límite fijo nacional.

Ese valor es constante.

Temperatura crítica

TC=2800 
∘
C

Qué representa

TC = Temperatura de fusión del uranio.

Si el núcleo alcanza esa temperatura:
→ posible desastre nuclear.

11. MARGEN DE SEGURIDAD

El sistema calcula cuánto falta para llegar al punto crítico.

Fórmula conceptual

MS=TC−TN

Variables
Variable	Significado
MS	Margen seguridad
TC	Temperatura crítica
TN	Temperatura núcleo
12. CONTROL DE BARRAS DE GRAFITO

Las barras absorben neutrones.

Menos neutrones:
→ menos reacción nuclear.

Regla operacional
Condición	Acción
FRN estable	Mantener energía
FRN alto	Insertar barras
FRN crítico	SCRAM
13. GENERACIÓN AL 100%

Si el reactor es estable:

Acción	Resultado
Barras parcialmente retiradas	Producción máxima
14. PÉRDIDA DE REFRIGERANTE

Esto es uno de los peores escenarios.

Sin refrigeración:

temperatura aumenta
fisión continúa
riesgo de fusión
Regla de emergencia

Si:

NR<20

Entonces:

activar SCRAM
inundar núcleo con boro
detener reacción
15. PROTOCOLO SCRAM

SCRAM significa:

parada inmediata del reactor.

Qué hace el sistema
Acción	Objetivo
Insertar barras	Frenar fisión
Liberar boro	Absorber neutrones
Cortar potencia	Seguridad
16. CONTENCIÓN TOTAL

Aquí entra el protocolo extremo.

Condiciones críticas
Error sensor	Riesgo
flujo neutrones = 0	Falla imposible
refrigerante negativo	Sensor corrupto
Validación crítica

Si:

FN=0

o

NR<0

Entonces:

activar contención total
aislar reactor
bloquear operación
17. TIEMPO HASTA TEMPERATURA CRÍTICA

El sistema estima cuánto falta para una fusión.

Fórmula conceptual

TTC=
VC
TC−TN
	​


Variables
Variable	Significado
TTC	Tiempo temperatura crítica
TC	Temperatura crítica
TN	Temperatura actual
VC	Velocidad calentamiento
18. EJEMPLO DEL CÁLCULO
Datos
Variable	Valor
TC	2800
TN	2200
VC	50 °C/min
Sustitución

TTC=
50
2800−2200
	​


Resultado

TTC=12 minutos

19. INFORME DE DIAGNÓSTICO

Cuando ocurre un fallo:

el sistema debe guardar evidencia completa.

Datos del informe
Dato	Ejemplo
Reactividad previa	760
Nivel refrigerante	12%
Temperatura núcleo	2400 °C
Tiempo crítico	8 min
Estado reactor	SCRAM
Hora incidente	03:42
20. FLUJO GENERAL DEL SISTEMA
ETAPA 1 — Sensores

El reactor envía:

neutrones
temperatura
presión
refrigeración
ETAPA 2 — Procesamiento

El sistema:

calcula FRN
valida riesgos
calcula margen seguridad
ETAPA 3 — Decisiones

El sistema decide:

mantener operación
insertar barras
activar SCRAM
aislar reactor
ETAPA 4 — Registro

El sistema:

guarda incidentes
genera diagnósticos
registra emergencias
21. ARQUITECTURA PROFESIONAL

Nunca hagas un único método gigante.

Clases ideales
Clase	Responsabilidad
SensorNeutrones	Lectura neutrónica
Refrigeracion	Control líquido
Reactor	Reactividad
BarrasControl	Absorción neutrones
Scram	Emergencia nuclear
Contencion	Aislamiento
Diagnostico	Informes
SeguridadNuclear	Validaciones
22. IDEA MÁS IMPORTANTE

En sistemas nucleares:

una validación incorrecta
un cálculo mal hecho
una condición no controlada

puede generar un desastre real.

Por eso el sistema debe:

validar todo
usar alta precisión
manejar errores extremos
registrar eventos
reaccionar automáticamente.