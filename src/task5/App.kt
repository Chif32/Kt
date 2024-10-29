package task5

fun main() {

    println("Введите имя и роль пользователя (Moderator или Admin):")
    val input = readLine()

    if (input.isNullOrBlank()) {
        println("Некорректный ввод.")
        return
    }

    val parts = input.split(" ")
    if (parts.size != 2) {
        println("Введите имя и роль через пробел.")
        return
    }

    val name = parts[0]
    val role = parts[1]


    val person: Person? = when (role) {
      "mod", "moderator", "Moderator" -> Moderator(name)
      "adm", "admin",  "Admin" -> Admin(name)
        else -> {
            println("Некорректная роль. Используйте 'Moderator' или 'Admin'.")
            null
        }
    }


    person?.showInfo()
}