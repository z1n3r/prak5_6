fun main(){
    print("Введите двузначное число:")
    var x= readLine()!!.toInt()
    when{
        (x%10 == 3 || x%10 == 6 ||x%10 ==9  )-> println("Верно")
        else -> println("3,6,9 не обнаружено")
    }

}