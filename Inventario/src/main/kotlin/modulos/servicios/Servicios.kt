package modulos.servicios

import modulos.clases.Producto

class Servicios {

    var productos : MutableList<Producto> = mutableListOf()


    fun crearProducto() {
        println("Ingrese los datos del producto")
        println("nombre:")
        val nombre = readln().uppercase()
        println("precio:")
        val precio = readln().toFloat()
        println("cantidad:")
        val cantidad = readln().toInt()

        val nuevoProducto = Producto(
            nombre = nombre,
            precio = precio,
            cantidad = cantidad
        )

        productos.add(nuevoProducto)
        println("Producto creado exitosamente.")
    }

    fun listarProductos(productos: List<Producto>) {
        if (productos.isEmpty()) {
            println("No hay ningún producto registrado.")
        } else {
            productos.forEach { producto ->
                println("ID: ${producto.getId()}, Nombre: ${producto.getNombre()}, Precio: ${producto.getPrecio()}, Cantidad: ${producto.getCantidad()}")
            }
        }
    }

    fun actualizarProducto() {
        println("Ingrese el ID del producto a actualizar:")
        val id = readln()

        val producto = productos.find { it.getId() == id }
        if (producto != null) {
            println("Ingrese los nuevos datos del producto :")
            println("Si no desea modificar un valor dejelo en blanco:")

            println("Nombre actual: ${producto.getNombre()}:")
            val nombre = readln().uppercase().takeIf { it.isNotBlank() } ?: producto.getNombre()

            println("Precio actual: ${producto.getPrecio()}:")
            val precio = readln().uppercase().toFloatOrNull() ?: producto.getPrecio()

            println("Cantidad actual: ${producto.getCantidad()}:")
            val cantidad = readln().uppercase().toIntOrNull() ?: producto.getCantidad()

            producto.setNombre(nombre)
            producto.setPrecio(precio)
            producto.setCantidad(cantidad)

            println("Producto actualizado exitosamente.")
        } else {
            println("Producto no encontrado.")
        }
    }


    fun eliminarProducto() {
        println("Ingrese el ID del producto que desea eliminar:")
        val id = readln().uppercase()

        val producto = productos.find { it.id == id }
        if (producto != null) {
            productos.remove(producto)
            println("Producto eliminado exitosamente.")
        } else {
            println("El producto no fue encontrado.")
        }
    }


    fun menu(){
            var salir = false
            while (!salir) {
                println("___________________________________________________________")
                println("Menú:")
                println("1. Crear Producto")
                println("2. Listar Producto")
                println("3. Actualizar Producto")
                println("4. Eliminar Producto")
                println("5. Salir")
                println("Seleccione una opción:")
                when (readln()) {
                    "1" -> crearProducto()
                    "2" -> listarProductos()
                    "3" -> actualizarProducto()
                    "4" -> eliminarProducto()
                    "5" -> {
                        println("Saliendo del sistema")
                        salir = true
                    }
                    else -> println("Opción no válida, por favor intente de nuevo.")
                }
            }
        }
}