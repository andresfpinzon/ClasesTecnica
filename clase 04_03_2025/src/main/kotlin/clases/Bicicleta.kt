package clases

import clases.Vehiculo

class Bicicleta(val tipo: String, marca: String, modelo: String) : Vehiculo(marca, modelo) {

    companion object {
        val montaña = Bicicleta("MONTAÑA", "TREK", "2021")
        val carrera = Bicicleta("CARRERA", "SPECIALIZED", "2022")
    }

    override fun arrancar() {
        println("La bicicleta $marca, $modelo, $tipo esta lista para pedalear")
    }

    override fun apagar() {
        println("La bicicleta $marca, $modelo, $tipo se ha detenido")
    }

    override fun detener() {
        println("La bicicleta $marca, $modelo, $tipo se ha detenido")
    }

    override fun acelerar(tipo: String) {
        var detener = 0
        var marcha = 0

        val velocidadBase = when (tipo.uppercase()) {
            "MONTAÑA" -> 10
            "CARRERA" -> 15
            else -> 10
        }

        val maxMarchas = when (tipo.uppercase()) {
            "MONTAÑA" -> 6
            "CARRERA" -> 3
            else -> 3
        }

        do {
            println("¿Que cambio desea aplicar? (1-$maxMarchas)")
            println("${maxMarchas + 1}. Frenar")

            when (val opcion = readln().toInt()) {
                in 1..maxMarchas -> {
                    if (marcha == opcion - 1 || marcha == opcion + 1) {
                        marcha = opcion
                        println("Pedaleando en la marcha $marcha. Velocidad: ${velocidadBase * marcha} km/h")
                    } else {
                        println("Tenga cuidado con los cambios.")
                    }
                }
                maxMarchas + 1 -> {
                    detener()
                    println("¿Desea detener la bicicleta?")
                    println("1. Sí")
                    println("2. No")
                    detener = readln().toInt()
                    if (detener == 1) apagar()
                }
                else -> println("Opción no válida")
            }
        } while (detener != 1)
    }
}