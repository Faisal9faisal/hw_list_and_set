fun main(args: Array<String>) {
    val favCity = mutableListOf<String>("Makkah", "Riyadh", "Jeddah")
        println(favCity)
     favCity.addAll(listOf("Dammam", "Abha"))
    println(favCity)
    favCity[4]="ABha in South of Saudi"
    println(favCity)

   for(index in 0 until favCity.size){
       println("$index - ${favCity[index]}")

   }
}
