package com.vraj67207.quiz_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvName:TextView= findViewById(R.id.tv_name)
        val tvScore:TextView = findViewById(R.id.tv_score)
        val btnFinish: TextView = findViewById(R.id.btn_Finish)
        val score = intent.getStringExtra("Answer")
        val userName = intent.getStringExtra("USER_NAME")
        val total = intent.getStringExtra("TotalQ")
        tvName.setText(userName)
        Log.e("Score",score.toString())
        Log.e("Score",total.toString())
        tvScore.text = "Your Score is "+score+" out of "+total
        btnFinish.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}