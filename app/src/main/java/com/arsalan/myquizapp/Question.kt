package com.arsalan.myquizapp

data class Question(
    val id:Int,
    val Question:String,
    val Image:Int,
    val optionOne:String,
    val optionTwo:String,
    val optionThree:String,
    val optionFour:String,
    val correctAnswer:Int
)
