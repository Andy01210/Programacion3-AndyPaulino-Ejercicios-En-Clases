# Programacion3-AndyPaulino-Ejercicios-En-Clases

## Andy Emmanuel Paulino Zorrilla

## Matricula: 1000-6051

## Materia: Programacion 3



Ejercicio en Clase: Sistema de Registro de Estudiantes
Objetivo
Aplicar los conceptos fundamentales del manejo de excepciones en Java:

try

catch

finally

throw

throws

getMessage()

Enunciado
Desarrolle un programa que solicite los siguientes datos de un estudiante:

Nombre

Edad

Índice académico

El sistema deberá validar que los datos ingresados sean correctos antes de registrar al estudiante.

Reglas de Validación
Nombre
El nombre no puede estar vacío.

Ejemplo inválido
Nombre:
Mensaje esperado
Error: El nombre no puede estar vacío.
Edad
La edad debe estar entre:

18 y 100 años
Ejemplo inválido
Edad: 15
Mensaje esperado
Error: La edad debe ser mayor o igual a 18 años.
Índice Académico
El índice debe estar entre:

0.0 y 4.0
Ejemplo inválido
Índice: 5.5
Mensaje esperado
Error: El índice debe estar entre 0 y 4.
Requisitos Técnicos
Debe existir un método con la siguiente firma:

public static void validarEstudiante(
        String nombre,
        int edad,
        double indice)
        throws Exception
Dentro de este método deberán realizarse todas las validaciones.

Requisitos Obligatorios
El programa debe utilizar:

throw

throws

try-catch

finally

getMessage()

Ejemplo de Uso
try {

    validarEstudiante(
        nombre,
        edad,
        indice
    );

    System.out.println(
        "Estudiante registrado correctamente."
    );

}
catch(Exception e) {

    System.out.println(
        e.getMessage()
    );

}
finally {

    System.out.println(
        "Proceso finalizado."
    );

}
Casos de Prueba
Caso 1 - Registro Correcto
Entrada
Nombre: Juan Pérez
Edad: 25
Índice: 3.8
Salida Esperada
Estudiante registrado correctamente.
Proceso finalizado.
Caso 2 - Edad Inválida
Entrada
Nombre: Pedro Gómez
Edad: 15
Índice: 3.5
Salida Esperada
Error: La edad debe ser mayor o igual a 18 años.
Proceso finalizado.
Caso 3 - Índice Inválido
Entrada
Nombre: Ana Rodríguez
Edad: 20
Índice: 5.2
Salida Esperada
Error: El índice debe estar entre 0 y 4.
Proceso finalizado.
Caso 4 - Nombre Vacío
Entrada
Nombre:
Edad: 22
Índice: 3.4
Salida Esperada
Error: El nombre no puede estar vacío.
Proceso finalizado.
Bonus 
Crear una excepción personalizada llamada:

EstudianteInvalidoException
y utilizarla en lugar de la clase Exception.

Ejemplo:

throw new EstudianteInvalidoException(
    "La edad debe ser mayor o igual a 18 años."
);
