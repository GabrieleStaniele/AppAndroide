package br.com.cotemig.listview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.graphics.toColorInt
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PessoaRecyclerViewAdapter(val context: Context, val list: ArrayList<PessoaModel>) :
        RecyclerView.Adapter<PessoaRecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvNome = view.findViewById<TextView>(R.id.tvNome)
        val ImageView = view.findViewById<ImageView>(R.id.imageView)
        val idConstraint = view.findViewById<ConstraintLayout>(R.id.constraintId)
       // class Pokemon(var nome: String, var color: String, var url: String, var info1: String, var Info2: String, var altura: Int, var peso: Int) {

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.pessoa_item_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvNome.text = list[position].nome
//        holder.tvAltura.text = list[position].nome
        holder.idConstraint.setBackgroundColor(list[position].color.toColorInt())
        Glide
            .with(context)
            .load(list[position].url)
            .into(holder.ImageView);

        holder.itemView.setOnClickListener {
            val i = Intent(context, PessoaActivity::class.java)
            i.putExtra("nome", list[position].nome)
            i.putExtra("altura", list[position].altura)
            i.putExtra("peso", list[position].peso)
            i.putExtra("url", list[position].url)
            i.putExtra("info1",list[position].info1)
            i.putExtra("color",list[position].color)

            context.startActivity(i)
        }
    }
}

