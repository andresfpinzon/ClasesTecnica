package modulos.clases

class Producto(
    private val id: String,
    private var nombre: String,
    private var precio: Float,
    private var cantidad: Int
) {
    companion object {
        private var contador: Int = 0

        private fun generarId(): String {
            contador++
            return "PROD$contador"
        }


    }

    constructor(nombre: String, precio: Float, cantidad: Int) : this(generarId(), nombre, precio, cantidad)

    fun getId(): String {
        return id
    }

    fun getNombre(): String {
        return nombre
    }

    fun getPrecio(): Float {
        return precio
    }

    fun getCantidad(): Int {
        return cantidad
    }


    fun setNombre(nombre:String) {
        this.nombre = nombre
    }

    fun setPrecio(precio:Float) {
        this.precio = precio
    }

    fun setCantidad(cantidad:Int) {
        this.cantidad = cantidad
    }


}







