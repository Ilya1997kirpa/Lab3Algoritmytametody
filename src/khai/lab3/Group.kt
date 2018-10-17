package khai.lab3

object Group:Bad {
    override       fun send_down(X: Int) {
        if (X in 90..100) {
            println("Отлично - $X баллов")
        } else if (X in 75..89) {
            println("Хорошо - $X баллов")
        } else if (X in 60..74) {
            println("Удовлетворительно - $X баллов")
        } else {
            println("При 3 попытках сдачи на балы ниже 60 следует отчисление - $X баллов")
        }
    }
}
