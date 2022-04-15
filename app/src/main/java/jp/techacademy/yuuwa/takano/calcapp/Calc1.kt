package jp.techacademy.yuuwa.takano.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calc1.*

class Calc1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc1)


        var value1 = intent.getFloatExtra("VALUE1", 0.toFloat())
        //var err = intent.getFloatExtra("VALUE2", 0.toFloat())

            kekka.text="$value1"

    }
    }
