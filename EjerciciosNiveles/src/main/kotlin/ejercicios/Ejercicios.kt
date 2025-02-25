package ejercicios

import clases.Estudiante2

class Ejercicios {
    companion object{

        //Nivel 1
        fun imprimirM() {
            println("Hola Kotlin")
        }

        fun concatenar() {

            val nombre = "Andres"
            val apellido = "Pinzon"

            println("Su nombre completo es $nombre $apellido ")
        }

        fun operacionesBasicas() {
            val num1 = 20
            val num2 = 10

            println("Se realizaran las operaciones a los numeros : $num1 y $num2")
            println("Suma: ${num1+num2}")
            println("Resta: ${num1-num2}")
            println("Multiplicacion: ${num1*num2}")
            println("Division: ${num1/num2}")
        }

        fun usoValVar() {

            var diaLaboral = "Lunes"
            println("Usted trabaja el $diaLaboral")
            diaLaboral = "Martes"
            println("Usted trabaja el $diaLaboral")
            val diaDescanso = "Domingo"

            println("usted siempre descansa el $diaDescanso")

            //diaDescanso = "Domingo"
            //println("usted siempre descansa el ${diaDescanso}")
        }

        fun imprBoolean() {

            val confirmacion = true
            println(confirmacion)

        }

        //Nivel 2
        fun parImpar() {

            println("Ingrese un numero entero :")
            val numero = readln().toInt()
            if (numero%2 == 0 ){
                println("El numero es par")
            }else{
                println("El numero es impar")
            }

        }

        fun doublefloat() {
            val double = 1.4844751482727225
            val float = 5.27

            println("Las Numeros elegidos fueron $double y $float")
            println("El resultado de multiplicar estos dos numeros es: ${double*float} ")
        }

        fun descuento() {

            val precio = 200000
            val descuento = 0.25

            val valorDescuento = precio*descuento
            val precioConDescuento = precio-valorDescuento

            println("El precio del producto es $precio ")
            println("Luego de aplicar un descuento del 25% su valor es:")
            println(precioConDescuento)

        }

        fun promedio() {

            println("Ingrese tres numeros enteros:")
            println("Numero 1:")
            val num1 = readln().toInt()
            println("Numero 2:")
            val num2 = readln().toInt()
            println("Numero 3:")
            val num3 = readln().toInt()

            val promedio = (num1+num2+num3)/3

            println("Los numeros inresados fueron $num1, $num2 y  $num3")
            println("El promedio de estos 3 numeros es $promedio")

        }

        //Nivel 3
        fun usoIf() {
            println("Ingrese un numero:")
            val num = readln().toInt()

            if (num > 10){
                println ("Mayor que 10")
            }else if(num < 10){
                println ("Menor que 10")
            }else {
                println ("Su numero es 10")
            }

        }

        fun usoWhen(){
            println("Ingrese un numero:")
            val num = readln().toInt()
            when  {
                (num > 0) -> println("El numero es Positivo")
                (num < 0) -> println("El numero es Negativo")
                else -> println("El numero es Cero")
            }
        }

        fun usoFun(num1: Double, num2: Double): Double{

            return num1*num2

        }

        fun conversion(){
            println("Ingrese un numero decimal:")
            val num = readln().toFloat()
            val int = num.toInt()

            println("Al convertir el numero decimal $num a entero obtenemos $int")

        }

        //Nivel 4
        fun arrayEnteros(){
            val enteros = listOf(10,20,15,6,2)
            var contador= 0

            for(num in enteros) {
                contador++
                println("Numero $contador: $num")
            }

        }

        fun listaMut(){
            val nombres = mutableListOf("Pedro","Pepe","Andres","Carlos")
            println("Nombres iniciales")
            nombres.forEach { println("Nombre: $it") }
            println("------")
            println("Nombres despues de agregar Andrea")
            nombres.add("Andrea")
            nombres.forEach { println("Nombre: $it") }
        }

        //Nivel 5
        fun usarSet(){
            val numeros : MutableSet<Int> = mutableSetOf(1,2,3,4,5,6)
            println(numeros)

            numeros.add(4)
            println("set sin modificar $numeros")

            numeros.add(7)
            println("set modificado $numeros")


        }

        fun listaEstudiante() {

            val estudiantes = listOf(
                Estudiante2("Juan", 20, 8.5f),
                Estudiante2("María", 22, 6.8f),
                Estudiante2("Pedro", 21, 7.2f),
                Estudiante2("Ana", 19, 9.0f),
                Estudiante2("Luis", 23, 5.5f)
            )

            val estudiantesFiltrados = estudiantes.filter { it.promedio > 7 }

            println("Estudiantes con promedio superior a 7:")
            estudiantesFiltrados.forEach { println(it) }
        }

        fun operacionMat(a: Int, b: Int, operacion: (Int, Int) -> Int) {

            println("Recibir una lambda")
            val resultado = operacion(a, b)
            println("El resultado de la operación es: $resultado")
        }


    }
}