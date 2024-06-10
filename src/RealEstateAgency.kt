class RealEstateAgency(
    val properties: List<RealEstate>
)


// eine Methode getRealEstateDialog,
//welche anhand der Liste von RealEstate eine Übersicht über das Immobilienportfolio erstellt.
{
    fun getRealEstateDialog(): String {
        val dialog = StringBuilder("Es sind folgende Immobilien im Angebot:\n")
        for (property in properties) {
            dialog.append(property.displayInfo(properties)).append("\n")
        }
        return dialog.toString()
    }
}