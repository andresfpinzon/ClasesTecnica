package clases

class CuentaBancaria (
    val saldo : Double,
    val titular: String
){

//    fun retiro(retiro: Double) {
//        val restante = this.saldo - retiro
//        println("Señor ${this.titular}, el saldo restante de la cuenta es $restante")
//    }
    companion object{
        val cuenta1 = CuentaBancaria(
            saldo = 5000000.00,
            titular = "Pedro Perez"
        )

        fun retiro(retiro: Double, cuenta:CuentaBancaria){

            val restante= cuenta.saldo-retiro
            println("Señor ${cuenta.titular}, el saldo restante de la cuenta es $restante")
        }
    }
}


//val cuenta1 = CuentaBancaria(
//    saldo = 5000000.00,
//    titular = "Pedro Perez"
//)
