package clases

class Carro(
    private var placa: String
){
    // Get
    fun getPlaca(): String {
        return placa
    }

    // Setter
    fun setPlaca(nuevaPlaca: String) {
            placa = nuevaPlaca
    }

}