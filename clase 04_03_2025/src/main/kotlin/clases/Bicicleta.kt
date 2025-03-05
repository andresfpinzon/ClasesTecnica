package clases

import kotlin.system.exitProcess

class Bicicleta(tipo: String, marca: String, modelo: String) : Vehiculo(marca, modelo, tipo) {

    companion object {
        val montaña = Bicicleta("MONTAÑA", "TREK", "2021")
        val carrera = Bicicleta("CARRERA", "SPECIALIZED", "2022")
    }

    override fun arrancar() {
        println("La bicicleta $marca, $modelo, $tipo está lista para pedalear.")
    }

    override fun apagar() {
        println("La bicicleta $marca, $modelo, $tipo se ha dejado de usar.")
    }

    override fun detener() {
        println("La bicicleta $marca, $modelo, $tipo se ha detenido.")
    }

    private fun bajarse() {
        println("Te has bajado de la bicicleta $marca, $modelo, $tipo.")
        println("¿Desea volver a Subirse?")
        println("1. Sí")
        println("2. No")
        when (readln().toInt()) {
            1 -> arrancar()
            2 -> {
                apagar()
                exitProcess(0)
            }
            else -> println("Opción no válida.")
        }
    }

    override fun acelerar(tipo: String) {
        var detener = 0
        var cambioActual = 0

        val velocidadBase = when (tipo.uppercase()) {
            "MONTAÑA" -> 10
            "CARRERA" -> 15
            else -> 10
        }

        val cambios = when (tipo.uppercase()) {
            "MONTAÑA" -> 6
            "CARRERA" -> 3
            else -> 3
        }

        do {
            println("¿Qué cambio desea aplicar? (1-$cambios)")
            println("${cambios + 1}. Frenar")

            when (val opcion = readln().toInt()) {
                in 1..cambios -> {
                    cambioActual = opcion
                    println("Pedaleando en la marcha $cambioActual. Velocidad: ${velocidadBase * cambioActual} km/h")
                }
                cambios + 1 -> {
                    detener()
                    println("¿Desea bajarse de la bicicleta?")
                    println("1. Sí")
                    println("2. No")
                    detener = readln().toInt()
                    if (detener == 1) bajarse()
                }
                else -> println("Opción no válida.")
            }
        } while (detener != 1)
    }
}