package task3

fun main() {
    println("выберите тип: Int=1  Double=2")
    val dataType = readln()

    println("выберите операцию: +, -, *, /")
    val operation = readln()

    println("введите первое значение")
    val num1 = readln().toDouble()

    println("введите второе значение")
    val num2 = readln().toDouble()

    val mathOps = MathOperations()

    val result: Double = when (operation) {

        "+" -> {
            if (dataType == "1") {
                mathOps.add(num1.toInt(), num2.toInt()).toDouble()
            } else {
                mathOps.add(num1, num2)
            }
        }
        "-" -> {
            if (dataType == "1") {
                mathOps.subtract(num1.toInt(), num2.toInt()).toDouble()
            } else {
                mathOps.subtract(num1, num2)
            }
        }
        "*" -> {
            if (dataType == "1") {
                mathOps.multiply(num1.toInt(), num2.toInt()).toDouble()
            } else {
                mathOps.multiply(num1, num2)
            }
        }
        "/" -> {
            if (dataType == "1") {
                mathOps.divide(num1.toInt(), num2.toInt()).toDouble()
            } else {
                mathOps.divide(num1, num2)
            }
        }
        else -> {
            throw IllegalArgumentException("Неверный тип операции!!")

        }
    }

    println(result)
}