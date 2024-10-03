package com.example.mobilapplications3

class Fraction():Any() {
    var numerator: Double = 0.0
    var denominator: Double = 0.0

    override fun equals(other: Any?): Boolean {
        if (other is Fraction){
            if(numerator == other.numerator*denominator/other.denominator){
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator/$denominator"

    }
}
fun mine(x: Int,y : Int): String{
        return "x + y = ${x + y}"
    }

fun main(){
    val p1 = Fraction()
    p1.numerator = 3.0
    p1.denominator = 4.0
    println(p1)
    val p2 = Fraction()
    p2.numerator = 3.0
    p2.denominator = 4.0
    println(p1 == p2)
    p1 == p2
    println(mine(2, 3))
}