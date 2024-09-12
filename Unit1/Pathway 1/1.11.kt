fun main() {
    println(cityInfoDisplay("Ankara",27,31,82))

    println(cityInfoDisplay("Tokyo",32,36,10))

    println(cityInfoDisplay("Cape Town",59,64,2))

    println(cityInfoDisplay("Guatemala City",50,55,7))
}

fun cityInfoDisplay(cityName: String, lowTemp: Int, highTemp: Int, rainChance: Int): String {
    return "City: $cityName\nLow temperature: $lowTemp, High tempearture: $highTemp\nChance of rain: $rainChance%\n"
}