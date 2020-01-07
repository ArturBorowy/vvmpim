package pl.arturborowy.vvmpim.util

interface IObservableField<ValueT> {

    val value: ValueT?

    fun set(value: ValueT?)

    fun addOnPropertyChangedCallback(onPropertyChangedCallback: (ValueT?) -> Unit)
}