package pl.arturborowy.vvmpim.util

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("visibleOrGone")
fun setVisibleOrGone(view: View, visibleOrGone: Boolean?) {
    view.visibility = if (visibleOrGone == true) {
        View.VISIBLE
    } else {
        View.GONE
    }
}