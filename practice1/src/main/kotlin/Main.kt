fun main(args: Array<String>)
{
    // Задание №1
    val exercises: Int = 13
    var exercisesSolved: Int = 0

    // Задание №2
    val myAge: Int =  18

    // Задание №3
    var myyAge: Double = 18.0
    var PersonAge: Double = 30.0
    myyAge =(myAge + PersonAge) / 2
    println("Новое значение возвраста: $myyAge")

    // Задание №4
    val testNumber = 35
    val evenOdd = testNumber % 2
    println("Значение evenOdd: $evenOdd")
    //% делит константу на 2, оставляя остаток 1

    // Задание №5
    var answer = 0
        answer += 1
        answer += 10
        answer *= 10
        answer = answer shr 3
        println("Конечный результат: $answer")

    // Задание №6
    val aage: Int = 18
    println(aage)
    val age: Int = 30
    println(age)
    // Переменная не изменяется, поэтому её можно объявить как val

    // Задание №7
    val a: Int = 5
    val b: Int = 7
    //1
        val answer1: Int = (a * 100) + b
        println("=$answer1")
    //2
        val answer2: Int = (a * 100) + (b * 100)
        println("=$answer2")
    //3
        val answer3: Int = (a * 100) + (b / 10)
        println("=$answer3")

        // Задание №8
    var example: Int = (5 * 3 )- (4 / 2) * 2
    println(example)

        // Задание №9
    val x: Double = 5.7
    val z: Double = 8.1
    val average: Double = (x + z) / 2
    println("Среднее арифметическое x и z: $average")

        // Задание №10
    val fahrenheit: Double = 77.0
    val celsius: Double = (fahrenheit - 32) / 1.8
    println("температура в градусах цельсия: $celsius")


}