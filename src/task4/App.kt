package task4

fun main() {

   println("введите: play")
    val command = readLine()

    if (command == "play") {
        val guitar = Guitar()
        guitar.play()
    } else {
        println("неизвестная команда")
    }
}