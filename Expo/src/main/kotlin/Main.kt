fun main() {

    //1. Evitar búsquedas dentro del ciclo
    println()
    println("1. ------------------------------------------------")
    println()

    val lista = listOf(1, 2, 3, 4, 5)
    println(lista[1])

    for (element in lista) { // Se calcula lista.size en cada iteración
        println(element)
    }

    println("------------------------------------------------")

    val tamañoLista = lista.size // Se guarda el tamaño de la lista en una variable

    for (i in 0..<tamañoLista) {
        println(lista[i])
    }

    //2. Minimizar el trabajo dentro del ciclo

    println()
    println("2. ------------------------------------------------")
    println()

    for (element in lista) {
        val sumaTotal = lista.sum() // Se calcula la suma en cada iteración
        println("Elemento: ${element}, Suma total: $sumaTotal")
    }

    println("------------------------------------------------")

    val sumaTotal = lista.sum() // Se calcula la suma fuera del ciclo

    for (element in lista) {
        println("Elemento: ${element}, Suma total: $sumaTotal")
    }

    // 3. Limitar el número de iteraciones
    println()
    println("3. ------------------------------------------------")
    println()

    for (element in lista) {
        for (element in lista) { // Ciclo anidado innecesario
            println("Elemento: $element, $element")
        }
    }

    println("------------------------------------------------")

    // En lugar de anidar ciclos, podemos usar un solo ciclo
    for (i in lista.indices) {
        println("Elemento: ${lista[i]}")
    }

    //4. Usar variables de índice apropiadas
    println()
    println("------------------------------------------------")
    println()
    val estudiantes = listOf("Ana", "Juan", "Maria")

    for (i in estudiantes.indices) { // Nombre de variable no descriptivo
        println("Estudiante ${i + 1}: ${estudiantes[i]}")
    }

    println("4. ------------------------------------------------")

    for (nombre in estudiantes.indices) { // Nombre de variable descriptivo
        println("Estudiante ${nombre + 1}: ${estudiantes[nombre]}")
    }



    //5. Usar ciclos for con iterables
    println()
    println("6. ------------------------------------------------")
    println()

    val numeros = listOf(1, 2, 3, 4, 5)

    for (i in numeros.indices) { // Se usa el índice aunque no es necesario
        println("Número: ${numeros[i]}")
    }

    println("------------------------------------------------")

    numeros.forEach { numero -> // Se usa forEach para iterar sin necesidad de índice
        println("Número: $numero")
    }

    //6. Evitar anidar ciclos innecesariamente
    println()
    println("7. ------------------------------------------------")
    println()

    val matriz = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )


    for (i in matriz.indices) {
        for (j in matriz[i].indices) { // Ciclo anidado innecesario
            println("Elemento: ${matriz[i][j]}")
        }
    }

    println("------------------------------------------------")

    matriz.forEach { fila -> // Se evita el ciclo anidado usando forEach
        fila.forEach { elemento ->
            println("Elemento: $elemento")
        }
    }


//    println("------------------------------------------------")
//
//    //Ejemplo Proyecto
//    val nombres = listOf("Ana", "Juan", "Pedro", "María")
//
//    // Usando forEach
//    nombres.forEach { nombre ->
//        println(nombre)
//    }


}