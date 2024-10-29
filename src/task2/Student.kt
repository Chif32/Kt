package task2

class Student(name: String, private var studentId: Int? = null) : Person(name) {

    fun setStudentId(newId: Int) {
        studentId = newId
    }

    fun printStudents() {
        super.printName()
        println("Student id: <$studentId>")
    }

    fun enterAndPrintData(list: ArrayList<Student>) {
        println("введите количество студентов")
        val a = readln().toInt()

        for (i in 1..a) {
            println("введите имя и id")
            val name = readln()
            val id = readln()
            val student = Student(name)
            student.setStudentId(id.toInt())
            student.setName(name)
            list.add(student)
        }


    }

    fun printList(list: ArrayList<Student>) {
        for (i in list) {
            i.printStudents()
        }
    }
}
