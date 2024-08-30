package br.com.cotemig.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    /*
    * Aluna: Gabriele Staniele Ferreira
    * Matrícula: 72201258

    * */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = findViewById<RecyclerView>(R.id.lista)

        val listaPessoas = listaPessoas()
        val adapter = PessoaRecyclerViewAdapter(this, listaPessoas)

        lista.adapter = adapter
        lista.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true)
        lista.itemAnimator = DefaultItemAnimator()

    }

    fun listaPessoas(): ArrayList<PessoaModel> {
        val lista = ArrayList<PessoaModel>()
        lista.add(PessoaModel("Squirtle", "#4592c4", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png", "Água", "", 50, 9))
        lista.add(PessoaModel("Pikachu", "#eed535", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/025.png", "Elétrico", "", 40, 6))
        lista.add(PessoaModel("Charmander", "#fd7d24", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png", "Fogo", "", 60, 8))
        lista.add(PessoaModel("Bulbasaur", "#9bcc50", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png", "Grama", "Tóxico", 70, 9))
        lista.add(PessoaModel("Darkrai", "#707070", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/491.png", "Escuridão", "", 150, 50))
        lista.add(PessoaModel("Charizard", "#fd7d24", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/006.png", "Fogo", "Vôo", 170, 90))
        lista.add(PessoaModel("Blastoise", "#4592c4", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/009.png", "Água", "", 160, 85))
        return lista
    }
        }

