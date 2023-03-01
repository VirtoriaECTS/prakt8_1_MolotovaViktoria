package pgor
import java.util.*

class Tovar constructor(var name: String, var price: Int, var unit:String, var view: String, var count: Int){
    fun info(){
        println("Название товара: $name\nЦена: $price\nЕдиница измерения: $unit\nВид товара: $view\nКоличество: $count")
    }

    fun all(){
        println("Покупка выйдет в ${price * count} рублей")
    }

    fun deliviry(){
        println("Доставка товара будет состовлять ${Random().nextInt((20 - 1) + 1)} дней")
    }
}