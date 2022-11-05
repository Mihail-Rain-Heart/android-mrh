package core.view.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import core.view.adapter.holders.BaseItemViewHolder
import core.view.adapter.items.BaseItem

/**
 * Базовый адаптер для показа списков базовых элементов
 * Тип viewHolder-а определяется по типу базового элемента
 */
class BaseAdapter : ListAdapter<BaseItem, BaseItemViewHolder<BaseItem>>(BaseItemsDiffer) {

    private val factoryVH = ViewHolderFactory()

    /**
     * Выбирает класс содержащий view по типу элемента
     * @param viewType - [BaseItem.type] тип отображаемого элемента
     * @return [BaseItemViewHolder] класс содержащий view для элемента с типом [viewType]
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        factoryVH.createViewHolder(parent, viewType)

    /**
     * Связать данные элемента с представлением
     * @param holder класс содержащий view для связывания с данными
     * @param position позиция текущего отрисовываемого элемента
     */
    override fun onBindViewHolder(holder: BaseItemViewHolder<BaseItem>, position: Int) {
        holder.bind(getItem(position))
    }

    /** @return [BaseItem.type] тип отображаемого элемента */
    override fun getItemViewType(position: Int): Int = getItem(position).type
}
