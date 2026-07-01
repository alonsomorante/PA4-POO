# PA4 - Programación Orientada a Objetos

## Tienda Académica

Sistema de consola desarrollado en Java para la gestión de productos de una tienda académica. Este proyecto corresponde a la evaluación PA4 del curso de Programación Orientada a Objetos e integra los temas de colecciones de objetos, búsquedas, ordenamientos, herencia, clases abstractas, interfaces y sobrescritura de métodos.

---

## Integrantes

- Félix Daniel Román Ciprián
- Juan Ángel Cáceres Guerra
- Alonso Morante Ubaldo

---

## Objetivo

Desarrollar una solución en Java que permita registrar, listar, buscar y ordenar productos de una tienda académica, aplicando una jerarquía de clases con herencia, una interfaz funcional y colecciones genéricas.

---

## Estructura del proyecto

```
PA4-POO/
├── src/
│   └── tienda/
│       ├── modelo/
│       │   ├── Producto.java       # Clase abstracta base
│       │   ├── Descuentable.java   # Interfaz
│       │   ├── Libro.java          # Clase derivada
│       │   └── Uniforme.java       # Clase derivada
│       ├── servicio/
│       │   └── GestorProductos.java # Lógica de colecciones
│       └── principal/
│           └── Main.java           # Menú interactivo
└── README.md
```

---

## Decisiones técnicas

- **Clase abstracta `Producto`**: agrupa los atributos comunes de todos los productos (`codigo`, `nombre`, `precio`, `stock`, `categoria`) y declara el método abstracto `calcularPrecioFinal()`.
- **Clases derivadas `Libro` y `Uniforme`**: representan los dos tipos de producto de la tienda académica. Cada una sobrescribe `calcularPrecioFinal()` y `toString()` para mostrar sus características específicas.
- **Interfaz `Descuentable`**: define el comportamiento obligatorio `aplicarDescuento(double)`, implementado por ambas clases derivadas.
- **Colección genérica `ArrayList<Producto>`**: almacena todos los productos registrados.
- **`HashSet<String>`**: controla la unicidad de los códigos de producto, evitando registros duplicados.
- **Búsqueda**: permite buscar por código exacto o por nombre (coincidencia parcial, ignorando mayúsculas y tildes).
- **Ordenamiento**: los productos se ordenan por precio de menor a mayor usando `Collections.sort()` con un `Comparator`.

---

## Instrucciones de ejecución

### Requisitos

- Java JDK 8 o superior.
- Git (opcional, para clonar el repositorio).

### Compilación

Desde la raíz del proyecto ejecutar:

```bash
find src -name "*.java" -print | xargs javac -d out
```

### Ejecución

```bash
java -cp out tienda.principal.Main
```

### Menú disponible

1. Registrar producto (Libro o Uniforme)
2. Listar productos
3. Buscar producto por código
4. Buscar producto por nombre
5. Ordenar productos por precio
6. Salir

---

## Video explicativo

[Ver video en YouTube](URL_DEL_VIDEO)

> El video debe mostrar a los integrantes con cámaras encendidas explicando cómo resolvieron la evaluación, por qué eligieron esta solución y qué decisiones tomaron durante el desarrollo.

---

## Notas adicionales

- Los precios finales incluyen descuentos diferenciados: **10% para libros** y **15% para uniformes**.
- El sistema valida que no se repitan códigos de producto al momento del registro.
- La búsqueda por nombre normaliza tildes para ofrecer mejores resultados.
