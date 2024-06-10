// Datei: Main.kt


fun main() {
    val a1 = Apartment("Straße 14, Stadt 2", 4, 2)
    val a2 = Apartment("Straße 14, Stadt 2", 2, 1)
    val h1 = House("Straße 22, Stadt 1", 6, 250.4)

    val realEstateAgency = RealEstateAgency(mutableListOf(a1, a2, h1))

    println(realEstateAgency.getRealEstateDialog())
}
