import clases.Coche

fun accionesVehiculo(coche: Coche, tipo: String) {
    println("¿Desea encender el auto?")
    println("1. Sí")
    println("2. No")
    val encender = readln().toInt()

    when (encender) {
        1 -> {
            coche.arrancar()
            println("-----------------------------------")
            coche.acelerar(tipo)
        }
        2 -> println("El coche permanece apagado.")
        else -> println("Opción no válida.")
    }
}

fun main() {
    var tipo: String = ""

    var vehiculos : MutableList<Coche> = mutableListOf(Coche.deportivo,Coche.comercial, Coche.caminoneta)

    vehiculos.forEachIndexed { index, vehiculo ->
        println("${index + 1}. COCHE ${vehiculo.placa} ${vehiculo.tipo} ${vehiculo.marca} ${vehiculo.modelo}")
    }
    println()
    println("Que coche desea elegir?")
    var coche = readln().toInt()

    when {
        coche == 1 -> tipo = "DEPORTIVO"
        coche == 2 -> tipo = "COMERCIAL"
        coche == 3 -> tipo = "CAMIONETA"
        else -> println("Opcion no valida ")
    }

    if (tipo.isNotEmpty()) {
        accionesVehiculo(vehiculos[coche - 1], tipo)
    }


}