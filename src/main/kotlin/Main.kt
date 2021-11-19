class Main {

}

// alternate of switch case
fun main() {
    val userType: String = "admin"
    when( userType ) {
        "admin" -> {
            println("you are granted all the rights")
        }
        "user" -> {
            println("restricted rights to user")
        }
        "group" -> {
            println("for additional rights ask admin for permission")
        }
        else -> {
            println("this case is not handled")
        }
    }
}