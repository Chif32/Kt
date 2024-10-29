package task6.Animal

fun main() {

    println("Введите название животного (Dog, Cat или Bird):")
    val animalName = readLine()


    val animal: Animal? = when (animalName) {
        "Dog" -> Dog()
        "Cat" -> Cat()
        "Bird" -> Bird()
        else -> {
            println("Неизвестное животное!")
            null
        }
    }


    animal?.let {
        println(it.sound())
    }
}