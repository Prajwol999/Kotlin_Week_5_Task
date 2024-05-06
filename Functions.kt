package com.example.myandroid34

import kotlin.random.Random

//fun main() {
//    var a:Int = 5
//    var b:Int = 5
//
//    println("a == b:" + (a == b))
//    println("a != b:"+ (a != b))
//    println("a < b:"+ (a < b))
//    println("a > b:"+ (a > b))
//    println("a >= b:"+ (a >= b))
//    println("a <= b:"+ (a <=b))
//
//    var number1:Int = 5
//    var number2:Int = 8
//    var number3:Int = 12
//    var result:Boolean = false;
////    conditional operator
//    result = (number1 > number2) && (number3>number2)
//    println(result)
//
//    result = (number1 > number2) || (number3 > number2)
//    println(result)

//    BODMAS
//    var result:Int = 5+2*4
//    println("Result =" +result)
//    result = (5+2) * 4
//    println("Result =" +result)
//    var x:Int = 8;
//    var y:Int = 4;
//    var z:Int = 2;
//    var sum:Int = 0;
//    sum = x + --y + --z
//    println("x+ --y + --z ::: $sum")

//    var number = Random.nextInt(0,10)
//    println("please enter any number from 0 to 100000: - ")
//    while (2>1){
//        var userGuess:Int = readln()!!.toInt()
//        if (userGuess == number){
//            println("Huraayyyy!!!! , you won")
//            break
//        }else if(userGuess<number){
//            println("Increase your guess")
//        }else{
//            println("Decrease your guess")
//        }


//    println("Enter first number:")
//    var a:Int = readln()!!.toInt();
//    println("Enter second number:")
//    var b:Int = readln()!!.toInt();
//    show(a,b)
//    var sum = add(a,b)
//    println("sum of two entered number is $sum")
//    var minimum = findMinimumNumber(a,b)
//    println("And the smallest number $a and $b is $minimum")
//
//    fun show(a: Int, b: Int): Unit {
//        println("You entered $a and $b")
//    }
//
//    fun add(a: Int, b: Int): Int {
//        var sum = 0
//        sum = a + b
//        return sum
//    }
//
//    fun findMinimumNumber(a: Int, b: Int): Int {
//        var minimum = 0
//        if (a > b) {
//            minimum = b
//        } else {
//            minimum = a
//        }
//        return minimum
//    }

//fun main() {
//    println("Enter first number:")
//    var a:Int = readln()!!.toInt();
//    println("Enter second number")
//    var b:Int = readln()!!.toInt();
//    show(a,b)
//    var sum = add(a,b)
//    println("sum of the two entered number is $sum")
//    var minimum = findMinimumNumber(a,b)
//
//
//}
//fun show(a:Int,b:Int):Unit{
//    println("you entered $a and $b")
//
//}
//fun add(a:Int ,b:Int):Int{
//    var sum =0
//    sum = a+b
//    return  sum
//}
//fun findMinimumNumber(a:Int,b:Int):Int{
//    var minimum =0
//    if(a>b){
//        minimum = b
//    }else{
//        minimum = a
//    }
//    return  minimum
//}

//control flow statements
fun main() {
//    odd even
//    print("Please enter a number: ")
//
//    val number: Int = readln()!!.toIntOrNull() ?: 0
//    if (number % 2 == 0) {
//        println("$number is even")
//    } else {
//        println("$number is odd")
//    }
//
//    print("please enter our age:::")
//    var yourAge:Int = readln()!!.toInt()
//    if(yourAge<13){
//        print("you are a child")
//    }else if(yourAge<19){
//        print("you are a teenager")
//    }else{
//        if(yourAge<50){
//            print("you are an adult")
//        }else{
//            print("you are a senior")
//        }
//    }

//    print("Please enter a day number of the week (1-7): ")
//
//    val dayNumber = readln()!!.toIntOrNull() ?: -1 // Handle invalid input
//
//    val day = when (dayNumber) {
//        1 -> "Sunday"
//        2 -> "Monday"
//        3 -> "Tuesday"
//        4 -> "Wednesday"
//        5 -> "Thursday"
//        6 -> "Friday"
//        7 -> "Saturday"
//        else -> "Invalid day number (Please enter a number between 1 and 7)"
//    }
//
//    println(day)

//    for loop
//    for (i in 1..9) {
//        println(i)
//    }
//
//    // Calculate the sum of even numbers between 0 and 10 (inclusive)
//    var sum = 0
//    for (x in 0..10) {  // Use 0..10 to include 10
//        if (x % 2 == 0) {
//            sum += x
//        }
//    }
//
//    // Print the sum of even numbers
//    println("The sum of even numbers is $sum")

//    var vehicle = arrayListOf<String>("Tata","kia","Hyundai","MG")
//    for(y in vehicle.indices){
//        println("The value of $y index is -"+vehicle[y])
//    }

//    for each loop
//    var vehicle = arrayListOf<String>("Tata","kia","Hyundai","MG")
//    vehicle.forEach{
//        println(it)
//    }
//    while loop
    var i:Int =0
    while(i<5){
        println(i)
        i++
    }

//    factorial
    var k = 1
    var fact = 1
    while(k<=6){
        fact*=k
        println("$k! = $fact")
        k++
    }

//    do-while loop
    var number = 1
    do{
        println(number)
        number++
    }while (number<=15)



}




