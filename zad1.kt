fun main() {

    println("Введите первое число:")
    var num1= readLine()!!.toInt();
    println("Введите второе число:")
    var num2= readLine()!!.toInt();
    var res:Int

    when(num1>num2)
    {
        (num1==num2)-> {
            res=num1*num1*num1
            println(res) }
        (num1>num2)-> {
            res=num1+1
            println(res) }
        (num1>num2)-> {
            res=num2+1
            println(res) }
        else -> println("Ошибка")




    }























}
