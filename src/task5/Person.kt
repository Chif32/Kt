package task5

open class Person(val name: String, val role: String) {
    open fun showInfo() {
        println("Name: $name, Role: $role")
    }
}
