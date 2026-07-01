# Guion para el video explicativo - PA4

> **Duración total sugerida:** 5 a 7 minutos  
> **Requisito:** Cámaras encendidas  
> **Integrantes:** 3

---

## Introducción común (todos juntos)

**Duración:** 30 a 45 segundos

### Guión

"Hola, somos Félix Daniel Román Ciprián, Juan Ángel Cáceres Guerra y Alonso Morante Ubaldo.  
Este es nuestro PA4 de Programación Orientada a Objetos.  
Hicimos una tienda académica en Java que corre por consola.  
El programa permite registrar productos, listarlos, buscarlos por código o nombre, y ordenarlos por precio.  
Trabajamos con dos tipos de productos: libros y uniformes."

---

## Parte 1 — Jerarquía de clases, interfaz y sobrescritura

**Duración:** 1.5 a 2 minutos  
**Integrante:** Integrante 1

### Guión

"Para organizar el código usamos paquetes: `tienda.modelo`, `tienda.servicio` y `tienda.principal`.

En el paquete modelo creamos una **clase abstracta** llamada `Producto`.  
Es abstracta porque no queremos crear productos genéricos; solo queremos crear libros o uniformes.  
Tiene los atributos comunes: código, nombre, precio, stock y categoría.  
También declara el método abstracto `calcularPrecioFinal()`, que cada clase hija debe implementar obligatoriamente.

De `Producto` heredan dos clases: `Libro` y `Uniforme`.  
`Libro` agrega los atributos autor y editorial.  
`Uniforme` agrega talla y color.  
Ambas clases sobrescriben el método `toString()` para mostrar su información de forma diferente, y también sobrescriben `calcularPrecioFinal()`.

Además, creamos la **interfaz** `Descuentable` con el método `aplicarDescuento(double porcentaje)`.  
Tanto `Libro` como `Uniforme` implementan esta interfaz.  
Los libros tienen un descuento del 10% y los uniformes del 15%.  
Así usamos herencia, clase abstracta, interfaz y sobrescritura de métodos."

---

## Parte 2 — Colecciones, búsqueda y ordenamiento

**Duración:** 1.5 a 2 minutos  
**Integrante:** Integrante 2

### Guión

"En el paquete `tienda.servicio` está la clase `GestorProductos`, que se encarga de manejar las colecciones.

Para guardar los productos usamos un `ArrayList<Producto>`.  
Elegimos `ArrayList` porque permite tener todos los productos en una sola lista, es fácil de recorrer y se puede ordenar.

Para controlar que los códigos no se repitan usamos un `HashSet<String>`.  
Elegimos `HashSet` porque no permite elementos duplicados y la búsqueda es muy rápida.  
Cuando se registra un producto, primero se pregunta si el código ya está en el `HashSet`; si está, no se registra y se muestra un mensaje de error.

La **búsqueda por código** recorre la lista y compara con `equalsIgnoreCase`.  
La **búsqueda por nombre** busca coincidencias parciales y normaliza las tildes para que la búsqueda sea más flexible.

El **ordenamiento** se hace con `Collections.sort()` y un `Comparator` que compara los precios de menor a mayor."

---

## Parte 3 — Demostración en consola y despedida

**Duración:** 2 a 3 minutos  
**Integrante:** Integrante 3

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

### Cierre común (todos juntos)

"Elegimos esta estructura porque cumple con todos los requerimientos de la evaluación: clase abstracta, herencia, interfaz, sobrescritura de métodos, colecciones genéricas, búsqueda, ordenamiento y control de unicidad.  
Gracias por ver el video."

---

## Consejos para grabar

- Hablen con naturalidad, no es necesario memorizar todo el guion.
- Pueden tener este documento abierto en otra pantalla mientras graban.
- Lo más importante es que se vean las caras y se escuchen bien.
- Si alguien se equivoca, no pasa nada, pueden seguir o repetir la parte.
- Muestren bien la consola cuando ejecuten el programa.
- En la Parte 1 y Parte 2 se recomienda compartir pantalla con el código mientras se explica.
