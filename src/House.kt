class House(
    address: String,
    rooms: Int,
    val landSize: Double
) : RealEstate(address, rooms) {

    // ob es sich um ein Premium
    //Haus handelt. Dies trifft zu wenn das Haus mehr als 4 Zimmer und mehr als 200 Quadratmeter
    //Wohnfläche hat.
    override fun displayInfo(otherProperties: List<RealEstate>): String {
        val premiumStatus = if (rooms > 4 && landSize > 200) "[Premium Haus]" else ""
        return "Haus an der Adresse: $address mit $rooms Räumen und mit $landSize Quadratmeter Grundstück. $premiumStatus"
    }
}