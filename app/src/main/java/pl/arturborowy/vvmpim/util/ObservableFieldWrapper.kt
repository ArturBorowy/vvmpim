package pl.arturborowy.vvmpim.util

import androidx.databinding.Observable
import androidx.databinding.ObservableField

class ObservableFieldWrapper<ValueT>(value: ValueT? = null) : IObservableField<ValueT> {

    override val value: ValueT?
        get() = observableField.get()

    private val observableField = ObservableField<ValueT>(value)

    override fun set(value: ValueT?) = observableField.set(value)

    override fun addOnPropertyChangedCallback(onPropertyChangedCallback: (ValueT?) -> Unit) {
        observableField.addOnPropertyChangedCallback(object : Observable.OnPropertyChangedCallback() {
            override fun onPropertyChanged(sender: Observable?, propertyId: Int) =
                onPropertyChangedCallback(value)
        })
    }
}