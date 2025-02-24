package questions

class MiClaseBoolean() {

    fun mostrarEstado(confirmacion: String) {
        if (confirmacion== "SI") {
            println("Gracias por confirmar el pago.");
        }else {
            println("Lo sentimos , en un momento se solucionara el problema");
        }
    }
}
