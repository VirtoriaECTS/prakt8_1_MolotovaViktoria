import pgor.Tovar
import java.lang.NumberFormatException

fun main(){
    //Клас книг
    println("Какой класс вам нужен? Нажмите 1 - класс книги, нажмите 2 - класс товар")
    val number = readLine()!!.toString()
    if(number == "1"){
    println("Введите название книги")
    val name = readLine()!!.toString()
    if (name == "") println("Необходимо ввести название книги")
    else {
        println("Введите автора книги")
        val avtor = readLine()!!.toString()
        if (avtor == "") println("Необходимо ввести автора книги")
        else{
            try {
                println("Введите год выпуска")
                val year = readLine()!!.toInt()
                if (year < 868) println("В такое время еще не было книг'")
                else if(year >= 2023) println("Сейчас 2023 год. Книга еще не может быть выпущена")
                else{
                    println("Введите количество страниц")
                    val pages = readLine()!!.toInt()
                    if (pages <= 0) println("Количесвто страниу в книге не может быть меньше или равно нулю'")
                    else{
                        val book: Books = Books(name, avtor, year, pages)
                        book.prescription()
                        book.info()
                        book.info_pages()

                    }
                }

            }
            catch (e: NumberFormatException) {
                println("Необходимо ввести число")
            }
        }
    }
    }
    else if(number == "2") {

        //Клас товар
        println("Введите название товара")
        val namet = readLine()!!.toString()
        if (namet == "") println("Необходимо ввести название товара")
        else {
            println("Введитe вид товара")
            val view = readLine()!!.toString()
            if (view == "") println("Необходимо ввести вид товара")
            else {
                println("Введите единицу измерения")
                val unit = readLine()!!.toString()
                if (unit == "") println("Необходимо ввести единицу измерения")
                else {
                    try {
                        println("Введите цену")
                        val price = readLine()!!.toInt()
                        if (price <= 0) println("Цена не может быть меньше или равна нулю'")
                        else {
                            println("Введите количество покупаемого товара")
                            val count = readLine()!!.toInt()
                            if (count <= 0) println("Количесвт покупаемого товара не может быть быть меньше или равна нулю'")
                            else {
                                val tov: Tovar = Tovar(namet, price, unit, view, count)
                                tov.info()
                                tov.all()
                                tov.deliviry()
                            }
                        }
                    } catch (e: NumberFormatException) {
                        println("Необходимо ввести число")
                    }
                }

            }
        }
    }
    else println("Такого класса нет")
}