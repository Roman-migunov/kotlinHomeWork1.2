package Task3

fun main() {
    //Задача 3. Меломан
    val costOrder: Int = 30000 // рублей
    val discountFix: Int = 100 //рублей
    val discountPercent: Float = 0.95F // процентов
    var result = 0
    val meloman: Boolean = true // точно меломан

    if (costOrder < 1000)
    else if (costOrder in 1001..10000) result = costOrder - discountFix
    else result = (costOrder * discountPercent).toInt()

    if(meloman) result = (result * 0.99).toInt()
    println(result)

}