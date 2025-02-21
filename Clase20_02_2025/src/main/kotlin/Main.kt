import questions.MiClaseBoolean

fun main() {

    val Pagosi = "SI"
    println("¿Te llegó el pago de nómina?")
    println("Confirma con SI o con NO:")
    val confinomi: String = readln()
    if (confinomi == Pagosi) {
        val miObjeto = MiClaseBoolean(true)
        miObjeto.mostrarEstado()
    } else {
            println("Lo sentimos , en un momento se solucionara el problema");
    }

}