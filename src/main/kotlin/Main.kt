import java.util.*

fun main(args: Array<String>) {
    //21
    println("My name is ${args[0]} and I'm ${args[1]}")

    println("What is your name? ")
    val name=readLine();
    println("What is your job? ")
    val job= readLine();

    println("Your name is ${name} and you're ${job}")

    println("Insert a number ")
    val numer= readLine()
    val number=Integer.parseInt(numer)
    val otherNumber=number+10
    println(otherNumber)

    val scanner=Scanner(System.`in`)
    println("Insert a new number ")
    val newNumber=scanner.nextInt();
    val prod=newNumber*20
    println(prod)

}