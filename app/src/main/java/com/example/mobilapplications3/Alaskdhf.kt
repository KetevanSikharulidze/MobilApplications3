package com.example.mobilapplications3


open class Parent( private val name: String,
              protected val age: Int,
              public val alive: Boolean) {
    open fun details(){
        println("$name, \n$age,\nalive: $alive")
    }
}
class Child(name: String,age: Int,alive: Boolean,val isStudent: Boolean):
    Parent(name, age, alive){
    override fun details(){
        super.details()
        println("is student: $isStudent")
    }
}
fun main(){
    var p1 = Parent("Mishka", 19, true)
    p1.details()
    var c1 = Child("mariami",1, true, false)
    c1.details()
}