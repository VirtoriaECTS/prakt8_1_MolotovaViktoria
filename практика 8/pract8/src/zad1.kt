class Books constructor(var name: String, var avtor: String, var year:Int, var pages: Int){
    fun prescription(){
        println("Книга вышла ${2023 - year} года/лет назад")
    }

    fun info(){
        println("Название книги: $name\nАвтор: $avtor\nГод выпуска $year\nКоличесвто страниц: $pages")
    }

    fun info_pages(){
        if((pages > 0) && (pages < 100)) println("Книга маленького размера")
        else if((pages > 110) && (pages < 200)) println("Книга небольшого размера")
        else if((pages > 200) && (pages < 400)) println("Книга среднего размера")
        else if((pages > 400) && (pages < 1000)) println("Книга большого размера")
        else println("Книга огромного размера")
    }
}