import clases.*
import clases.Vehiculo


fun accionesVehiculo(vehiculo: Vehiculo, tipo: String) {
    println("¿Desea comenzar a usar el vehículo?")
    println("1. Sí")
    println("2. No")
    when (readln().toInt()) {
        1 -> {
            vehiculo.arrancar()
            println("-----------------------------------")
            vehiculo.acelerar(tipo)
        }
        2 -> println("El vehículo permanece sin usar.")
        else -> println("Opción no válida.")
    }
}

fun main() {
    val vehiculos = listOf(
        Coche.deportivo to "DEPORTIVO",
        Coche.comercial to "COMERCIAL",
        Coche.caminoneta to "CAMIONETA",
        Bicicleta.montaña to "MONTAÑA",
        Bicicleta.carrera to "CARRERA"
    )

    vehiculos.forEachIndexed { index, (vehiculo, tipo) ->
        println("${index + 1}. ${vehiculo::class.simpleName?.uppercase()} ${vehiculo.marca} ${vehiculo.modelo} ($tipo)")
    }

    println("¿Qué vehículo desea elegir?")
    val opcion = readln().toInt()

    if (opcion in 1..vehiculos.size) {
        val (vehiculo, tipo) = vehiculos[opcion - 1]
        accionesVehiculo(vehiculo, tipo)
    } else {
        println("Opción no válida.")
    }
}