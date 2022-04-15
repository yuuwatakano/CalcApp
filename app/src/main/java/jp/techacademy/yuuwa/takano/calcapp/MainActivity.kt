package jp.techacademy.yuuwa.takano.calcapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.text.TextUtils
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_calc1.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tasu : Button = findViewById(R.id.tasu)
        tasu.setOnClickListener(this)

        val hiku : Button = findViewById(R.id.hiku)
        hiku.setOnClickListener(this)

        val kake : Button = findViewById(R.id.kake)
        kake.setOnClickListener(this)

        val wari : Button = findViewById(R.id.wari)
        wari.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        val intent = Intent(this, Calc1::class.java)

        if(first.length() != 0 && second.length() != 0) {
            val f = findViewById<EditText>(R.id.first)
            val num1 = f?.text.toString()
            val num3 = num1.toFloat()
            val s = findViewById<EditText>(R.id.second)
            val num2 = s?.text.toString()
            val num4 = num2.toFloat()
            var num5: Float = 0.0.toFloat()
            when (v.id) {
                R.id.tasu -> num5 = num3 + num4
                R.id.hiku -> num5 = num3 - num4
                R.id.kake -> num5 = num3 * num4
                R.id.wari -> num5 = num3 + num4
            }
            intent.putExtra("VALUE1", num5)
            startActivity(intent)
        }
    }
}