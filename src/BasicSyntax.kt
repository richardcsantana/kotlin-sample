/**
 * @author richardsantana
 */

fun main(args: Array<String>) {
    ctrl("sum", 2, 1)
}

fun ctrl(call: String, a: Int, b: Int) {
    var result: Any = 0
    when (call) {
        "sum" -> result = sum(a, b)
        "sub" -> result = sub(a, b)
        "mul" -> result = mul(a, b)
        "div" -> result = div(a, b)
        "pow2" -> result = pow2(a)
        "pow" -> result = pow(a, b)
    }
    println("$call: $result")
}

fun sum(a: Int, b: Int) = a + b
fun sub(a: Int, b: Int) = a - b
fun mul(a: Int, b: Int) = a * b
fun div(a: Int, b: Int): Any {
    if (b == 0) {
        return "Não é possível dividir por 0"
    }
    return a / b
}

fun pow2(a: Int): Int {
    val powValue = 2
    return pow(a, powValue)
}

fun pow(a: Int, b: Int): Int {
    var count = 1
    var result = a
    while (count < b) {
        result *= a
        count++
    }
    return result
}