package core.view.adapter.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import core.view.adapter.items.BaseItem

/**
 * Базовый ViewHolder для recycler-а.
 * @param view корневая view биндинга
 */
abstract class BaseItemViewHolder<in T : BaseItem>(view: View) : RecyclerView.ViewHolder(view) {

    /**
     * Отображает данные из item на view
     * @param item - элемент списка в recyclerView
     */
    abstract fun bind(item: T)
}
