package pl.arturborowy.vvmpim.form.contact

import androidx.databinding.Bindable
import pl.arturborowy.vvmpim.global.base.PojoViewModel

class FormContactViewModel : PojoViewModel {

    @Bindable
    var email: String? = null

    @Bindable
    var phoneNo: String? = null

    @Bindable
    var loadingVisible: Boolean = false
}