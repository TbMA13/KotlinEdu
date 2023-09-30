package src

import kotlin.random.Random

fun getGameChoice(currentArray: Array<String>): String = currentArray[Random.nextInt(0, 3)]
fun getUserChoice(currentArray: Array<String>): String {
    print("Выберите один из вариантов: ")
    var userInput: String
    while (true) {
        for ((index, item) in currentArray.withIndex()) {
            print(item)
            if (index != currentArray.size - 1) {
                print(", ")
            }
        }
        println("")
        userInput = readlnOrNull().toString()
        for (item in currentArray) {
            if (item == userInput) {
                return userInput
            }
        }
        println("Введите корректную фразу!")
    }
}

fun main(/*args: Array<String>*/) {
    val options = arrayOf("Камень", "Ножницы", "Бумага")
    val pcChoice: String = getGameChoice(options)
    val userChoice: String = getUserChoice(options)
    println(printResul(pcChoice, userChoice))
}

fun printResul(pcChoice: String, userChoice: String): String {
    return if (pcChoice == userChoice) {
        "Ничья"
    } else if (pcChoice == "Бумага" && userChoice == "Камень" ||
        pcChoice == "Камень" && userChoice == "Ножницы" ||
        pcChoice == "Ножницы" && userChoice == "Бумага"
    ) {
        "Вы выиграли!"
    } else {
        "Вы - лох!"
    }
}
