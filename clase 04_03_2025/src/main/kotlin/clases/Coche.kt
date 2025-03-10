package clases
import kotlin.system.exitProcess

class Coche(private val placa: String, tipo: String, marca: String, modelo: String) : Vehiculo(marca, modelo, tipo) {

    companion object {
        val deportivo = Coche("ABC123", "DEPORTIVO", "MERCEDES", "2015")
        val caminoneta = Coche("DEF456", "CAMIONETA", "TOYOTA", "2020")
        val comercial = Coche("GHI789", "COMERCIAL", "CHEVROLET", "2015")
    }

    override fun arrancar() {
        println("El coche $marca, $modelo, $tipo de placa $placa acaba de encenderse")
    }

    override fun apagar() {
        println("El coche $marca, $modelo, $tipo de placa $placa acaba de apagarse")
    }

    override fun detener() {
        println("El coche $marca, $modelo, $tipo de placa $placa acaba de detenerse")
    }

    override fun acelerar(tipo: String) {
        var apagar = 0
        var marchaActual = 0

        val velocidadBase = when (tipo.uppercase()) {
            "DEPORTIVO" -> 30
            "COMERCIAL" -> 20
            "CAMIONETA" -> 15
            else -> 10
        }

        do {
            println("¿Qué cambio desea aplicar?")
            println("1-5")
            println("6. Reversa")
            println("7. Frenar")

            when (readln().toInt()) {
                1 -> cambiarMarcha(1, marchaActual, velocidadBase * 1).also { marchaActual = it }
                2 -> cambiarMarcha(2, marchaActual, velocidadBase * 2).also { marchaActual = it }
                3 -> cambiarMarcha(3, marchaActual, velocidadBase * 3).also { marchaActual = it }
                4 -> cambiarMarcha(4, marchaActual, velocidadBase * 4).also { marchaActual = it }
                5 -> cambiarMarcha(5, marchaActual, velocidadBase * 5).also { marchaActual = it }
                6 -> {
                    if (marchaActual == 0) println("La velocidad es ${velocidadBase * 1} km/h en reversa")
                    else apagarVehiculo()
                    marchaActual = 0
                }
                7 -> {
                    detener()
                    println("¿Desea apagar el vehículo?")
                    println("1. Sí")
                    println("2. No")
                    apagar = readln().toInt()
                    if (apagar == 1) apagar()
                }
                else -> println("Opción no válida")
            }
        } while (apagar != 1)
    }

    private fun cambiarMarcha(nuevaMarcha: Int, marchaActual: Int, velocidad: Int): Int {
        return if (marchaActual == nuevaMarcha - 1 || marchaActual == nuevaMarcha + 1) {
            println("La velocidad es $velocidad km/h")
            nuevaMarcha
        } else {
            apagarVehiculo()
            0
        }
    }

    private fun apagarVehiculo() {
        apagar()
        println("¿Desea encender el auto?")
        println("1. Sí")
        println("2. No")
        if (readln().toInt() == 1) arrancar() else exitProcess(0)
    }
}