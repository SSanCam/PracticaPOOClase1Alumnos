class Cafetera(val ubicacion: String ) {

    init{
        val capMax =  1000.00
        var cantActual = 0.0
    }

    //CONSTRUCTOR SECUNDARIO UBICACION Y CAPACIDAD
    constructor(ubicacion: String, capacidad: Double) : this(ubicacion){}

    //CONSTRUCTOR SECUNDARIO UBICACION, CAPACIDAD Y CANTIDAD
    constructor(ubicacion: String, capacidad: Double, cantidad: Double) : this(ubicacion, capacidad){

    }

    //GETTER SETTER:
    var ubicacion: String
        get(field) =

    //METODOS:
    /**
     * Llenar:
     * @return Devuelve la cafetera llena hasta su máxima capacidad
     */
    fun llenar(): Double{
        this.cantActual = this.capMax
        return this.cantActual
    }

    /**
     * Servir taza:
     *
     */
    fun servirTaza(Taza){

    }

    /**
     * Vaciar:
     * @return Actualiza la cantidad actual a 0
     */
    fun vaciar(): Double{
        cantActual = 0.0
        return cantActual
    }

    /**
     * Agregar cafe:
     *  @return La cantidad actual despues de agregar el café
     *
     */
     fun agregarCafe(cantCafe: Double, cantidadCafetera: Double = 1000.00): Double{


        if (cantActual > 1000.00){
            cantActual = 1000.00
        }
        return cantActual
     }

}
