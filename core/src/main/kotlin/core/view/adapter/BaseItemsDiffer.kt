package core.view.adapter

import androidx.recyclerview.widget.DiffUtil
import core.view.adapter.items.BaseItem

/**
 * Сообщает RecyclerView какие элементы были изменены, чтобы recycler их перерисовал
 */
object BaseItemsDiffer : DiffUtil.ItemCallback<BaseItem>() {

    override fun areItemsTheSame(oldItem: BaseItem, newItem: BaseItem) = oldItem == newItem

    override fun areContentsTheSame(oldItem: BaseItem, newItem: BaseItem) = oldItem == newItem
}
