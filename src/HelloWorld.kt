/**
 * Created by marcinlimanski on 08/06/2017.
 */

import java.util.Random

fun unmutableVaribles(): Unit {
    /*Unmutable varibles*/
    val marcin_name = "marcin"
    println("Unmutable value: " + marcin_name)
}

fun mutableVaribles(): Unit {
    /*Kotlin uses "type inference", it know what the type of the varible*/
    var marcin_age = 25
    println("Mutable value: "+marcin_age)
}

fun castingToSomthing(): Unit {
    println("Casting dobble 3.54 to int: " + (3.54.toInt()))
    println("Casting Char to Int " + 'A'.toInt())
    println("Casting Int to Car: ${69.toChar()}")
}

fun kotlinStrings(): Unit {
    /*String is just a '' chain of char*/
    val name = "marcin"
    var surname: String = "limanski"
    val country_of_birth = "Polska, mikolow"
    println("Is $name equal to $surname: ${surname.equals(name)}")
    println("Length of $name is: ${name.length}")
    println("Does $country_of_birth conatin mikolow: ${country_of_birth.contains("mikolow")}")
    println("Substring of limanski: ${surname.substring(2,8)}")

}

fun kotlinArrays(): Unit {
    /*Array is a collection of objects*/
    var my_array = arrayOf("two", 2, 3.4)

    println("myArray size: ${my_array.size}")
    println("myArray at index 2: ${my_array[2]}")
    println("Does myArray contain 2: ${my_array.contains("two")}")

    /*copy part of array*/
    var new_array = my_array.copyOfRange(0,1)
    println("new_array element at 1: ${new_array.first()}")

    /**/
    var sq_array = Array(5, {x -> x * x})
    println("sqArrat at possiton 3:  ${sq_array[3]}")

    /*Specific type array*/
    //var int_array: Array<Int> = arrayOf(3,56,6)

}

fun kotlinRanges(): Unit {
    val one_2_ten = 1..10
    println("one_2_ten at pos 5: ${one_2_ten.elementAt(4)}")

    val alpha = "A".."Z"
    println("Is U in alpah: ${"US" in alpha}")

    val ten_2_one = 10.downTo(1)
    println("ten_2_one at pos 4: ${ten_2_one.elementAt(0)}")

    for (x in ten_2_one) println("ten_2_one: $x ")
}

fun kotlinConditionals(): Unit {
    val age = 25

    when (age) {
        2,4,25 -> println("He is: $age")
        in 0..20 -> {
            println("$age is in a range")
        }
        //else -> "no match"
    }
}

fun kotlinLooping(): Unit {
    for (x in 1..10) {
        println("Looping  $x")
    }

    /*Using Java package we can generate random numbers*/
    val random_generator = Random()
    val random_number = random_generator.nextInt(10) + 1

    /*Using while loop*/
    var finate_state = 0;

    while (finate_state != random_number) {
        finate_state += 1
    }

    println("Finate state is: $finate_state")
}

fun kotlinFunctions(name: String = "not set", age: Int = 0): Unit {
    println("Name is $name age is $age")
}

fun kotlinInlineFunctions(): Unit {
    fun add(numOne: Int, numTwo: Int) : Int = numOne + numTwo
    println("add machine: ${add(3,4)}")

    /*void return function*/
    fun printMessage(message: String) : Unit = println(message)
    printMessage("Hello Kotlin")

    /*Returning two values*/
    fun numbers(num: Int) : Pair<Int, String> = Pair(num, " two")
    val (valOne, valTwo) = numbers(4)
    println("$valOne, $valTwo")
}

fun toJSON(collection: Array<Any>): String {
    val sb = StringBuilder()
    sb.append("[")
    val iterator = collection.iterator()
    while (iterator.hasNext())
    {
        val element = iterator.next()
        sb.append(element)
        if (iterator.hasNext())
        {
            sb.append(", ")
        }
    }
    sb.append("]")
    return sb.toString()
}

fun main(args: Array<String>) {
    println("hello world")
    unmutableVaribles()
    mutableVaribles()
    castingToSomthing()
    kotlinStrings()
    kotlinArrays()
    kotlinRanges()
    kotlinConditionals()
    kotlinLooping()
    kotlinFunctions(name = "marcin", age = 25)
    kotlinInlineFunctions()
}