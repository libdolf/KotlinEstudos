package aFunctions.bParametrosVararg

fun main(){
    fun printAll(vararg messages: String){
        for (m in messages) println(m)
    }
    fun printAllWithPrefix(vararg messages: String, prefix: String){
        for (m in messages) println(prefix + m)
    }

    fun log(vararg entries: String){
        printAll(*entries)
    }

    printAll("Hello", "Halo", "Salut", "Hola", "Olá")
    printAllWithPrefix(
        "Hello", "Halo", "Salut", "Hola", "Olá",
        prefix = "Greeting: "
    )

}