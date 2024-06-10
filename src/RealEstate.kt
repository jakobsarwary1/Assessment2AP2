abstract class RealEstate(
    val address: String,
    val rooms: Int
) {
    abstract fun displayInfo(otherProperties: List<RealEstate>): String
}