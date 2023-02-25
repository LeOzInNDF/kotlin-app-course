package br.com.cyberjet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MenuItemAdapter : RecyclerView.Adapter<MenuItemAdapter.MenuItemAdapterViewHolder>(){

    private val list = mutableListOf<MenuItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, attachToRoot=false )
        return MenuItemAdapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MenuItemAdapterViewHolder, position: Int) {
        holder.iniciaViews(list[position])

    }

    class MenuItemAdapterViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun iniciaViews(item: MenuItemModel) {
            item.titulo
        }
    }
}