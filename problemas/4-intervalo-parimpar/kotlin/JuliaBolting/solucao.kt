fun main() {
    println("Informe um número base para o intervalo:")
    val a = readLine()!!.toInt()
    println("Informe um número limite para o intervalo:")
    val b = readLine()!!.toInt()

    val min = if (a < b) a else b
    val max = if (a > b) a else b

    var pares = 0
    var impares = 0

    while (true) {
        println("Informe um número qualquer:")
        val num = readLine()!!.toInt()
        if (num == 0) break

        if (num in min..max) {
            if (num % 2 == 0) pares++ else impares++
        }
    }

    println("Para o intervalo $min até $max existem $pares números pares e $impares números impares")
}