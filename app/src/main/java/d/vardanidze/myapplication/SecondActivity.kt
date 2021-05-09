package d.vardanidze.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {
    private lateinit var SurnameEditText : EditText
    private lateinit var NextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        SurnameEditText = findViewById(R.id.editTextTextPersonSurname)
        NextButton = findViewById(R.id.button2)

        val name = intent.extras?.getString("NAME")

        NextButton.setOnClickListener(){

            val SurnameText = SurnameEditText.text.toString()
            if (SurnameText.isEmpty()){
                return@setOnClickListener
            }
            val i = Intent(this, ThirdActivity::class.java)
            i.putExtra("NAME", name)
            i.putExtra("SURNAME", SurnameText)

            startActivity(i)


        }
    }
}