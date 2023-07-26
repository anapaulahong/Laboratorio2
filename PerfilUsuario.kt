class PerfilUsuario {
    val ID: Int
    val nombres: String
    val apellidos: String
    val UrlPhoto: String
    val edad: Int 
    val correo: String 
    val biografia: String 
    val activo: Boolean
    val hobbies: MutableList<Hobby> = mutableListOf()

    fun agregarHobby(hobby: Hobby) {
        hobbies.add(hobby)
    }
}