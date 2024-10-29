package task5

class Admin(name: String) : Person(name, "Admin") {
    override fun showInfo() {
        println("Имя: $name, Роль: Администратор")
    }
}