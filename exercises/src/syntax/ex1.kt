package exercises

fun transformar(s: String,
                op: (String) -> String): String {
    return op(s)
}

fun main() {

    val str = "hello"

    val maiusculo = {s: String -> s.uppercase()}

    val res1 = transformar(str, maiusculo)
    println(res1)

    val res2 = transformar(str) {
        s -> s[0].toString()
    }
    println(res2)

}
