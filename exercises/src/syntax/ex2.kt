package exercises

fun transformar(s: String?,
                op: (String) -> String): String {
    return op(s?: "x")
}

fun main() {

    val str: String? = null

    val res2 = transformar(str) {
            s -> s[0].toString()
    }
    println(res2)

}
