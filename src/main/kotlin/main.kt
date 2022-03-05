fun main() {
    val likes = 314
    val lastNumber = likes%10
    if (lastNumber == 1) println("Понравилось $likes человеку") else println("Понравилось $likes людям")
}