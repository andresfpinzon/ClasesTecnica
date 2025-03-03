import javax.print.attribute.SetOfIntegerSyntax

fun recorrer_array(array: Array<String>) {
    for (elemento in array) {
        println(elemento)
    }
}

fun main() {

    // Lista Array
    var recibos: Array<String> = arrayOf("Luz","Agua","Gas")
    recibos.set(2, "Internet")
    recorrer_array(recibos)

    var mattriz = arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6,7,8,9,10),
        intArrayOf(11,12,13)
    )

    var clientesVIP: Set<Int> = setOf(1234,5678,4040)
    val setMezclado: Set<Any> = setOf(2,4.454,"casa",'c')

    var clientes: MutableSet<Int> = mutableSetOf(1234,5678,4040)

    // Mapas





}