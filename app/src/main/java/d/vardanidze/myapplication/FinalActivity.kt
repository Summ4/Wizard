package d.vardanidze.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        findViewById<TextView>(R.id.textView).text = intent.extras?.getString("NAME", "")
        findViewById<TextView>(R.id.textView2).text = intent.extras?.getString("SURNAME", "")
        findViewById<TextView>(R.id.textView3).text = intent.extras?.getInt("AGE").toString()

    }
}