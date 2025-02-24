package clases

class Carro(
    private var placa: String
){
    //
    fun getPlaca(): String {
        return placa
    }

    // Setter
    fun setPlaca(nuevaPlaca: String) {
            placa = nuevaPlaca
    }

}