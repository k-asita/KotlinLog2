package jp.techacademy.asuki.kamada.kotlinlog2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("kotlintest", "ログへの出力テスト")

//        val dog = Dog("ポチ",0)
//
//        dog.say()
//        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")
//
//        val dog2 = Dog("ハチ", 10)    // 名前をハチ、年齢10歳で、Dogインスタンスを作る
//        dog2.say()  // ハチが吠えます（ログ出力）
//        Log.d("kotlintest", "犬の名前は" + dog2.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + dog2.age + "歳です。")
//
//        val bigdog = BigDog("ヨーゼフ", 15)
//        bigdog.say()
//        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")
//
//        val cat = Cat("ぴーちゃん",10)
//        cat.say()

//        val bird = Bird("ひよこ", 12)
//        bird.say()
//        bird.move()
//

            val p1 = Human("kamadda",23,"java")
            p1.say()
            p1.think()
            val p2 = Human("asuki", 24,"kotlin")
            p2.say()
            p2.think()


////    整数型の変数をnumという名前で作成して、10を代入する。
//        var num = 10
//        Log.d("kotlintest", Integer.toString(num))
//
////    numに50を代入する
////    変数や定数に.toStirng()と記述する方法もある
//        num = 50
//        Log.d("kotlintest", num.toString())

//        val num1 = 10 + 5 - 2 * 4 / 2
//        Log.d("kotlintest" , "10 + 5 - 2 * 4 / 2 =" + num1)
//
//
//        val flag1 = true
//        val flag2 = false
//        Log.d("kotlintest", "flag1 && flag2 =" + (flag1 && flag2))
//        Log.d("kotlintest", "flag1 || flag2 =" + (flag1 || flag2))
//
//        val num2  = 10
//        val num3  = 20
//        Log.d("kotlintest" , "num2 < num3 =" + (num2 < num3))
//
//
//

//    for(i in 1 until 6){
//        Log.d("kotlintest", "for文の"+ i + "回目")
//    }
//
//        var num = 1
//
//        while(num < 6){
//            Log.d("kotlintest", "while文の" + num + "回目")
//            num++
//        }

//        for(i in 1..3){
//            Log.d("kotlintest", "...演算子の" + i + "回目")
//        }
//
//        for(i in 6 downTo 0 step 2){
//            Log.d("kotlintest", "downToの" + i + "回目")
//        }
//
//        val points = arrayOf(10, 6, 15, 23, 17)
//
//        for(i in points){
//            Log.d("kotlintest", i.toString())
//        }
//
//        Log.d("kotlintest", Integer.toString(points[0]))
//
//    for (i in points.indices){
//        Log.d("kotlintest", points[i].toString())
//    }


//        val numA = 100
//        val numB = 0
//        var ans = 0
//
//
//
//        Log.d("kotlintest", "ans = "+ ans.toString())
//
//        try{
//            ans = numA /numB
//        } catch (e : Exception){
//            Log.d("kotlintest", "0で割ろうとしました")
//
//            Log.d("kotlintest", e.message.toString())
//        } finally{
//            Log.d("kotlintest", "ans = " + ans.toString())
//        }
//        total(50, 1000)
//
//        total(1, 1111)
//        val t = total(50, 1000)
//        Log.d("kotlintest", t.toString())
//
//    }
//        private fun total(first: Int, last: Int) : Int{
//            var sum = 0
//            for (i in first..last){
//                sum += i
//            }
//            return sum

//        Log.d("kotlintest", sum.toString())


        val str1 = "Hello"
        val str2 = "World"
        val str3 = "Hello"

        if(str1.equals(str2)){
            Log.d("kotlintest", "str1とstr2は一緒です")
        } else {
            Log.d("kotlintest", "str1とstr2は異なります")
        }

        if(str1.equals(str3)){
            Log.d("kotlintest", "str1とstr3は一緒です")
        } else {
            Log.d("kotlintest", "str1とstr3は異なります")
        }

        val i = 100
        val str = i.toString() + " * 100 = ${ i * 100}"
        Log.d("kotlintest", str)

        




        }

}
