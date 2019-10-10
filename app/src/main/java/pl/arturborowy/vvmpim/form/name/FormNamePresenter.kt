package pl.arturborowy.vvmpim.form.name

import kotlinx.coroutines.runBlocking
import pl.arturborowy.vvmpim.global.navigator.Navigator

class FormNamePresenter(
    private val formNameViewModel: FormNameViewModel,
    private val nameInteractor: NameInteractor,
    private val navigator: Navigator
) : FormNameUiEventHandler {

    init {
        runBlocking {
            formNameViewModel.firstName = nameInteractor.getUserFirstName()
            formNameViewModel.middleName = nameInteractor.getUserMiddleName()
            formNameViewModel.lastName = nameInteractor.getUserLastName()
        }
    }

    override fun onNextBtnClick() {
        runBlocking {
            formNameViewModel.firstName?.let { nameInteractor.setUserFirstName(it) }
            formNameViewModel.middleName?.let { nameInteractor.setUserMiddleName(it) }
            formNameViewModel.lastName?.let { nameInteractor.setUserLastName(it) }
        }

        navigator.goToFormAddress()
    }
}