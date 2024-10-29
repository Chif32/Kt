package task6.Animal

open class Animal {
    open fun sound() {
    }
    fun print() {
        println("выберите: dog, cat, bird")
        val name = readln().lowercase()

        val animal: Animal = when (name) {
            "dog" -> Dog()
            "cat" -> Cat()
            "bird" -> Bird()
            else -> throw IllegalArgumentException("Неизвестное животное")
        }
        animal.sound()

    }
}