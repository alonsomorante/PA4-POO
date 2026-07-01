# Guion para el video explicativo - PA4

> **Duración total sugerida:** 5 a 7 minutos  
> **Requisito:** Cámaras encendidas  
> **Reparto:** 3 integrantes, una parte cada uno

---

## Parte 1 — Presentación y descripción general del programa

**Duración:** 1 a 1.5 minutos  
**Integrante:** Cualquiera de los 3

### Guión

"Hola, somos Félix Daniel Román Ciprián, Juan Ángel Cáceres Guerra y Alonso Morante Ubaldo.  
Este es nuestro PA4 de Programación Orientada a Objetos.  
Hicimos una tienda académica en Java que corre por consola.  

El programa permite registrar productos, listarlos, buscarlos por código o nombre, y ordenarlos por precio.  
Trabajamos con dos tipos de productos: libros y uniformes.  
Cada tipo tiene atributos propios, descuentos diferentes y se muestra de forma distinta en pantalla."

---

## Parte 2 — Explicación técnica del diseño

**Duración:** 2 a 2.5 minutos  
**Integrante:** Otro integrante

### Guión

"Para organizar el código usamos paquetes.  
En el paquete `tienda.modelo` están las clases del dominio, en `tienda.servicio` está la lógica de negocio y en `tienda.principal` está el menú que se ejecuta.

**Clase abstracta**  
Creamos una clase abstracta llamada `Producto`.  
Es abstracta porque no queremos que se pueda crear un producto genérico, sino solo libros o uniformes.  
Tiene los atributos comunes: código, nombre, precio, stock y categoría.  
También tiene un método abstracto `calcularPrecioFinal()`, que cada hija debe implementar a su manera.

**Herencia**  
De `Producto` heredan dos clases: `Libro` y `Uniforme`.  
`Libro` agrega los atributos autor y editorial.  
`Uniforme` agrega talla y color.  
Ambas sobrescriben `toString()` para mostrar su información específica y también sobrescriben `calcularPrecioFinal()`.

**Interfaz**  
Creamos la interfaz `Descuentable` con el método `aplicarDescuento(double porcentaje)`.  
Tanto `Libro` como `Uniforme` la implementan.  
Los libros aplican un descuento del 10% y los uniformes del 15%.

**Colecciones**  
Para guardar los productos usamos un `ArrayList<Producto>`.  
Elegimos `ArrayList` porque permite tener todos los productos en una sola lista y es fácil de recorrer.  

Para controlar que los códigos no se repitan usamos un `HashSet<String>`.  
Elegimos `HashSet` porque no permite duplicados y la búsqueda es muy rápida.  
Cuando se registra un producto, primero se pregunta si el código ya está en el `HashSet`; si está, no se registra.

**Búsqueda y ordenamiento**  
La búsqueda por código recorre la lista y compara con `equalsIgnoreCase`.  
La búsqueda por nombre usa una coincidencia parcial y normaliza las tildes para que la búsqueda sea más flexible.  
El ordenamiento se hace con `Collections.sort()` y un `Comparator` que compara los precios de menor a mayor."

---

## Parte 3 — Demostración en consola y despedida

**Duración:** 2 a 3 minutos  
**Integrante:** El tercer integrante

### Guión

"Ahora vamos a ejecutar el programa para mostrar que funciona.  
Primero compilamos con `javac` y luego ejecutamos con `java`."

**Durante la demostración, mostrar en consola y comentar cada paso:**

1. **Registrar un libro**: mostrar que pide código, nombre, precio, stock, categoría, autor y editorial.
2. **Registrar un uniforme**: mostrar que pide código, nombre, precio, stock, categoría, talla y color.
3. **Intentar registrar un código repetido**: explicar que el programa usa el `HashSet` para detectar que el código ya existe y no deja registrarlo.
4. **Listar productos**: mostrar que aparecen los dos productos con su información y su precio final con descuento.
5. **Buscar por código**: ingresar un código existente y mostrar que lo encuentra.
6. **Buscar por nombre**: ingresar parte del nombre y mostrar las coincidencias.
7. **Ordenar por precio**: mostrar la lista ordenada de menor a mayor.
8. **Salir**: cerrar el programa.

### Cierre

"Elegimos esta estructura porque cumple con todos los requerimientos de la evaluación: clase abstracta, herencia, interfaz, sobrescritura de métodos, colecciones genéricas, búsqueda, ordenamiento y control de unicidad.  
Además, nos pareció una forma clara de organizar el código y fácil de entender.  
Gracias por ver el video."

---

## Consejos para grabar

- Hablen con naturalidad, no es necesario memorizar todo el guion.
- Pueden tener este documento abierto en otra pantalla mientras graban.
- Lo más importante es que se vean las caras y se escuchen bien.
- Si alguien se equivoca, no pasa nada, pueden seguir o repetir la parte.
- Muestren bien la consola cuando ejecuten el programa.
- Se recomienda que el integrante que habla en la Parte 2 también comparta pantalla del código brevemente, si es posible.
