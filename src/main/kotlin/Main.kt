class Main {

}

// Null Safety handles the NullPointerException , so our code doesn't break in between
fun main() {
    val firstName: String? = "Roshan"
    val lastName: String? = null

    println("My first name length is ${firstName?.length}")
    println("My last name length is ${lastName?.length}")
}