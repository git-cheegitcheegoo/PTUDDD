fun main() {
    val firstUserEmailId = "user1@gmail.com"
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()
    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user2@vnu.edu.vn"
    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()
    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_tres@neal.fun"
    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS",emailId: String): String {
    return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
}