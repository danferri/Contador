package br.edu.ifsp.scl.ads.contador

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.ifsp.scl.ads.contador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var amb: ActivityMainBinding
    private var contador: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)

        amb.zeroRb.setOnClickListener{
           contador = amb.zeroRb.text.toString().toInt()
        }

        amb.dezRb.setOnClickListener {
            contador = 10
        }

        /*amb.cliqueBt.setOnClickListener {
            amb.contadorTv.text = ((++contador).toString())
        }

        cliqueBt.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "vc clicou!", Toast.LENGTH_SHORT).show()
            }
        })*/

        amb.cliqueBt.setOnClickListener {
            Toast.makeText(this@MainActivity, "vc clicou!", Toast.LENGTH_SHORT).show()
            amb.contadorTv.text = ((++contador).toString())
        }

    }
}