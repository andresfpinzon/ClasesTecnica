import ejercicios.Ejercicios
import kotlin.math.E
import clases.*

fun main() {

//    println("Nivel 1")
//    println()
//    //1.Imprime un mensaje simple en la consola, como "¡Hola, Kotlin!".
//    Ejercicios.imprimirM()
//    println("-----------------------------------------")
//    println()
//    //2.Crea dos variables de tipo String, y luego concaténalas e imprime el resultado.
//    Ejercicios.concatenar()
//    println("-----------------------------------------")
//    println()
//    //3.Declara dos variables Int y realiza las operaciones de suma, resta,
//    //multiplicación y división entre ellas. Imprime los resultados.
//    Ejercicios.operaciones()
//    println("-----------------------------------------")
//    println()
//    //4.Crea una variable con val y otra con var. Modifica la variable var y
//    //demuestra que no se puede modificar la de tipo val.
//    Ejercicios.usovalvar()
//    println("-----------------------------------------")
//    println()
//    //5.Crea una variable de tipo Boolean y asigna un valor verdadero o falso.
//    //Luego, imprime el valor de la variable.
//    Ejercicios.imprBoolean()
//    println("-----------------------------------------")
//    println()
//    println("Nivel 2")
//    println()
//    //6.Pide al usuario un número entero y verifica si es par o impar.
//    Ejercicios.parImpar()
//    println("-----------------------------------------")
//    println()
//    //7.Realiza una operación matemática entre una variable Double y una
//    //variable Float, y muestra el resultado
//    Ejercicios.doublefloat()
//    println("-----------------------------------------")
//    println()
//    //8.Crea una variable con el precio de un producto y otra con un descuento
//    //en porcentaje. Calcula el precio final con el descuento aplicado.
//    Ejercicios.descuento()
//    println("-----------------------------------------")
//    println()
//    //9.Solicita tres números al usuario, calcúlalos y muestra el promedio
//    Ejercicios.promedio()
//    println("-----------------------------------------")
//    println()
//    println("Nivel 3")
//    println()
//    //11.Pide un número al usuario. Si el número es mayor que 10, imprime
//    //"Mayor que 10", de lo contrario, imprime "Menor o igual a 10".
//    Ejercicios.usoIf()
//    println("-----------------------------------------")
//    println()
//    //12.Pide un número al usuario y usa una declaración when para imprimir si el
//    //número es "positivo", "negativo" o "cero".
//    Ejercicios.usoWhen()
//    println("-----------------------------------------")
//    println()
//    //13.Crea una clase Estudiante que tenga nombre y edad. Usa el bloque init
//    //para inicializar esos valores y mostrar un mensaje.
//    Estudiante("Andres",25)
//    println("-----------------------------------------")
//    println()
//
//    //14.Crea una función que reciba dos números como parámetros y retorne su
//    //producto. Luego invoca la función en el main.
//
//    println("Ingrese 2 numeros para realizar el producto:")
//    println("Numero 1:")
//    val num1 = readln().toDouble()
//    println("Numero 2:")
//    val num2 = readln().toDouble()
//
//    val producto = Ejercicios.usoFun(num1,num2)
//    println("El producto de los numeros ${num1} y ${num2} es: ${producto}")
//
//    //15.Pide al usuario un número decimal (Float) y conviértelo a entero (Int)
//    //antes de imprimirlo.
//    Ejercicios.conversion()
//    println("-----------------------------------------")
//    println()
//    //16.Crea un Array con 5 elementos enteros y luego imprime el valor de cada
//    //uno de ellos usando un bucle for.
//    Ejercicios.arrayEnteros()
//    println("-----------------------------------------")
//    println()
//    //17.Crea una clase CuentaBancaria con propiedades como saldo y titular.
//    //Añade un metodo que modifique el saldo, restando un monto.
//
//    val cuenta = CuentaBancaria.cuenta1
//    println("El saldo de su cuenta es ${cuenta.saldo}")
//    println("Cuando desea retirar?")
//    val retiro= readln().toDouble()
//    if (retiro>cuenta.saldo){
//        println("Su retiro no puede exeder el saldo")
//    }else{
//        CuentaBancaria.retiro(retiro,cuenta)
//    }
//    println("-----------------------------------------")
//    println()
//    //18.Crea una lista mutable con varios nombres y luego agrega un nombre a
//    //esa lista y muestra la lista actualizada.
//    Ejercicios.listaMut()
//    println("-----------------------------------------")
//    println()
//    //19.Crea una clase con una propiedad privada y usa un getter y setter
//    //personalizados para obtener y establecer el valor de la propiedad.
//
//    val carro = Carro("HJY123")
//    println("Placa actual: ${carro.getPlaca()}")
//
//    carro.setPlaca("XYZ789")
//    println("Placa nueva: ${carro.getPlaca()}")
//    println("-----------------------------------------")
//    println()

    //20.Crea una clase base llamada Animal con un metodo hacerSonido().Luego,
    //crea una clase derivada Perro que sobrescriba este metodo para imprimir
    //"Guau!".

    val picher = Perro()

    picher.hacerSonido()
    println("-----------------------------------------")
    println()

    println("Nivel 5")
    println("")
    //21.Crea un Set de números, agrega algunos elementos, y luego intenta
    //agregar un número repetido para demostrar que el Set no permite
    //duplicados.
    Ejercicios.usarSet()

    //21.Crea una lista de objetos de una clase Estudiante, cada uno con nombre,
    //edad y promedio de calificaciones. Luego, filtra y muestra solo los
    //estudiantes con promedio superior a 7.
    Ejercicios.listaEstudiante()

}