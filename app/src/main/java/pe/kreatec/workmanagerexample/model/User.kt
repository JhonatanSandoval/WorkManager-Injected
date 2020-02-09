package pe.kreatec.workmanagerexample.model

data class User(
    var uid: String = "ABC123",
    var name: String = "Jhonatan",
    var lastName: String = "Sandoval"
) {
    override fun toString(): String = "$name $lastName"
}