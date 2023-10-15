package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizapp.databinding.ActivityHscBinding
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val option1 = binding.num1
        val option2 = binding.num2
        val option3 = binding.num3
        val button = binding.button
        var score = 0
        var score2 = 0
        var score3 = 0

        option1.setOnClickListener{
            var value = 0
            value++
            score = value
        }

        option2.setOnClickListener{
            var value = 0
            value++
            score2 = value
        }

        option3.setOnClickListener{
            var value = 0
            value++
            score3 = value
        }

        button.setOnClickListener{
            if (score > 0){
                val intent = Intent(this@MainActivity,HSC::class.java)
                startActivity(intent)
                score = 0
            }
            else if (score2 > 0){
                val intent = Intent(this@MainActivity,SSC::class.java)
                startActivity(intent)
                score2 = 0
            }
            else if (score3 > 0){
                val intent = Intent(this@MainActivity,JSC::class.java)
                startActivity(intent)
                score3 = 0
            }
            else{
                val toast = Toast.makeText(this, "Please Select any option", Toast.LENGTH_SHORT)
                toast.show()
            }
        }
    }
}