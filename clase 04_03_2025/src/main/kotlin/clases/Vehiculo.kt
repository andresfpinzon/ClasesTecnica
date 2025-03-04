package clases

abstract class  Vehiculo(val marca: String, val modelo: String){

    abstract fun arrancar()

    abstract fun acelerar(tipo: String)

    abstract fun detener()

    abstract fun apagar()

}