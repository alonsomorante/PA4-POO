# PA4 - Programación Orientada a Objetos

## Tienda Académica

Este es un programa en Java de consola para registrar productos de una tienda académica. Fue hecho para la evaluación PA4 del curso.

## Integrantes

- Félix Daniel Román Ciprián
- Juan Ángel Cáceres Guerra
- Alonso Morante Ubaldo

## Objetivo

Hacer un sistema que permita registrar, listar, buscar y ordenar productos usando colecciones y una jerarquía de clases en Java.

## Archivos del proyecto

- `src/tienda/modelo/Producto.java` - clase abstracta
- `src/tienda/modelo/Descuentable.java` - interfaz
- `src/tienda/modelo/Libro.java` - clase hija
- `src/tienda/modelo/Uniforme.java` - clase hija
- `src/tienda/servicio/GestorProductos.java` - maneja las colecciones
- `src/tienda/principal/Main.java` - menú principal

## Decisiones que tomamos

- Usamos una clase abstracta `Producto` porque todos los productos tienen código, nombre, precio, stock y categoría.
- Hicimos dos clases hijas: `Libro` y `Uniforme`.
- Creamos la interfaz `Descuentable` para aplicar descuentos.
- Usamos `ArrayList` para guardar los productos y `HashSet` para que no se repitan los códigos.
- Implementamos búsqueda por código y por nombre.
- Ordenamos los productos por precio de menor a mayor.

## Cómo ejecutar

Compilar:

```bash
find src -name "*.java" -print | xargs javac -d out
```

Ejecutar:

```bash
java -cp out tienda.principal.Main
```

## Menú

1. Registrar producto
2. Listar productos
3. Buscar por código
4. Buscar por nombre
5. Ordenar por precio
6. Salir

## Video explicativo

[Ver video en YouTube](URL_DEL_VIDEO)

## Notas

- Los libros tienen un descuento del 10%.
- Los uniformes tienen un descuento del 15%.
- No se pueden registrar dos productos con el mismo código.
