import clases.*
import clases.Vehiculo
import Servicios.Servicios


fun accionesVehiculo(vehiculo: Vehiculo) {
    println("¿Desea comenzar a usar el vehículo?")
    println("1. Sí")
    println("2. No")
    when (readln().toInt()) {
        1 -> {
            vehiculo.arrancar()
            println("-----------------------------------")
            vehiculo.acelerar(vehiculo.getTipo())
        }
        2 -> println("El vehículo permanece sin usar.")
        else -> println("Opción no válida.")
    }
}

fun main() {
//    val vehiculos = listOf(
//        Coche.deportivo,
//        Coche.comercial,
//        Coche.caminoneta,
//        Bicicleta.montaña,
//        Bicicleta.carrera
//    )
//
//    vehiculos.forEachIndexed { index, vehiculo ->
//        println("${index + 1}. ${vehiculo::class.simpleName?.uppercase()} ${vehiculo.getMarca()} ${vehiculo.getModelo()} ${vehiculo.getTipo()}")
//    }
//
//    println("¿Qué vehículo desea elegir?")
//    val opcion = readln().toInt()
//
//    if (opcion in 1..vehiculos.size) {
//        val vehiculo = vehiculos[opcion - 1]
//        accionesVehiculo(vehiculo)
//    } else {
//        println("Opción no válida.")
//    }


    Servicios.algo()
}