package core.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding

/**
 * Получить биндинг для [ViewGroup]
 * @param inflater - функция inflate сгенерированная для Binding-класса указанного в месте вызова под [T]
 * @return [T] - проинициализированный класс биндинга
 */
inline fun <T : ViewBinding> ViewGroup.viewBinding(
    crossinline inflater: (LayoutInflater, ViewGroup, Boolean) -> T
) = inflater(LayoutInflater.from(context), this, false)
