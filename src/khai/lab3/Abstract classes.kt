package khai.lab3

abstract class Bachelor:Exam {

    abstract var specialization: String

    abstract fun study(a:Int, b:Int, c:Int) :Double

    open fun drink_something(what: String) {
        println("Выпить $what...")
    }

}

abstract class Master(val speciality: String) {

    abstract fun learn()

    open fun learn_now(discipline: String) {
        println("Learning new discipline: $discipline...")
    }

}