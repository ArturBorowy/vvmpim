package pl.arturborowy.vvmpim.form.name

import pl.arturborowy.vvmpim.global.base.PojoViewModel
import pl.arturborowy.vvmpim.util.IObservableField

interface FormNameViewModel : PojoViewModel {

    val firstName: IObservableField<String>
    val middleName: IObservableField<String>
    val lastName: IObservableField<String>
    val loadingVisible: IObservableField<Boolean>
}