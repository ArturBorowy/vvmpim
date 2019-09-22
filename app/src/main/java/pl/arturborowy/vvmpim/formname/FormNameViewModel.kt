package pl.arturborowy.vvmpim.formname

import androidx.databinding.Bindable
import pl.arturborowy.vvmpim.base.PojoViewModel

class FormNameViewModel : PojoViewModel {

    @Bindable
    var firstName: String? = null

    @Bindable
    var middleName: String? = null

    @Bindable
    var lastName: String? = null

}