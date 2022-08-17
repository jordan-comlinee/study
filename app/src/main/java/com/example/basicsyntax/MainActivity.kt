package com.example.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("BasicSyntax", "로그를 출력합니다. method = Log.d")


        var myName = "홍길동"

        var myAge: Int
        myAge = 23

        myAge = myAge + 1
        Log.d("BasicSyntax", "myName = $myName, myAge = $myAge")

        val name = "이소영"

        var ball = 4

        if(ball > 3) {
            Log.d("BasicSyntax", "4볼로 출루합니다.")
        }
        else {
            Log.d("BasicSyntax", "타석에서 다음 타구를 기다립니다.")
        }

        var a = 5
        var b = 3
        var bigger = if (a > b) a else b

        var now = 10
        when (now) {
            8 -> {
                Log.d("when", "현재 시간은 8시 입니다.")
            }
            9 -> {
                Log.d("when", "현재 시간은 9시 입니다.")
            }
            else -> {
                Log.d("when", "현재 시간은 9시가 아닙니다.")
            }
        }



        var set = mutableSetOf<String>()
        set.add("JAN")
        set.add("FEB")
        set.add("MAR")
        set.add("JAN")

        Log.d("Collection", "Set 전체 출력 = ${set}")

        set.remove("FEB")
        Log.d("Collection", "Set 전체 출력 = ${set}")
    }


}