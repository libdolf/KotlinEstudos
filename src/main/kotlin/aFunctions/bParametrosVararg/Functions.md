## Vararg
In Kotlin, functions can be functions within other functions.
~~~~kotlin
fun main(){
    fun sum(x: Int, y: Int): Int = x + y
    fun log(message: String){
        println("[Log]: $mesage")
    }
    log(sum(1+2).toString())
}
~~~~
vararg serves to pass an indefinite amount of arguments, respecting the previously defined type
~~~~kotlin
fun printAll(vararg messages: String){
    for (m in messages) println(m)
}
printAll("Hello", "Halo", "Salut", "Hola", "Olá")
~~~~
An example of vararg with more than one argument
~~~~kotlin
fun printAllWithPrefix(vararg messages: String, prefix: String){
    for (m in messages) println(prefix + m)
}
printAllWithPrefix(
    "Hello", "Halo", "Salut", "Hola", "Olá",
    prefix = "Greeting: "
)
~~~~
