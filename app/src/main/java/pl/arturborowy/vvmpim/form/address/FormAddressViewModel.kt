package pl.arturborowy.vvmpim.form.address

import androidx.databinding.Bindable
import pl.arturborowy.vvmpim.global.base.PojoViewModel

class FormAddressViewModel : PojoViewModel {

    @Bindable
    var city: String? = null
    @Bindable
    var postalCode: String? = null
    @Bindable
    var street: String? = null
    @Bindable
    var buildingNo: String? = null
    @Bindable
    var apartmentNo: String? = null
}