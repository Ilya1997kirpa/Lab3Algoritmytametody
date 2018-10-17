package khai.lab3

fun main(args: Array<String>) {
    println()
    println("Lab 3")
    val exam:Exam=Student()
    exam.pass()
    val ECTS = Student()
    println(ECTS.mark)
    val bachelor:Bachelor = Student()
    println(bachelor.study(90,87,96))
    print("Специальность: ")
    println(bachelor.specialization)
    Student().Curiosity().assess(false)
    print("Полученная оценка: ")
    Group.send_down(95)
    println(bachelor.drink_something("Кофе"))
}