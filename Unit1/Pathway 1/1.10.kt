fun main() {
    println("I have used my phone more than yesterday: ${compareTime(300, 200)}")
    println("I have used my phone more than yesterday: ${compareTime(300, 300)}")
    println("I have used my phone more than yesterday: ${compareTime(200, 300)}")
}

fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}