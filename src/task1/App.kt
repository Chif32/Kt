package task1
import task1.Person

fun main() {
    println("Введите кол-во людей")
    val n = readln().toInt()

    println("Введите имена по очереди")
    for (i in 1..n) {
        val name = readln()
        val person = Person()
        person.setName(name)
        person.printName()
    }
}