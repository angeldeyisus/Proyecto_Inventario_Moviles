package santos.angel.proyectofinalmoviles

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ReporteIntenvario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reporte_intenvario)
        val flechaAtras = findViewById<ImageView>(R.id.iv_flecha_atras)

        flechaAtras.setOnClickListener {
            onBackPressed()
        }
    }
}