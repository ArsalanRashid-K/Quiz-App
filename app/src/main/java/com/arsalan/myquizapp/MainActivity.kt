package com.arsalan.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btn_start: Button=findViewById(R.id.btn_start)
        val et_name:EditText=findViewById(R.id.et_name)

        btn_start.setOnClickListener{
//             checking if the edit text is empty or not
            if (et_name.text.toString().isEmpty()){
                Toast.makeText(this,"please eneter your name", Toast.LENGTH_SHORT).show()
            }else{
//              intent to trandfer from this page to  QuizQuestionsActivity
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)
//                finish - help in ending the task , so on back it will just go the main android screen.
                finish()

            }

        }



    }
}