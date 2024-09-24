fun main() {

    val str = ToPal("доход")
    MyNum(str).toPal()

}

interface Pal{
    fun toPal()
}

class ToPal(val str: String): Pal{
    override fun toPal() {
        if (str == str.reversed()){
            println("Строка палиндром")
        } else{
            println("Строка не палиндром")
        }
    }
}

class MyNum(str: Pal):Pal by str