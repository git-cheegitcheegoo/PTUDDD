fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    var result = add(firstNumber, secondNumber)
    var anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    result = subtract(firstNumber, secondNumber)
    anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

fun add(firstNum: Int, secondNum:Int): Int {
    return firstNum + secondNum
}

fun subtract(bigNum:Int, smolNum:Int): Int {
    return bigNum - smolNum
}