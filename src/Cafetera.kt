class Cafetera( ubicacion: String ) {

    var capacidad =  1000
    var cantidad = 0

    //CONSTRUCTOR SECUNDARIO UBICACION Y CAPACIDAD
    constructor(ubicacion: String, capacidad: Int) : this(ubicacion){
    }

    //CONSTRUCTOR SECUNDARIO UBICACION, CAPACIDAD Y CANTIDAD
    constructor(ubicacion: String, capacidad: Int, cantidad: Int) : this(ubicacion, capacidad){
    }

    //GETTER SETTER:
    var ubicacion: String = ubicacion
        get() =  field
        set(value) {
            field = value
        }
    var capacidad: Int = 1000
        get() = field
        set(value) {
            field = value
        }
    var cantidad: Int = 0
        get() = field
        set(value) {
            field = value
        }
    //METODOS:
    /**
     * Llenar:
     * @return Devuelve la cafetera llena hasta su máxima capacidad
     */
    fun llenar(): Int{
        this.cantidad = this.capacidad
        return this.cantidad
    }

    /**
     * Servir taza:
     *

    fun servirTaza(taza: Taza: Int){
        if (this.cantidad > 0)
    if (this.cantidad > taza.capacidad){
        taza.llenar()
        servirCAfe(taza.capacidad)
    }
    */
    /**
     * Vaciar:
     * @return Actualiza la cantidad actual a 0
     */
    fun vaciar(): Int{
        this.cantidad = 0
        return this.cantidad

    }

    /**
     * Agregar cafe:
     *  @return La cantidad actual despues de agregar el café
     *
     */
     fun agregarCafe(cantCafe: Int, cantidadCafetera: Int = 1000): Double{


        if (this.cantActual > 1000){
            this.cantActual = 1000
        }
        return cantActual
     }

}
