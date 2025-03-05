package clases

abstract class  Vehiculo(protected val marca: String, protected val modelo: String, protected val tipo: String){

    abstract fun arrancar()

    abstract fun acelerar(tipo: String)

    abstract fun detener()

    abstract fun apagar()

    internal fun getMarca(): String{

        return marca

    }

    internal fun getModelo(): String{

        return modelo

    }

    internal fun getTipo(): String{

        return tipo

    }

}