package pl.arturborowy.vvmpim.form.contact

import kotlinx.coroutines.runBlocking
import pl.arturborowy.vvmpim.global.navigator.Navigator

class FormContactPresenter(
    private val formContactViewModel : FormContactViewModel,
    private val contactInteractor: ContactInteractor,
    private val navigator: Navigator
) : FormContactUiEventHandler {

    init {
        runBlocking {
            formContactViewModel.email = contactInteractor.getEmail()
            formContactViewModel.phoneNo = contactInteractor.getPhone().toString()
        }
    }

    override fun onNextBtnClick() {
        runBlocking {
            formContactViewModel.email?.let { contactInteractor.setEmail(it) }
            formContactViewModel.phoneNo?.let { contactInteractor.setPhone(it.toInt()) }
        }
    }
}