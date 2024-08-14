package ch.shan.okgpt

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        TestClicked(this)
    }

    fun TestClicked(context: Context) {
        val btn_click_me: Button = findViewById(R.id.button)
        btn_click_me.setOnClickListener {
            Toast.makeText(context, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }
}