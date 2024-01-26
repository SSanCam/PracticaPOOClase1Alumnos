/***
 * Taza respresenta una taza, que tiene atributos de color, capacidad máxima y cantidad que contiene la taza.
 *
 * @property color Es el color de la taza, de forma predeterminada es "BLANCO".
 * @property capacidad Es la cantidad máxima que puede contener.
 * @property cantidad Es la cantidad actual que contiene la taza.
 */
class Taza(color: String = "BLANCO", capacidad: Int = 50, cantidad: Int = 0) {


    //GETTER SETTETS - PROPIEDADES DE LA CLASE
    var color: String = color
        get() = field
        set(value) {
            field = value
        }

    val capacidad: Int = capacidad
        get() = field

    var cantidad: Int = cantidad
        get() = field
        set(value) {
            field = minOf(value, capacidad)
        }

    //METODOS DE CLASE
    /**
     * llenar():
     * @return Devuelve la taza llena a su máxima capacidad.
     */
    fun llenar() {
        this.cantidad = this.capacidad
    }

    /**
     * llenar(): Método sobrecargado del método llenar
     * @param cantidad es la cantidad que se le agrega a la taza.
     * @return La cantidad final que contiene la taza, una vez se haya llenado.
     */
    fun llenar(cantidad: Int) {
        this.cantidad = minOf(this.cantidad + cantidad, capacidad)
    }

    override fun toString(): String {
        return "Taza(color = $color, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }
}