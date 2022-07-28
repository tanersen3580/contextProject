package com.tanersen.contextproject

import android.content.DialogInterface
import android.icu.text.LocaleDisplayNames
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //2 tip uyarı var. Toast, Alert
        //application.Context app contexti
        //this, this@MainActivity aktivitenin contexti
        //ikisi de olur.
        Toast.makeText(this, "Hoşgeldin", Toast.LENGTH_SHORT).show()
    }

    fun sendMessage(view: View){
        var alertMessage=AlertDialog.Builder(this@MainActivity)
        alertMessage.setTitle("Alert Message")
        alertMessage.setMessage("Şifreyi yanlış girdiniz. Tekrar giriş yapmak istermisiniz ?")
        //Lambda Gösterimi
        alertMessage.setPositiveButton("Evet",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this, "Tekrar giriş yapabilirsiniz", Toast.LENGTH_SHORT).show()
        })
        alertMessage.setNegativeButton("Hayır",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this, "Üzgünüm tekrar giriş yapmadınız", Toast.LENGTH_SHORT).show()

        })
        alertMessage.show()
    }
}