fun main() {

    println(additin(34, 20))
    println(places("my name is Ann ", "i am 20 years  old"))
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val sum = sambres(numbers)
    println(sum)

    val number = 10
    val isNumberEven = even(5)
    println("Is $number even? $isNumberEven")


}
//Write a function that takes a number and returns its factorial.

//Write a function that takes two numbers and returns their sum.
fun additin(num1:Int,num2:Int):Int{
    var sum=num1+num2
    return  sum

}

fun places(name1:String,name2:String):String{
    var namE=name1+name1
   return namE
}

//Write a function that takes an array of numbers and returns the sum of all the numbers in the array.

    fun sambres(numbers: Array<Int>):Int{
    var sum =0
        for (number in numbers) {
            sum += number
        }
    return sum
}
fun greetingPerson( name:String){
    println("Hello"+ name)

}
//Write a function that takes an array of strings and returns the concatenated string of all the elements in the array.
//fun  reny(arry:Array<String>):String {
//    var work =45
//
//}

//Write a function that takes a number and returns true if the number is even, false otherwise.
fun even(num:Int):Boolean{
    return  num %2==0

}







