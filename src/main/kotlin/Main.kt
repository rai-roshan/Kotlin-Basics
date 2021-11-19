class Main {

}

fun main() {

    //array declaration for any type of data
    val a: Array<Int> = arrayOf(1,2,3,4,5,6,7,8)

    //array declaration for primitive data type
    val b: IntArray = intArrayOf(1,2,3,4,5,6,7,8)

    //array declaration with fixed size and initializer
    val c = Array(5) { 4 }  // its a lambda function

    println( a[0] )
    println( c[3] )
    println( c[4] )
}