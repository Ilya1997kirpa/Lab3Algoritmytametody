package khai.lab3

data class Person(val name: String, val surname: String)
val Ilya = Student.Person("Илья", "Кирпа")
val VladL = Student.Person("Влад", "Леонов")
val VladM = Student.Person("Влад", "Михайлюк")
data class Thesis(val theme: String, val mark: Int)