class Main {

}

// Null Safety handles the NullPointerException , so our code doesn't break in between
fun main() {
    val age: Int = 17
    if(age < 18){
        println("you are under age kid")
    }
    else{
        println("oh you grownup man , u are in")
    }
}