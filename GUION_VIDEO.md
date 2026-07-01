# Guion para el video explicativo - PA4

> **Duración total sugerida:** 4 a 6 minutos  
> **Requisito:** Cámaras encendidas  
> **Reparto:** 3 integrantes, una parte cada uno

---

## Parte 1 — Presentación y qué hace el programa

**Duración:** 1 minuto aproximadamente  
**Integrante:** Cualquiera de los 3

### Guión

"Hola, somos Félix Daniel Román Ciprián, Juan Ángel Cáceres Guerra y Alonso Morante Ubaldo.  
Este es nuestro PA4 de Programación Orientada a Objetos.  
Hicimos una tienda académica en Java que corre por consola.  
El programa sirve para registrar productos, listarlos, buscarlos por código o nombre, y ordenarlos por precio.  
Trabajamos con dos tipos de productos: libros y uniformes."

---

## Parte 2 — Cómo está hecho por dentro

**Duración:** 1.5 a 2 minutos  
**Integrante:** Otro integrante

### Guión

"Para el diseño de clases usamos una clase abstracta llamada `Producto`, que tiene los atributos comunes: código, nombre, precio, stock y categoría.  
De esa clase heredan `Libro` y `Uniforme`.  
`Libro` tiene autor y editorial, y `Uniforme` tiene talla y color.  
Cada una sobrescribe el método `toString()` para mostrar sus datos de forma diferente.  

También creamos una interfaz llamada `Descuentable`, que obliga a implementar el método `aplicarDescuento`.  
Los libros tienen un descuento del 10% y los uniformes del 15%.  

Para guardar los productos usamos un `ArrayList<Producto>`.  
Y usamos un `HashSet<String>` para los códigos, para que no se puedan registrar dos productos con el mismo código.  

La búsqueda la hacemos por código exacto o por nombre, y el ordenamiento es por precio de menor a mayor."

---

## Parte 3 — Demostración en consola y despedida

**Duración:** 2 a 3 minutos  
**Integrante:** El tercer integrante

### Guión

"Ahora vamos a ejecutar el programa para mostrar cómo funciona."

**Durante la demostración, mostrar en consola:**

1. Registrar un libro.
2. Registrar un uniforme.
3. Intentar registrar otro producto con el mismo código, para que se vea que no deja.
4. Listar los productos registrados.
5. Buscar un producto por código.
6. Buscar productos por nombre.
7. Ordenar los productos por precio.
8. Salir del programa.

### Cierre

"Bueno, eso sería todo.  
Elegimos esta estructura porque se parece a lo que vimos en clase y nos pareció la forma más clara de cumplir con los requerimientos de la evaluación.  
Gracias por ver el video."

---

## Consejos para grabar

- Hablen con naturalidad, no es necesario memorizar todo el guion.
- Se puede tener este documento abierto en otra pantalla mientras graban.
- Lo más importante es que se vean las caras y se escuchen bien.
- Si alguien se equivoca, no pasa nada, pueden seguir o volver a intentar.
- Muestren bien la consola cuando ejecuten el programa.
