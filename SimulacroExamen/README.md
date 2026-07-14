# Ejercicio JavaFX: Sistema básico de citas médicas

## Objetivo de aprendizaje

Desarrollar una aplicación de escritorio con JavaFX para registrar y consultar citas médicas, aplicando controles gráficos, eventos, colecciones, validaciones, excepciones y manejo básico de archivos.

## Descripción

Un pequeño consultorio necesita una aplicación que permita registrar citas médicas de sus pacientes.

La información se manejará temporalmente en una colección y deberá poder guardarse y cargarse desde un archivo de texto. No se utilizará base de datos.

## Datos de la cita

Cada cita debe contener:

* Código de la cita
* Nombre del paciente
* Cédula
* Teléfono
* Médico
* Especialidad
* Fecha de la cita
* Hora
* Motivo de consulta
* Estado

Los estados disponibles serán:

* Programada
* Atendida
* Cancelada

## Interfaz gráfica

La aplicación debe estar desarrollada con JavaFX y FXML.

Debe contener, como mínimo:

* `TextField` para código, paciente, cédula, teléfono y hora.
* `ComboBox` para médico, especialidad y estado.
* `DatePicker` para seleccionar la fecha.
* `TextArea` para el motivo de consulta.
* `TableView` para mostrar las citas registradas.
* Botones para registrar, cancelar, limpiar, guardar y cargar.

## Funcionalidades obligatorias

### Registrar cita

Al presionar el botón **Registrar**, la aplicación debe validar los campos y agregar la cita a la colección.

La cita registrada debe mostrarse inmediatamente en el `TableView`.

### Consultar citas

Todas las citas deben visualizarse en el `TableView` con las siguientes columnas:

* Código
* Paciente
* Médico
* Especialidad
* Fecha
* Hora
* Estado

### Cancelar cita

El usuario debe seleccionar una cita en la tabla y presionar el botón **Cancelar cita**.

El estado de la cita debe cambiar a `Cancelada`.

No se debe eliminar la cita de la tabla.

### Limpiar formulario

El botón **Limpiar** debe borrar todos los campos y dejar el formulario listo para un nuevo registro.

### Guardar en archivo

El botón **Guardar** debe escribir todas las citas registradas en un archivo de texto.

Cada línea del archivo debe representar una cita.

### Cargar desde archivo

El botón **Cargar** debe leer las citas almacenadas en el archivo y mostrarlas en el `TableView`.

Antes de cargar, debe limpiarse la colección para evitar registros duplicados.

## Validaciones

La aplicación debe validar que:

* Ningún campo obligatorio esté vacío.
* El código de la cita no esté repetido.
* La cédula y el teléfono contengan solamente números.
* La fecha de la cita no sea anterior a la fecha actual.
* Se haya seleccionado un médico.
* Se haya seleccionado una especialidad.
* La hora tenga un valor.
* No existan dos citas para el mismo médico, fecha y hora.

Los errores deben mostrarse mediante ventanas `Alert`.

## Manejo de excepciones

La aplicación debe utilizar `try-catch` para controlar:

* Errores al convertir o validar datos.
* Errores al guardar el archivo.
* Errores al cargar el archivo.
* Selecciones inválidas en el `TableView`.

Se debe crear al menos una excepción personalizada para representar un horario ocupado o una cita duplicada.

## Colección

Las citas deben mantenerse en una colección compatible con el `TableView`, como una `ObservableList`.

## Eventos

Los botones deben tener eventos funcionales para:

* Registrar
* Cancelar
* Limpiar
* Guardar
* Cargar

Se pueden utilizar expresiones lambda o métodos definidos en el controlador.

## Organización del proyecto

El proyecto debe incluir, como mínimo:

* Una clase principal de JavaFX.
* Un archivo FXML.
* Un controlador.
* Una clase para representar la cita.
* Una clase para manejar los archivos.
* Una excepción personalizada.

## Resultado esperado

Al finalizar, la aplicación debe permitir registrar varias citas, mostrarlas en una tabla, cancelar una cita seleccionada, guardar la información en un archivo y recuperarla posteriormente.