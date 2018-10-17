package khai.lab3

class Student:Bachelor() {
    object Group{

    }
    data class Person(val name: String, val surname: String)
    enum class Mark(val min_ects: Int, val max_ects: Int) {
        A(90, 100),
        B(84, 89),
        C(75, 83),
        D(67, 74),
        E(60, 66),
        F(0, 59)

    }

    override fun pass() {
        println("Сегодня сдает студент ${Ilya.surname} ${Ilya.name}")
    }

    override var mark: Int
        get() = Student.Mark.A.max_ects
        set(value) {
            if ((value > 0) && (value < 100)) {
                mark = value
            }
        }

            override fun study(a: Int, b: Int, c: Int): Double {
                println("Студенты группы 529СТ ${VladM.surname}, ${VladL.surname},  ${Ilya.surname} слушают курс по дисциплине - Алгоритмы и методы вычислений")

                val mean: Double = (((a + b + c) / 3).toDouble())
                if (mean < 91) {
                    println("Средний бал ${mean * 0.9} ")
                } else {
                    println("Средний бал ${mean}")
                }
                return mean
            }

            override var specialization: String
            get() = "172 - Телекомуникации и радиотехника"
            set(value: String) {
                this.specialization = value;
            }

            inner class Curiosity {

                fun assess(a: Boolean): Boolean {
                    if (a == true) {
                        println("Студент выполнил задание без ошибок")
                    } else {
                        println("Результат ${a}, т.к. есть ошибки")
                    }
                    return false
                }

            }




            }



