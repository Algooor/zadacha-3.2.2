fun main() {
    val likes = 173489781
    val lastNumber = likes%10
    val lastNumber11 = likes%100
    if (lastNumber11 == 11) println("Понравилось $likes людям") else if (lastNumber == 1) println("Понравилось $likes человеку") else println("Понравилось $likes людям")

}