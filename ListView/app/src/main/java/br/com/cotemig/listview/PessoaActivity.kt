package br.com.cotemig.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.graphics.toColorInt
import com.bumptech.glide.Glide

class PessoaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pessoa)

        var nome = intent.getStringExtra("nome")
        var altura = intent.getIntExtra("altura",0)
        var peso = intent.getIntExtra("peso", 0)
        var url = intent.getStringExtra("url")
        var info1 = intent.getStringExtra("info1")
        var btvoltar = findViewById<ImageView>(R.id.ivVoltar)
        var color = intent.getStringExtra("color")

//clMain
        findViewById<TextView>(R.id.tvNome).setText(nome)
        findViewById<TextView>(R.id.tvAltura).setText(altura.toString())
        findViewById<TextView>(R.id.tvPeso).setText(peso.toString())
        findViewById<TextView>(R.id.tvInfo1).setText(info1)

      val colorLayout = color?.let{
        findViewById<ConstraintLayout>(R.id.constraintId).setBackgroundColor(
            it.toColorInt()) }
       // holder.idConstraint.setBackgroundColor(list[position].color.toColorInt())


        btvoltar.setOnClickListener(){
            finish()
        }

        var imageView = findViewById<ImageView>(R.id.ivPokemon)
        Glide
            .with(this)
            .load(url)
            .into(imageView);


    }
}