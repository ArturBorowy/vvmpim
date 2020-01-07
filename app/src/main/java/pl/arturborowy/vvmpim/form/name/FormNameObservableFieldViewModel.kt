package pl.arturborowy.vvmpim.form.name

import pl.arturborowy.vvmpim.util.ObservableFieldWrapper

class FormNameObservableFieldViewModel : FormNameViewModel {

    override val firstName = ObservableFieldWrapper<String>()
    override val middleName = ObservableFieldWrapper<String>()
    override val lastName = ObservableFieldWrapper<String>()
    override val loadingVisible = ObservableFieldWrapper<Boolean>()
}