package core.view.adapter

import android.view.ViewGroup
import core.view.adapter.holders.FieldItemViewHolder
import core.view.adapter.holders.ItemViewType
import core.view.adapter.holders.ItemViewType.FIELD_ITEM

class ViewHolderFactory {

    private val holders = ItemViewType.values()

    fun createViewHolder(parent: ViewGroup, viewType: Int) = holders
        .find { type -> type.viewType == viewType }?.let { type ->
            getViewHolder(
                type = type,
                parent = parent
            )
        } ?: throw IllegalArgumentException("Unknown view type $viewType")

    private fun getViewHolder(type: ItemViewType, parent: ViewGroup) = when (type) {
        FIELD_ITEM -> FieldItemViewHolder(type.createView(parent))
    }
}