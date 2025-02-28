package Texto;

public class TextoExamen {

    /*

    Parte 1 - 4 pt
Sistema de Vehículos:

○ Crea una clase base Vehiculo con los siguientes atributos:
■ marca (String)
■ modelo (String)
■ año (int)
YA

○ Define un constructor y un método mostrarDetalles() que imprima la
información básica del vehículo.
YA

○ Crea dos subclases Automovil y Motocicleta que hereden de Vehiculo.
■ En Automovil, agrega un atributo numeroPuertas (int) y sobrescribe
mostrarDetalles() para incluir este dato.
■ En Motocicleta, agrega un atributo tipo (String) (deportivo, scooter,
etc.) y sobrescribe mostrarDetalles() para incluir este dato.
YA

○ En el main, crea una lista de Vehiculo, agrega instancias de Automovil y
Motocicleta, y recorre la lista llamando a mostrarDetalles().
YA

Parte 2 - 6 pt
Sistema de Gestión de Cursos:
○ Crea una clase Persona con los atributos:
■ nombre (String)
■ edad (int)
YA

○ Define un constructor y un método mostrarInformacion() que imprima la
información básica de la persona.
YA

○ Crea dos subclases Profesor y Estudiante que hereden de Persona.
■ Profesor debe tener un atributo salario (double) y sobrescribir
mostrarInformacion() para incluir este dato.
■ Estudiante debe tener un atributo promedio (double) y sobrescribir
mostrarInformacion() para incluir este dato.
YA

○ Crea una clase Curso con los atributos:
■ nombreCurso (String)
■ profesor (Profesor)
■ listaEstudiantes (ArrayList de Estudiante)
YA

○ Implementa un método agregarEstudiante(Estudiante estudiante) en Curso
para agregar estudiantes a la lista.
YA

○ Implementa un método mostrarDetallesCurso() que imprima los datos del
curso, el nombre del profesor y la lista de estudiantes inscritos.
YA

○ En el main, crea instancias de Profesor y Estudiante, agrégalas a un Curso y
muestra la información del curso con mostrarDetallesCurso().
YA
     */
