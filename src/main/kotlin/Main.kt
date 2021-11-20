import kotlin.concurrent.thread

class Main {

}

/*
in kotlin functions are first class i.e.
    1. we can store function in a variable
    2. we can pass function as an argument in a function
    3. we can return function from a function
 */

// this function is taking a function as an argument
// the argument function has one parameter "result" and it has no return type so we use "Unit"
fun rollDice( range: IntRange, time: Int, callback: (result: Int) -> Unit ) {
    for( i in 0 until time ){
        val result = range.random()
        callback(result)
    }
}

fun rollDiceThread( callback: (result: Int)->Unit) {
    thread {
        Thread.sleep( 3000 )
        callback(4)
    }
    println("dice rolled")
}

fun main() {

    // Higher Order Function :
    // a function is called as a higher order function , when a function is passed as an argument or return a function or both
    rollDice(1..6, 4) { result ->
        println(result)
    }

    print("\n")

    rollDiceThread() { result ->
        print("the result is $result")
    }
}