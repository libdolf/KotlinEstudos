package aFunctions.aValoresDeParamentroPadraoEArgumentosNomeados
fun printMessage(message: String): Unit{
    println(message)
}
fun printMessageWithPrefix(message: String, prefix: String = "Info"){
    println("[$prefix] $message")
}
fun sum(x: Int, y: Int): Int{
    return x + y
}
fun multiply(x: Int, y: Int) = x * y

fun main(){
    printMessage("Hello World!")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 9))
    println(multiply(5,2))
}