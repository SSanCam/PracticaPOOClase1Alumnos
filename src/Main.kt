/**
 * PROGRAMA PRINCIPAL:
 * Muestra el uso de las clases Cafetera, Taza y Color
 */
fun main() {

    val cafetera1 = Cafetera("Sala")
    val cafetera2 = Cafetera("Cocina", 750)
    val cafetera3 = Cafetera("comedor", 500, 0)

    val cafeteras = listOf(cafetera1, cafetera2, cafetera3)
    println("Estas son nuestras cafeteras: ")
    //CAFETERAS
    //IMPRIMIMOS LAS CAFETERAS CREADAS
    for (cafetera in cafeteras) {
        println(cafetera.toString())
    }

    println("20 Tazas con cantidades aleatorias: ")
    //TAZAS
    //GENERAMOS LAS 20 TAZAS CON CAPACIDAD random ENTRE LAS TRES OPCIONES QUE DAMOS: 50, 75 Y 100
    val tazas = mutableListOf<Taza>()
    for (i in 1..20) {
        val capacidad = listOf(50, 75, 500).random()
        val taza = Taza(capacidad = capacidad)
        tazas.add(taza)
    }
    //MOSTRAMOS LA INFORMACIÓN QUE CONTIENEN LAS 20 TAZAS PREVIAMENTE CREADAS
    for (taza in tazas) {
        println(taza.toString())
    }
}