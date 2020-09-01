fun main() {
    //Задача 2. Лайки
    val likes = 32
    var lastSymbol = (likes % 10)
    if (lastSymbol == 1 && likes != 11)
        print("Понравилось $likes человеку")
    else
        print("Понравилось $likes людям")
}