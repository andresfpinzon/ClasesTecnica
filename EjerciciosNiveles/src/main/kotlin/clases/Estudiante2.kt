package clases

class Estudiante2(
    val nombre: String,
    val edad: Int,
    val promedio: Float
){
    override fun toString(): String {
        return "Estudiante(nombre='$nombre', edad=$edad, promedio=$promedio)"
    }

}