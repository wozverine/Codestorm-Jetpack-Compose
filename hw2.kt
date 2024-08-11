fun main() {
    println(angleCalculator(6))
    println(calculateSalary(20))
    println(calculateCost(51))
    println(calculateFahrenheit(10))
    println(calculateRectangle(5,2))
    println(calculateFactorial(0))
    println(countLetterA("abaAABb"))
}

fun angleCalculator(sideCount: Int) : Int {
    return (sideCount - 2) * 180
}

fun calculateSalary(days: Int): Int {
    val hourlyRate = 10
    val overtimeHourlyRate = 20
    val totalHours = days * 8
    val regularHours = if (totalHours > 160) 160 else totalHours
    val overtimeHours = if (totalHours > 160) totalHours - 160 else 0

    return (regularHours * hourlyRate) + (overtimeHours * overtimeHourlyRate)
}

fun calculateCost(quotaAmount: Int): Int {
    val baseCost = 100
    val baseQuota = 50
    val overageCostPerGB = 4

    return if (quotaAmount > baseQuota) {
        baseCost + (quotaAmount - baseQuota) * overageCostPerGB
    } else {
        baseCost
    }
}

fun calculateFahrenheit(celsius: Number): Double {
    return celsius.toDouble() * 1.8 + 32
}

fun calculateRectangle(length: Int, width: Int): Int {
    return 2 * (length + width)
}

fun calculateFactorial(number: Int): Int {
    return if (number == 0) 1 else number * calculateFactorial(number - 1)
}

fun countLetterA(word: String): Int {
    return word.count { it == 'a' || it == 'A' }
}
