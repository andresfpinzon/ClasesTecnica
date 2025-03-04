package clases


class Coche(val placa: String, val tipo: String, marca: String, modelo: String) : Vehiculo(marca, modelo) {

    companion object{
        var deportivo = Coche(
            "ABC123",
            "DEPORTIVO",
            "MERCEDES",
            "2015"
        )
        var caminoneta = Coche(
            "ABC123",
            "CAMIONETA",
            "TOYOTA",
            "2020"
        )
        var comercial = Coche(
            "ABC123",
            "COMERCIAL",
            "CHEVROLET",
            "2015"
        )
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
        var marcha = 0

        val velocidadBase = when (tipo.uppercase()) {
            "DEPORTIVO" -> 30
            "COMERCIAL" -> 20
            "CAMIONETA" -> 15
            else -> 10
        }

        do {
            println("¿Qué cambio desea aplicar?")
            println("1. Primera")
            println("2. Segunda")
            println("3. Tercera")
            println("4. Cuarta")
            println("5. Quinta")
            println("6. Reversa")
            println("7. Frenar")

            val opcion = readln().toInt()

            when (opcion) {
                1 -> {
                    when {
                        marcha == 0 || marcha == 2 -> {
                            println("La velocidad es ${velocidadBase * 1} km/h")
                            marcha = 1
                        }
                        else -> {
                            marcha = 0
                            apagar()
                            println("Encender el auto?")
                            println("1. Si")
                            println("2. No")
                            var encender = readln().toInt()
                            if (encender == 1){
                                arrancar()
                            }else{
                                break
                            }
                        }
                    }

                }
                2 -> {
                    when {
                        marcha == 1 || marcha == 3 ->{
                            marcha = 2
                            println("La velocidad es ${velocidadBase * 2} km/h")
                        }
                        else -> {
                            apagar()
                            marcha = 0
                            println("Encender el auto?")
                            println("1. Si")
                            println("2. No")
                            var encender = readln().toInt()
                            if (encender == 1){
                                arrancar()
                            }else{
                                break
                            }
                        }
                    }

                }
                3 ->{
                    when {
                        marcha == 2 || marcha == 4 -> {
                            marcha = 3
                            println("La velocidad es ${velocidadBase * 3} km/h")
                        }
                        else -> {
                            apagar()
                            marcha = 0
                            println("Encender el auto?")
                            println("1. Si")
                            println("2. No")
                            var encender = readln().toInt()
                            if (encender == 1){
                                arrancar()
                            }else{
                                break
                            }
                        }
                    }

                }
                4 -> {
                    when {
                        marcha == 3 || marcha == 5 ->{
                            marcha = 4
                            println("La velocidad es ${velocidadBase * 4} km/h")
                        }
                        else -> {
                            apagar()
                            marcha = 0
                            println("Encender el auto?")
                            println("1. Si")
                            println("2. No")
                            var encender = readln().toInt()
                            if (encender == 1){
                                arrancar()
                            }else{
                                break
                            }
                        }
                    }
                }
                5 -> {
                    when {
                        marcha == 4 ->{
                            marcha = 5
                            println("La velocidad es ${velocidadBase * 5} km/h")
                        }
                        else -> {
                            apagar()
                            marcha = 0
                            println("Encender el auto?")
                            println("1. Si")
                            println("2. No")
                            var encender = readln().toInt()
                            if (encender == 1){
                                arrancar()
                            }else{
                                break
                            }
                        }
                    }
                }
                6 -> {
                    when {
                        marcha == 0 -> println("La velocidad es ${velocidadBase * 1} km/h en reversa")
                        else -> {
                            apagar()
                            println("Encender el auto?")
                            println("1. Si")
                            println("2. No")
                            var encender = readln().toInt()
                            if (encender == 1){
                                arrancar()
                            }else{
                                break
                            }
                        }
                    }
                    marcha = 0
                }
                7 -> {
                    detener()
                    println("¿Desea apagar el vehículo?")
                    println("1. Sí")
                    println("2. No")
                    apagar = readln().toInt()

                    if (apagar == 1) {
                        apagar()
                    }
                }
                else -> println("Opción no válida")
            }

        } while (apagar != 1)
    }

}