package pl.arturborowy.vvmpim.form.contact

import org.koin.android.ext.android.get
import pl.arturborowy.vvmpim.R
import pl.arturborowy.vvmpim.global.base.DataBindingActivity

class FormContactActivity : DataBindingActivity() {
    override val layoutResId = R.layout.activity_form_contact
    override val viewModel = get<FormContactViewModel>()
    override val uiEventHandler = get<FormContactUiEventHandler>()
}