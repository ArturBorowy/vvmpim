package pl.arturborowy.vvmpim.form.address

import org.koin.android.ext.android.get
import pl.arturborowy.vvmpim.R
import pl.arturborowy.vvmpim.global.base.DataBindingActivity

class FormAddressActivity : DataBindingActivity() {
    override val layoutResId = R.layout.activity_form_address
    override val viewModel = get<FormAddressViewModel>()
    override val uiEventHandler = get<FormAddressUiEventHandler>()
}