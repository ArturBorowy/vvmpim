package pl.arturborowy.vvmpim.form.name

import org.koin.android.ext.android.get
import pl.arturborowy.vvmpim.R
import pl.arturborowy.vvmpim.global.base.DataBindingActivity

class FormNameActivity : DataBindingActivity() {
    override val layoutResId = R.layout.activity_form_name
    override val viewModel = get<FormNameViewModel>()
    override val uiEventHandler = get<FormNameUiEventHandler>()
}