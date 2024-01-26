/**
 * Clase que representa una cafetera con propiedades como ubicación, capacidad y cantidad de café.
 *
 * @property ubicacion Ubicación de la cafetera (nombre de la sala o habitación donde se encuentra).
 * @property capacidad Capacidad máxima de la cafetera en centímetros cúbicos (c.c.). Por defecto es 1000 c.c.
 * @property cantidad Cantidad actual de café en la cafetera. Por defecto es 0 c.c.
 */
class Cafetera(ubicacion: String) {

    //GETTER SETTER - PROPIEDADES DE CLASE
    var ubicacion: String = ubicacion
        get() = field
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

    //CONSTRUCTORES SECUNDARIOS:

    // Constructores secundarios

    /**
     * Constructor secundario que recibe la ubicación y la capacidad de la cafetera.
     *
     * @param ubicacion Ubicación de la cafetera.
     * @param capacidad Capacidad máxima de la cafetera en c.c.
     */
    constructor(ubicacion: String, capacidad: Int) : this(ubicacion) {
        this.ubicacion = ubicacion
        this.capacidad = capacidad
    }

    /**
     * Constructor secundario que recibe la ubicación, la capacidad y la cantidad de la cafetera.
     *
     * @param ubicacion Ubicación de la cafetera.
     * @param capacidad Capacidad máxima de la cafetera en c.c.
     * @param cantidad Cantidad actual de café en la cafetera.
     */
    constructor(ubicacion: String, capacidad: Int, cantidad: Int) : this(ubicacion, capacidad) {
        this.ubicacion = ubicacion
        this.capacidad = capacidad
        this.cantidad = cantidad
    }


    //METODOS DE LA CLASE CAFETERA:
    /**
     * Llenar:
     * @return Devuelve la cafetera llena hasta su máxima capacidad.
     */
    fun llenar(): Int {
        this.cantidad = this.capacidad
        return this.cantidad
    }

    /**
     * Vaciar:
     * @return Actualiza la cantidad actual a 0.
     */
    fun vaciar(): Int {
        this.cantidad = 0
        return this.cantidad
    }

    /**
     * Agrega una cantidad específica de café a la cafetera.
     *
     * @param cantidad Cantidad de café a agregar.
     * @return La cantidad actual de café después de agregar el café.
     */
    fun agregarCafe(cantidad: Int): Int {
        if (this.cantidad + cantidad > 1000) {
            this.cantidad = 1000
        } else {
            this.cantidad = this.cantidad + cantidad
        }
        return cantidad
    }

    /**
     * Sirve taza en una taza, llenándola hasta su máxima capacidad o hasta la cantidad de café en la cafetera, lo que sea menor.
     *
     * @param cantidadServir Cantidad de café a servir.
     * @param taza Taza en la que se va a servir el café.
     * @return La cantidad actual de café en la taza después de servirla.
     */
    fun servirTaza(cantidadServir: Int, taza: Taza): Int {
        if (taza.cantidad >= 0 && taza.cantidad < taza.capacidad)
            if (this.cantidad > taza.capacidad) {
                taza.llenar()
                agregarCafe(taza.capacidad)
            } else {
                taza.cantidad += cantidadServir
            }
        return taza.cantidad
    }
}
