package core.view.adapter.items

import core.view.adapter.holders.ItemViewType.FIELD_ITEM

sealed class BaseItem(val type: Int) {

    object Field : BaseItem(type = FIELD_ITEM.viewType)
}
