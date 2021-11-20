class Main {

}

fun rollDice() {
    println( (1..10).random())
}

fun multRollDice( times: Int ) {
    for( i in 0 until times ){
        rollDice()
    }
}

fun createPizza( size: String = "MD" , extraToppings: Boolean = false , veg: Boolean = true ){
    println("=====Pizza Detail=====")
    println("size: $size")
    println("extra topping: $extraToppings")
    println("veg: $veg")
}

fun getSum( vararg nums: Int ) : Int {
    return nums.sum()
}

fun main() {
    //simple function call
    rollDice()

    print("\n")

    //function with arguments
    multRollDice(3)

    print("\n")

    //function with named arguments , any order
    createPizza(size = "XL", veg = false, extraToppings = true)

    print("\n")

    //function that return value and take any number of arguments
    println("the returned value is : ${getSum( 5, 4, 5, 4)}")
}