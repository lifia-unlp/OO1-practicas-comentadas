# Guia de actividades de OO1

Esto es una guía de actividades para la asignatura Orientación a Objetos 1, de la Facultad de Informática, de la Universidad Nacional de La Plata.

Incluye enunciados de ejercicios, resolución de referencia, y en algunos casos un esqueleto sobre el cuál comenzar a trabajar.

Cada ejercicio tiene un foco de trabajo específico que se discute en el documento que lo describe. 

Al final de este documento encontrarás un índice, que sirve como orden en el cuál atacar los ejercicios. Sin embargo, recomendamos seguir las guías provistas en clase. 

# Estructura 

Este repositorio está organizado con una carpeta por cada ejercicio. 

Dentro de cada carpeta encontrarás el enunciado (en su README.md), un esqueleteto sobre el cuál comenzar a trabajar (la carpeta "mio"), una solución de referencia provista por la cátedra (la carpeta "resuelto"), una carpeta con recursos adicionales a los que se hace referencia en el enunciado (carpeta "recursos"). 

# Guía de uso

El primer paso es clonar **todo** este repositorio en tu máquina. Podés hacerlo por línea de comandos (git clone ...), con la herramienta Github Desktop, o como prefieras.

## Ambiente de desarrollo

Luego, preparás tu ambiente de desarrollo. Podés usar Eclipse, Visual Studio Code, Intellige Idea, o la que quieras. Este repositorio esta preparado para simplificarte la configuración tanto como sea posible.  Como hay algunas diferencias a la hora de abrir/importar el projecto, proveemos instrucciones específicas para Eclipse y VS Code mas abajo.

## Markdown

Las instrucciones y enunciados se escribieron en formato Markdown (son esos los archivos README.md). Si bien podés leerlos directamente en cualquier procesador de texto simple, es más interesante cuando los leés en un visualizador especializado que formatea lindo e incrusta las imágenes. Recomendamos que los leas directamente desde Github o que investigues si tu ambiente ofrece un visualizador de Markwdown. 

## Donde modificar y donde no

El código que vos escríbis va en la carpeta "mio" de cada ejercicio. A veces vas a encontrar un esqueleto de proyecto ahí dentro que sirve como punto de partida. Es recomendable que no cambies la estructura sugerida salvo que estés seguro de por qué lo hacés. 

Con frecuencia publicamos nuevos ejercicios, actualizaciones a los enunciados y a las soluciones de referencia. Como esos cambios están fuera de tu carpeta "mio", no deberían entrar en conflicto con los tuyos. 

# El pom.xlm

Verás que en el raíz y en cada carpeta "mio" o "resuelto" hay un archivo pom.xml. 

Esta guía utiliza la herramienta de gestión de proyectos Maven para decirle a tu ambiente (Eclipse, VS-Code, Intellij idea, etc.) donde están las cosas y que dependencias tiene cada ejercicio.

El pom.xml de más afuera (el del raíz) dice que vamos a utilizar JUnit para las pruebas de unidad, e indica donde estará el código y las pruebas de cada ejercicio (dentro de cada "mio" y "resuelto" de cada ejercicio). Esto ayuda a tu ambiente de desarrollo a no mezclar las cosas o confundirse con duplicados. 

Dentro de cada ejercicio, hay un pom.xml para tu trabajo (dentro de "mio") y un pom.xml para la solución provista por la cátedra (dentro del "resuelto"). Verás que esos pom.xml no dicen mucho. Entre las cosas interesantes que dicen se encuentra una referencia al pom.xml del raiz (su padre), del que heredan propuedades y dependencias.  

Por lo general no tenés que preocuparte por los pom.xml. No es necesario que los modifiques (salvo que lo indiquemos explícitamente).

# Especificidades de Eclipse 

Para trabajar en Eclipse, debés importar todo lo que está en el repositorio a tu espacio de trabajo (workspace), como proyectos Maven Existentes. 

1. File -> Import -> Existing Maven Projects 
2. Como "Root directory" poner la raiz del repositorio (donde está el pom.xlm de mas afera y donde están las carpetas de los ejercicios)
3. Debería identificar cada pom.xml (el de mas afuera y los dos de cada ejercicio) como un project. Seleccionalos todos (o los que quieras, pero siempre incluí el de mas afuera)

Si todo funcionó bien, deberías tener la lista de ejercicios (su version mio y su version resuelto) en el explorador de paquetes (Package Explorer)

# Especificidades de VS-Code

En VS Code debería ser suficiente que abras la carpeta raiz para que el ambiente reconozca toda la estructura y se configure bien. 

# Cómo mantener actualizado

Cada vez que te pongas a trabajar, fijate si hay actualizaciones en el repositorio. Para eso, seguí estos pasos con la herramienta de tu preferencia para trabajar con Git.

1. Hacé un Git fetch para ver si publicamos algo nuevo.
2. Hacé un Git pull para traer los cambios. 

Si seguiste las instrucciones de más arriba (donde modificar y donde no), no deberías encontrar conflicto integrando nuestros cambios y los tuyos. Si ocurre, nos consultás.

# Índice de actividades

* **wallpost**: programamos una clase, con su constructor y métodos, y probamos sus instancias con tests de unidad y una aplicacion interactiva (ventana) 