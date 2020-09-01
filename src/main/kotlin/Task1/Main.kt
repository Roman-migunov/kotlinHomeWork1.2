package Task1

fun main() {
    //Задача 1. Оплата картой
    //Реализация с конвертацией
    val amountRuble: Int = 1000 // Количество рублей
    val minimalComission: Int = 35 // Минимальная комиссия 35 рублей
    val perComission = 0.75F // комиссия 0,75%

    var amountCopeck = conversion(amountRuble) // Конвертируем рубли в копейки получаем сумму 100_000 копеек
    var copMinComission =
        conversion(minimalComission) // Конвертируем рубли минимальной комиссии в копейки получаем 3500 копеек

    var comission = amountCopeck / 100 * perComission // Снимаем комиссию 0,75%
    if (comission < copMinComission) comission =
        copMinComission // Проверяем соответствует ли комиссия минимальному значению

    var result = amountCopeck - comission // Снимаем комиссию по условиям
    println("Отправлена сумма: $amountCopeck, Получена сумма: $result") // Выводим результат

}

private fun conversion(x: Int): Double { //
    return (x * 100).toDouble()
}