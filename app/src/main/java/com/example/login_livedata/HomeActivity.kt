package com.example.login_livedata
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Animación de entrada
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }
}
