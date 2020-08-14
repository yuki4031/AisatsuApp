package jp.techacademy.yuuki.kawashima.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if(v.id == R.id.button1){
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog(){
        val timePickerDialog = TimePickerDialog(
            this,TimePickerDialog.OnTimeSetListener{view,hour,minite ->
               if (hour in 0 until 2){
                   textView.text = "こんばんは"
               }
               if (hour in 2 until 10){
                   textView.text = "おはよう"
               }
               if(hour in 10 until 18){
                   textView.text = "こんにちは"
               }
               if(hour in 18 until 24){
                textView.text = "こんばんは"
            }
            },
            13,0,true)
        timePickerDialog.show()
    }
}
