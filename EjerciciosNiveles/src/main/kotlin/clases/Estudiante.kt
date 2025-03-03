package clases

class Estudiante(
    val nombre: String,
    val edad: Int
){
    init {
        println("El nombre es $nombre")
        println("La Edad es $edad")
    }

    fun ejemplo2For (){



        for (i  in  1..10 step 2){

            println("Numero: $i ")

        }



    }

}