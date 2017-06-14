/**
 * @author richardsantana
 */

fun main(args: Array<String>) {
    val instance = Customer("teste", "email@teste.com")
    println("$instance")
}

data class Customer(val name: String, val email: String)
