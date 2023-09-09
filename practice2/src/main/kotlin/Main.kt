fun main(args: Array<String>)
{
        //задание 1
    val age1 = 42
    val age2: Int = 21
        //задание 2
    val avg1 = (age1 + age2) / 2
    println("среднее ариф.: $avg1")
        //задание 4
    val firstName = "Екатерина"
    val lastName =" Овчаренко"
        //задание 5
    val fullName: String
    fullName = "$firstName" + "$lastName"
    println(fullName)
        //задание 6
    val myDetails: String
    myDetails = "Привет, меня зовут " + "$fullName"
    println(myDetails)
        //задание 7
    val Triple = Triple(6,5,2005)
    val x1 = Triple.first
    val x2 = Triple.second
    val x3 = Triple.third
    println("Дата рождения: ${Triple.first} , ${Triple.second} , ${Triple.third}")
        //задание 8
    val (month, day, year) = Triple
    println("month: $month")
    println("day: $day")
    println("year: $year")
        //задание 9
    val (месяц, год) = Pair (6, 2005)
    println("Месяц и год: $месяц, $год")
        //задание 10

}