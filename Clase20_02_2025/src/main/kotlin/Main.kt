import questions.MiClaseBoolean

fun main() {

    println("¿Te llegó el pago de nómina?")
    println("Confirma con SI o con NO:")
    val confinomi: String = readln()

    val miObjeto = MiClaseBoolean()
    miObjeto.mostrarEstado(confinomi)

}