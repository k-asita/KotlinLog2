package jp.techacademy.asuki.kamada.kotlinlog2

import android.util.Log
import java.util.*


open class Dog {

    var name: String
    var age: Int

    constructor(name :String, age :Int){
        this.name = name
        this.age = age
    }

    open fun say(){
        Log.d("kotlintest",this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}