package jp.techacademy.asuki.kamada.kotlinlog2

import android.util.Log

class Cat : Animal{


    constructor(name :String, age :Int) :super(name, age){

    }

    override fun say(){
        Log.d("kotlintest",this.name + "(" + this.age + "歳)" + "「にゃー」")
    }
}