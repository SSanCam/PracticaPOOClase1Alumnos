fun main() {
    //CAFETERAS

    val cafetera1 = Cafetera("Sala")
    val cafetera2 = Cafetera("Cocina", 750)
    val cafetera3 = Cafetera("comedor", 500, 0)

    val cafeteras = listOf(cafetera1, cafetera2, cafetera3)

    //TAZAS
    val tazas = mutableListOf<Taza>()
     for (i in 1..20){
         val capacidad = listOf(50,75,500).random()
         val taza = Taza(capacidad = capacidad)
         tazas.add(taza)
     }

}