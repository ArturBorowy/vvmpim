package pl.arturborowy.vvmpim.formname

import pl.arturborowy.vvmpim.ActivityNavigator
import pl.arturborowy.vvmpim.R
import pl.arturborowy.vvmpim.base.DataBindingActivity

class FormNameActivity : DataBindingActivity() {

    override val layoutResId = R.layout.activity_form_name

    override val viewModel = FormNameViewModel()

    override val uiEventHandler = FormNamePresenter(viewModel, NameInteractor(NameRepository()), ActivityNavigator(this))
}