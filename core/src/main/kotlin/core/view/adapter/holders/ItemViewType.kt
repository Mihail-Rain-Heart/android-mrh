@file:Suppress("UNCHECKED_CAST")

package core.view.adapter.holders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.mrh.core.databinding.ItemBaseFieldBinding
import core.view.viewBinding

enum class ItemViewType(
    val viewType: Int,
    private val inflater: (LayoutInflater, ViewGroup, Boolean) -> ViewBinding
) {

    FIELD_ITEM(
        viewType = 0,
        inflater = ItemBaseFieldBinding::inflate
    );

    fun <T : ViewBinding> createView(
        parent: ViewGroup
    ) = parent.viewBinding(inflater) as T
}