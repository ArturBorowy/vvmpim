package pl.arturborowy.vvmpim.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class DataBindingActivity : AppCompatActivity() {

    companion object {

        const val VIEW_MODEL_IN_DATA_BINDING_INDEX = 2
        const val UI_EVENT_HANDLER_IN_DATA_BINDING_INDEX = 1
    }

    protected abstract val layoutResId: Int

    protected abstract val viewModel: PojoViewModel

    protected abstract val uiEventHandler: UiEventHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
                DataBindingUtil.setContentView<ViewDataBinding>(this, layoutResId)
        binding.setVariable(VIEW_MODEL_IN_DATA_BINDING_INDEX, viewModel)
        binding.setVariable(UI_EVENT_HANDLER_IN_DATA_BINDING_INDEX, uiEventHandler)
    }
}