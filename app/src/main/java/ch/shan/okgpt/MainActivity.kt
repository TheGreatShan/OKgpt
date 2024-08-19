package ch.shan.okgpt

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.core.widget.addTextChangedListener
import com.google.android.material.textfield.TextInputEditText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        TestClicked(this)
        TextInputChange(this)
    }

    fun TestClicked(context: Context) {
        val btn_click_me: Button = findViewById(R.id.button)
        btn_click_me.setOnClickListener {
            Toast.makeText(context, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }

    fun TextInputChange(context: Context) {
        val input: TextInputEditText = findViewById(R.id.promptInput)

        input.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                p0.toString()
                Toast.makeText(context, "Text changed to: " + p0.toString(), Toast.LENGTH_SHORT)
                    .show()
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })
    }
}