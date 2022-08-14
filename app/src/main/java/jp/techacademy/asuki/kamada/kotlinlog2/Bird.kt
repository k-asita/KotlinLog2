package jp.techacademy.asuki.kamada.kotlinlog2

import android.util.Log

class Bird: Animal, Movable {

    constructor(name: String, age: Int): super(name, age){

    }

    override fun say(){
        Log.d("kotlintest",this.name + "(" + this.age + "歳)" + "ぴよぴよ")
    }

    override fun move(){
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }

}