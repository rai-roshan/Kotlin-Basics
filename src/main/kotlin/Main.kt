class Main {

}

/* there is no terniary opertator in Kotlin
* instead we can use if-else and when as expressions */
fun main() {

    val eligible: Boolean
    val age: Int = 18
    eligible = if(age<18) false else true

    val userType: String = "admin"
    val rights: String = when( userType ) {
        "admin" -> "you are granted all the rights"
        "user" -> "restricted rights to user"
        "group" -> "for additional rights ask admin for permission"
        else -> "this case is not handled"
    }

    println("is user eligible : $eligible")
    println("users rights : $rights")
}