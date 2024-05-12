package ch.shan.okgpt

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }

    fun TestClicked(view: View) {
        view.findViewById<TextView>(R.id.textView).visibility = View.VISIBLE
    }
}