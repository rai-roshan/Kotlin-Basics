class Main {

}

fun main() {

    var i: Int = 0
    while(i < 10) {
        print("$i ")
        i+=2
    }
    print("\n");

    // for loop is used to iterate any range or any collections which provide an iterator
    for( j: Int in 1..10 ){
        print("$j ")
    }
    print("\n")

    val a: Array<Int> = arrayOf(11,22,33,44,55)
    for( j: Int in a.indices){
        print("${a[j]} ")
    }
}