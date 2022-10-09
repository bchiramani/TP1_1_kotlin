package icicom.gl4.loginscreen

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class WelcomeActivity : AppCompatActivity() {
    lateinit var txtemail : TextView
    lateinit var txtyear : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val email = intent.getStringExtra("email")
        Toast.makeText(this,"$email ", Toast.LENGTH_LONG).show()
        txtemail=findViewById(R.id.txtemail)
        txtemail.text = "$email"
        txtyear=findViewById(R.id.txtyear)
        txtyear.text = "Forth year "

    }
}