package icicom.gl4.loginscreen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var txtEmail : EditText
    lateinit var txtPassword : EditText
    lateinit var btnLogin : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtEmail = findViewById(R.id.editTextEmail)
        var email = txtEmail.text
        txtPassword = findViewById(R.id.editTextPassword)
        var password = txtPassword.text
        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener { view ->
            if(email.isNullOrBlank() || password.isNullOrBlank()){
                Toast.makeText(this,"Please fill is the required fields !! ",Toast.LENGTH_LONG).show()
            }else if (email.toString() =="gl4@insat.tn" && password.toString()=="insat2022"){
                Toast.makeText(this,"You are logged in :) !! ",Toast.LENGTH_LONG).show()
                val intent = Intent(view.context,WelcomeActivity::class.java)
                intent.putExtra("email",email.toString())
                startActivity(intent)


            }else{
                Toast.makeText(this,"Please verify your credientials :( !! ",Toast.LENGTH_LONG).show()

            }
        }


    }
}