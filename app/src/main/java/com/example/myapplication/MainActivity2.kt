package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.logging.Logger.global

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val radioGroup1 = findViewById<RadioGroup>(R.id.radioGroup1)
        val radioGroup2 = findViewById<RadioGroup>(R.id.radioGroup2)
        val radioGroup3 = findViewById<RadioGroup>(R.id.radioGroup3)
        val radioGroup4 = findViewById<RadioGroup>(R.id.radioGroup4)
        val radioGroup5 = findViewById<RadioGroup>(R.id.radioGroup5)
        val radioGroup6 = findViewById<RadioGroup>(R.id.radioGroup6)
        val radioGroup7 = findViewById<RadioGroup>(R.id.radioGroup7)
        val radioGroup8 = findViewById<RadioGroup>(R.id.radioGroup8)
        val radioGroup9 = findViewById<RadioGroup>(R.id.radioGroup9)
        val radioGroup10 = findViewById<RadioGroup>(R.id.radioGroup10)
        val radioGroup11 = findViewById<RadioGroup>(R.id.radioGroup11)
        val radioGroup12 = findViewById<RadioGroup>(R.id.radioGroup12)

        val rbt1 = findViewById<RadioButton>(R.id.rbt1)
        val rbt2 = findViewById<RadioButton>(R.id.rbt2)
        val rbt3 = findViewById<RadioButton>(R.id.rbt3)
        val rbt4 = findViewById<RadioButton>(R.id.rbt4)
        val rbt5 = findViewById<RadioButton>(R.id.rbt5)
        val rbt6 = findViewById<RadioButton>(R.id.rbt6)
        val rbt7 = findViewById<RadioButton>(R.id.rbt7)
        val rbt8 = findViewById<RadioButton>(R.id.rbt8)
        val rbt9 = findViewById<RadioButton>(R.id.rbt9)
        val rbt10 = findViewById<RadioButton>(R.id.rbt10)
        val rbt11 = findViewById<RadioButton>(R.id.rbt11)
        val rbt12 = findViewById<RadioButton>(R.id.rbt12)
        val rbt13 = findViewById<RadioButton>(R.id.rbt13)
        val rbt14 = findViewById<RadioButton>(R.id.rbt14)
        val rbt15 = findViewById<RadioButton>(R.id.rbt15)
        val rbt16 = findViewById<RadioButton>(R.id.rbt16)
        val rbt17 = findViewById<RadioButton>(R.id.rbt17)
        val rbt18 = findViewById<RadioButton>(R.id.rbt18)
        val rbt19 = findViewById<RadioButton>(R.id.rbt19)
        val rbt20 = findViewById<RadioButton>(R.id.rbt20)
        val rbt21 = findViewById<RadioButton>(R.id.rbt21)
        val rbt22 = findViewById<RadioButton>(R.id.rbt22)
        val rbt23 = findViewById<RadioButton>(R.id.rbt23)
        val rbt24 = findViewById<RadioButton>(R.id.rbt24)
        val rbt25 = findViewById<RadioButton>(R.id.rbt25)
        val rbt26 = findViewById<RadioButton>(R.id.rbt26)
        val rbt27 = findViewById<RadioButton>(R.id.rbt27)
        val rbt28 = findViewById<RadioButton>(R.id.rbt28)
        val rbt29 = findViewById<RadioButton>(R.id.rbt29)
        val rbt30 = findViewById<RadioButton>(R.id.rbt30)
        val rbt31 = findViewById<RadioButton>(R.id.rbt31)
        val rbt32 = findViewById<RadioButton>(R.id.rbt32)
        val rbt33 = findViewById<RadioButton>(R.id.rbt33)
        val rbt34 = findViewById<RadioButton>(R.id.rbt34)
        val rbt35 = findViewById<RadioButton>(R.id.rbt35)
        val rbt36 = findViewById<RadioButton>(R.id.rbt36)
        val rbt37 = findViewById<RadioButton>(R.id.rbt37)
        val rbt38 = findViewById<RadioButton>(R.id.rbt38)
        val rbt39 = findViewById<RadioButton>(R.id.rbt39)
        val rbt40 = findViewById<RadioButton>(R.id.rbt40)
        val rbt41 = findViewById<RadioButton>(R.id.rbt41)
        val rbt42 = findViewById<RadioButton>(R.id.rbt42)
        val rbt43 = findViewById<RadioButton>(R.id.rbt43)
        val rbt44 = findViewById<RadioButton>(R.id.rbt44)
        val rbt45 = findViewById<RadioButton>(R.id.rbt45)
        val rbt46 = findViewById<RadioButton>(R.id.rbt46)
        val rbt47 = findViewById<RadioButton>(R.id.rbt47)
        val rbt48 = findViewById<RadioButton>(R.id.rbt48)

        var score = 0

        findViewById<Button>(R.id.btn_send).setOnClickListener {
            if ((rbt1.isChecked || rbt2.isChecked || rbt3.isChecked || rbt4.isChecked)
                && (rbt5.isChecked || rbt6.isChecked || rbt7.isChecked || rbt8.isChecked)
                && (rbt9.isChecked || rbt10.isChecked || rbt11.isChecked || rbt12.isChecked)
                && (rbt13.isChecked || rbt14.isChecked || rbt15.isChecked || rbt16.isChecked)
                && (rbt17.isChecked || rbt18.isChecked || rbt19.isChecked || rbt20.isChecked)
                && (rbt21.isChecked || rbt22.isChecked || rbt23.isChecked || rbt24.isChecked)
                && (rbt25.isChecked || rbt26.isChecked || rbt27.isChecked || rbt28.isChecked)
                && (rbt29.isChecked || rbt30.isChecked || rbt31.isChecked || rbt32.isChecked)
                && (rbt33.isChecked || rbt34.isChecked || rbt35.isChecked || rbt36.isChecked)
                && (rbt37.isChecked || rbt38.isChecked || rbt39.isChecked || rbt40.isChecked)
                && (rbt41.isChecked || rbt42.isChecked || rbt43.isChecked || rbt44.isChecked)
                && (rbt45.isChecked || rbt46.isChecked || rbt47.isChecked || rbt48.isChecked)
            ) {
                if (rbt1.isChecked) score += 3
                if (rbt5.isChecked) score += 3
                if (rbt9.isChecked) score += 3
                if (rbt13.isChecked) score += 3
                if (rbt17.isChecked) score += 3
                if (rbt21.isChecked) score += 3
                if (rbt25.isChecked) score += 3
                if (rbt29.isChecked) score += 3
                if (rbt36.isChecked) score += 3
                if (rbt40.isChecked) score += 3
                if (rbt44.isChecked) score += 3
                if (rbt48.isChecked) score += 3

                if (rbt2.isChecked) score += 2
                if (rbt6.isChecked) score += 2
                if (rbt10.isChecked) score += 2
                if (rbt14.isChecked) score += 2
                if (rbt18.isChecked) score += 2
                if (rbt22.isChecked) score += 2
                if (rbt26.isChecked) score += 2
                if (rbt30.isChecked) score += 2
                if (rbt35.isChecked) score += 2
                if (rbt39.isChecked) score += 2
                if (rbt43.isChecked) score += 2
                if (rbt47.isChecked) score += 2

                if (rbt3.isChecked) score += 1
                if (rbt7.isChecked) score += 1
                if (rbt11.isChecked) score += 1
                if (rbt15.isChecked) score += 1
                if (rbt19.isChecked) score += 1
                if (rbt23.isChecked) score += 1
                if (rbt27.isChecked) score += 1
                if (rbt31.isChecked) score += 1
                if (rbt34.isChecked) score += 1
                if (rbt38.isChecked) score += 1
                if (rbt42.isChecked) score += 1
                if (rbt46.isChecked) score += 1


                val intent = Intent(this, MainActivity2_1::class.java)
                intent.putExtra("score", score.toString())
                startActivityForResult(intent, 1)
            } else {
                Toast.makeText(this, "確認每題是否皆有做勾選", Toast.LENGTH_SHORT).show()
            }
        }
    }
}














/*        val always = "總是"
        val usual = "常常"
        val often = "偶爾"

        radioGroup1.setOnCheckedChangeListener { group, checkedID ->
            val Q1Ans: RadioButton = group.findViewById(checkedID)
            val Q1A = Q1Ans.text.toString()
            if (Q1A == always) {
                score += 3
            } else if (Q1A == usual) {
                score += 2
            } else if (Q1A == often) {
                score += 1
            }
        }

        Log.e("score47", score.toString())

        radioGroup2.setOnCheckedChangeListener { group, checkedID ->
            val Q2Ans: RadioButton = group.findViewById(checkedID)
            val Q2A = Q2Ans.text.toString()
            var score2 = 0
            if (Q2A == always) {
                score2 = 3
            } else if (Q2A == usual) {
                score2 = 2
            } else if (Q2A == often) {
                score2 = 1
            }
        }
        radioGroup3.setOnCheckedChangeListener { group, checkedID ->
            val Q3Ans: RadioButton = group.findViewById(checkedID)
            val Q3A = Q3Ans.text.toString()
            var score3 = 0
            if (Q3A == always) {
                score3 = 3
            } else if (Q3A == usual) {
                score3 = 2
            } else if (Q3A == often) {
                score3 = 1
            }
        }
        radioGroup4.setOnCheckedChangeListener { group, checkedID ->
            val Q4Ans: RadioButton = group.findViewById(checkedID)
            val Q4A = Q4Ans.text.toString()
            var score4 = 0
            if (Q4A == always) {
                score4 = 3
            } else if (Q4A == usual) {
                score4 = 2
            } else if (Q4A == often) {
                score4 = 1
            }
        }
        radioGroup5.setOnCheckedChangeListener { group, checkedID ->
            val Q5Ans: RadioButton = group.findViewById(checkedID)
            val Q5A = Q5Ans.text.toString()
            var score5 = 0
            if (Q5A == always) {
                score5 = 3
            } else if (Q5A == usual) {
                score5 = 2
            } else if (Q5A == often) {
                score5 = 1
            }
        }
        radioGroup6.setOnCheckedChangeListener { group, checkedID ->
            val Q6Ans: RadioButton = group.findViewById(checkedID)
            val Q6A = Q6Ans.text.toString()
            var score6 = 0
            if (Q6A == always) {
                score6 = 3
            } else if (Q6A == usual) {
                score6 = 2
            } else if (Q6A == often) {
                score6 = 1
            }
        }
        radioGroup7.setOnCheckedChangeListener { group, checkedID ->
            val Q7Ans: RadioButton = group.findViewById(checkedID)
            val Q7A = Q7Ans.text.toString()
            var score7 = 0
            if (Q7A == always) {
                score7 = 3
            } else if (Q7A == usual) {
                score7 = 2
            } else if (Q7A == often) {
                score7 = 1
            }
        }
        radioGroup8.setOnCheckedChangeListener { group, checkedID ->
            val Q8Ans: RadioButton = group.findViewById(checkedID)
            val Q8A = Q8Ans.text.toString()
            var score8 = 3
            if (Q8A == always) {
                score8 = 0
            } else if (Q8A == usual) {
                score8 = 1
            } else if (Q8A == often) {
                score8 = 2
            }
        }
        radioGroup9.setOnCheckedChangeListener { group, checkedID ->
            val Q9Ans: RadioButton = group.findViewById(checkedID)
            val Q9A = Q9Ans.text.toString()
            var score9 = 3
            if (Q9A == always) {
                score9 = 0
            } else if (Q9A == usual) {
                score9 = 1
            } else if (Q9A == often) {
                score9 = 2
            }
        }
        radioGroup10.setOnCheckedChangeListener { group, checkedID ->
            val Q10Ans: RadioButton = group.findViewById(checkedID)
            val Q10A = Q10Ans.text.toString()
            var score10 = 3
            if (Q10A == always) {
                score10 = 0
            } else if (Q10A == usual) {
                score10 = 1
            } else if (Q10A == often) {
                score10 = 2
            }
        }
        radioGroup11.setOnCheckedChangeListener { group, checkedID ->
            val Q11Ans: RadioButton = group.findViewById(checkedID)
            val Q11A = Q11Ans.text.toString()
            var score11 = 3
            if (Q11A == always) {
                score11 = 0
            } else if (Q11A == usual) {
                score11 = 1
            } else if (Q11A == often) {
                score11 = 2
            }
        }
        radioGroup12.setOnCheckedChangeListener { group, checkedID ->
            val Q12Ans: RadioButton = group.findViewById(checkedID)
            val Q12A = Q12Ans.text.toString()
            var score12 = 3
            if (Q12A == always) {
                score12 = 0
            } else if (Q12A == usual) {
                score12 = 1
            } else if (Q12A == often) {
                score12 = 2
            }
        }

            findViewById<Button>(R.id.btn_send).setOnClickListener {
                val b = Bundle()
                b.putInt("score",score)
                Log.e("score187", score.toString())
                val intent = Intent(this, MainActivity2_1::class.java)
                intent.putExtras(b)
                startActivityForResult(intent, 1)
            }

 */
