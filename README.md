# PA4 - Programación Orientada a Objetos

## Integrantes

- Félix Daniel Román Ciprián
- Juan Ángel Cáceres Guerra
- Alonso Morante Ubaldo

## Breve explicación de la solución

Hicimos una tienda académica en Java de consola. El programa permite registrar, listar, buscar y ordenar productos. Usamos una clase abstracta `Producto` de la que heredan `Libro` y `Uniforme`. También usamos la interfaz `Descuentable` para aplicar descuentos. Para guardar los productos usamos un `ArrayList<Producto>` y para evitar códigos repetidos usamos un `HashSet<String>`. La búsqueda es por código o por nombre, y el ordenamiento es por precio de menor a mayor.

## Instrucciones de ejecución

Compilar:

```bash
find src -name "*.java" -print | xargs javac -d out
```

Ejecutar:

```bash
java -cp out tienda.principal.Main
```

## Video explicativo

[Ver video en YouTube](URL_DEL_VIDEO)
