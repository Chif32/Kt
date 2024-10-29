import task7.Car

fun main() {
    println("введите количество автомобилей:")
    val numberOfCars = readln().toInt()

    for (i in 1..numberOfCars) {
        println("введите марку и год выпуска автомобиля (через пробел):")
        val input = readln().split(" ")
        val brand = input[0]
        val year = input[1].toInt()

        val car = Car(brand, year)
        car.printDetails()
    }
}