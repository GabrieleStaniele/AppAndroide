package br.com.cotemig.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class PessoaAdapter(val context: Context, val list: ArrayList<PessoaModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val layout = LayoutInflater.from(context).inflate(R.layout.pessoa_item_list, p2,  false)
        layout.findViewById<TextView>(R.id.tvNome).text = list[p0].nome
        var imageView = layout.findViewById<ImageView>(R.id.imageView)


        Glide
            .with(context)
            .load(list[p0].url)
            .into(imageView);

        return layout
    }

}