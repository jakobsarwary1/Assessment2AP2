class Apartment(
    address: String,
    rooms: Int,
    val floor: Int
) : RealEstate(address, rooms) {

    override fun displayInfo(otherProperties: List<RealEstate>): String {
        val otherApartments = otherProperties.filterIsInstance<Apartment>().count { it.address == this.address }
        return "Wohnung an der Adresse: $address mit $rooms Räumen im $floor. Stock. $otherApartments Wohnungen an der selben Adresse."
    }
}