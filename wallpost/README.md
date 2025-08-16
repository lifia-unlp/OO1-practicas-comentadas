# Objetivo

En este ejercicio partimos de una clase ya definida, pero sin métodos, variables de instancia, ni constructor. Debemos completarla en base a lo que nos dice la especificación y lo que indica una interfaz (interface) que la clase implementa (la interfaz es como un contrado que debe cumplir). Con eso tenémos lo básico que se requiere para programar clases. 

Y dado que tenemos una clase, aprovechamos para hacer algo con sus instancias. 

Por un lado, utilizamos unos tests de unidad que provee la cátedra para asegurarnos de que las instancias de nuestra clase se comportan como se espera (si no, los tests fallan). Notá que los tests de unidad también actúan como especificación de lo que debe hacer la clase. 

Por otro lado, la cátedra implementó una pequeña aplicacion interactiva (una ventanita) que crea una instancia y nos permite enviarle mensajes (apretando botones de la interfaz). Si bien ya casi no se hacen aplicaciones de escritorio, lo que ocurre en este ejemplo (la interfaz es un objeto que crea una instancia de WallPostImpl y le envia mensaje) es lo que ocurre en cualquier aplicacion web o móvil. 

Practicamos: clases, instancias, métodos, variables de instancia, inicialización (con el constructor)

# Primera parte

Se está construyendo una red social como Facebook o Twitter. Debemos definir una clase WallpostImpl con los siguientes atributos: un texto que se desea publicar, cantidad de likes (“me gusta”) y una marca que indica si es destacado o no. La clase WallpostImp es subclase de Object e implementa la interfaz Wallpost provista por la cátedra.

En la carpeta "base" una implementación a medio terminar que usted. Allí encontrará la interface Wallpost y la clase WallpostImpl que implementa la interfaz anterior.

Usted debe completar la clase WallPostImpl para ofrecer la siguiente funcionalidad:

```Java
/*
* Permite construir una instancia del WallpostImpl.
* Luego de la invocación, debe tener como texto: “Undefined post”,
* no debe estar marcado como destacado y la cantidad de “Me gusta” debe ser 0.
*/
public WallPostImpl()

/*
* Retorna el texto descriptivo de la publicación
*/
public String getText() 

/*
* Asigna el texto descriptivo de la publicación
*/
public void setText (String descriptionText)

/*
* Retorna la cantidad de “me gusta”
*/
public int getLikes() 

/*
 * Incrementa la cantidad de likes en uno.
*/
public void like() 

/*
 * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada.
*/
public void dislike()

/*
 * Retorna true si el post está marcado como destacado, false en caso contrario
*/
public boolean isFeatured() 

/*
 * Cambia el post del estado destacado a no destacado y viceversa.
*/
public void toggleFeatured()

```
 
# Segunda parte

Utilice los tests provistos por la cátedra para comprobar que su implementación de Wallpost es correcta. Estos se encuentran en el mismo proyecto, en la carpeta test, clase WallPostTest.

Para ejecutar los tests simplemente haga click derecho sobre el proyecto y utilice la opción Run As >> JUnit Test. Al ejecutarlo, se abrirá una ventana con el resultado de la evaluación de los tests. Siéntase libre de investigar la implementación de la clase de test. Ya veremos en detalle cómo implementarlas. 

En el informe, Runs indica la cantidad de test que se ejecutaron. En Errors se indica la cantidad que dieron error y en Failures se indica la cantidad que tuvieron alguna falla, es decir,  los resultados no son los esperados. Abajo, se muestra el Failure Trace del test que falló. Si lo selecciona, mostrará el mensaje de error correspondiente a ese test, que le ayudará a encontrar la falla. Si hace click sobre alguno de los test, se abrirá su implementación en el editor. 

![](recursos/tests-runner.png "Test runner en Eclipse")

# Tercera parte

Una vez que su implementación pasa los tests de la primera parte puede utilizar la ventana que se muestra a continuación, la cual permite inspeccionar y manipular el post (definir su texto, hacer like / dislike y marcarlo como destacado).

![](recursos/wallpost-ui.png "Editor interactivo de Wallposts")

Para visualizar la ventana, sobre el proyecto, usar la opción del menú contextual Run As >> Java Application. La ventana permite cambiar el texto del post, incrementar la cantidad de likes, etc. El botón Print to Console imprimirá los datos del post en la consola. 

# Prestar atención

Si no implementás el constructor, las instancias tendrán sus variables en null luego de ser creadas. Eso es malo; nuestros objetos deben estar listos para ser usados ni bien se crean. Fijate que si no implementas el constructor bien, la aplicación no funciona y los tests deberían dar error. 

Todas las variables de instancia deben ser declaradas con visibilidad "private". No queremos que otros objetos metan mano dentro del nuestro y rompan su encapsulamiento.

# Para pensar

La interfaz y los tests actuan como contrato de una clase que todavia no está implementada. Pero solo con ese "contrato", la cátedra pudo implementar la aplicación interactiva (que solo estuvo completa cuando vos implementaste la clase WallPostImpl). Las interfaces y los tests de unidad son herramientas muy poderosas para repartir el trabajo y trabajar en equipo.

Si bien todavia no sabemos mucho sobre tests de unidad, sería interesante que le dieras una ojeada a la clase WallPostTest para ver que es lo que hace.

Aunque este ejemplo es muy simple, podrías experimentar un poco con el debugger de tu ambiente. Te proponemos que investigues como hacer para poner un breakpoint del debugger al principio del método dislike() de tu clase WallPostImpl. Luego ejecuta la aplicacion (WallpostApplication) en modo debugging y fijate que pasa cuando apretás el boton "Dislike" de la ventana. Probalo cuando el Wallpost tiene 0 likes y cuando tiene algunos. 

Rompé uno de los métodos de tu clase WallPostImpl para que haga algo raro (por ejemplo, que sume likes de a dos). ¿Los tests, detectan que el método se rompió? ¿La aplicacion sigue funcionando? ¿Bien?

Los nombres que se eligieron en este ejemplo para la interfaz (WallPost) y la clase que implementa la interfaz (WallPostImpl) no son los mejores (principalmente eso de Impl). Ya hablaremos sobre elegir buenos nombres.
