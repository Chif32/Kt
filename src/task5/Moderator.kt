package task5

class Moderator(name: String) : Person(name, "Moderator") {
    override fun showInfo() {
        println("Имя: $name, Роль: Модератор")
    }
}
