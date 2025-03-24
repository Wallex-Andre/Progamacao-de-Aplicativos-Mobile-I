package org.example

fun main(args: Array<String>) {
    println("***ESTRUTURA DE DECISÃO***")
    println()
    println("Exercício 1")
    println()
    ex1()
    println()
    println("Exercício 2")
    println()
    ex2()
    println()
    println("Exercício 3")
    println()
    ex3()
    println()
    println("***ESTRUTURA DE REPETIÇÃO***")
    println()
    println("Exercício 4")
    println()
    ex4()
    println()
    println("Exercício 5")
    println()
    ex5()
    println()
    println("Exercício 6")
    println()
    ex6()
    println()
    println("***ORIENTAÇÃO A OBJETOS***")
    println()
    println("Exercício 7")
    println()
    ex7()
    println()
    println("Exercício 8")
    println()
    ex8()
    println()
    println("Exercício 9")
    println()
    ex9()
    println()
    println("Exercício 10")
    println()
    ex10()
}


fun ex1() {
    println("Digite o nome do convidado:")
    val nome = readLine()

    if(nome == "Wallex"){
        println("Entrada concedida")
    }
    else {
        println("Entrada negada")
    }
}

fun ex2() {
    println("Digite a idade do convidado:")

    val a = try {
        readLine()!!.toInt()
    } catch (e: Exception) {
        println("Entrada inválida! Digite um número inteiro.")
        return ex2()
    }

    when {
        a >= 18 -> println("Maior de idade, entrada permitida")
        else -> println("Menor de idade, entrada não permitida")
    }
}

fun ex3() {
    val a = 1
    println()
    for (n in 1..10) {
        val r = a * n
        println("$a x $n = $r")
    }
}

fun ex4() {
    val arrayInt:Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Array: ${arrayInt.joinToString(", ")}")
}

fun ex5() {
    val arrayInt:Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val array6 = arrayInt[6]
    println("Sexto elemento do array: "+array6)
}

fun ex6() {

    var a = 1
    var n = 1
    var r = 0

    while (n <= 10) {
        r = a * n
        println("$a x $n = $r")
        n++
    }
}

fun ex7() {
    val a = 2
    val b = 4

    val soma = a + b

    println("$a + $b = $soma")
}

fun ex8() {
    val a = 4
    val b = 2

    val subtracao = a - b

    println("$a - $b = $subtracao")
}

fun ex9() {
    val a = 2
    val b = 4

    val multiplicacao = a * b

    println("$a x $b = $multiplicacao")
}

fun ex10() {
    val a = 4
    val b = 2

    val divisao = a / b

    println("$a ÷ $b = $divisao")
}