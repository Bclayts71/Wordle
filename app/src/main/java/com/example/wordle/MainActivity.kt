package com.example.wordle

import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val wordToGuess = FourLetterWordList.getRandomFourLetterWord()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showButton = findViewById<Button>(R.id.button)
        val showButton2 = findViewById<Button>(R.id.button2)

        val editText = findViewById<EditText>(R.id.et_simple)

        val textView1 = findViewById<TextView>(R.id.textView2)
        val textView2 = findViewById<TextView>(R.id.textView4)
        val textView3 = findViewById<TextView>(R.id.textView6)
        val textView4 = findViewById<TextView>(R.id.textView8)
        val textView5 = findViewById<TextView>(R.id.textView10)
        val textView6 = findViewById<TextView>(R.id.textView12)
        val textView7 = findViewById<TextView>(R.id.textView13)

        showButton.setOnClickListener {
            val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(editText.getApplicationWindowToken(), 0)

            val text = editText.text.toString().uppercase()
            textView7.text = wordToGuess
            val result = checkGuess(text)

            textView1.text = text
            textView2.text = result
            editText.setText("")

            showButton.setOnClickListener {
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(editText.getApplicationWindowToken(), 0)

                val text = editText.text.toString().uppercase()
                val result = checkGuess(text)

                textView3.text = text
                textView4.text = result
                editText.setText("")

                showButton.setOnClickListener {
                    val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(editText.getApplicationWindowToken(), 0)

                    val text = editText.text.toString().uppercase()
                    val result = checkGuess(text)

                    textView5.text = text
                    textView6.text = result
                    editText.setText("")

                    textView7.visibility = View.VISIBLE
                    showButton.visibility = View.INVISIBLE
                    showButton2.visibility = View.VISIBLE

                    showButton2.setOnClickListener {
                        finish()
                        overridePendingTransition(0,0)
                        startActivity(intent)
                        overridePendingTransition(0,0)
                    }
                }
            }
        }
    }
    private fun checkGuess(guess: String) : String {
        var result = ""
        for (i in 0..3) {
            if (guess[i] == wordToGuess[i]) {
                result += "O"
            }
            else if (guess[i] in wordToGuess) {
                result += "+"
            }
            else {
                result += "X"
            }
        }
        return result
    }
}