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
            formNameViewModel.firstName.set(nameInteractor.getUserFirstName())
            formNameViewModel.middleName.set(nameInteractor.getUserMiddleName())
            formNameViewModel.lastName.set(nameInteractor.getUserLastName())
        }
    }

    override fun onNextBtnClick() {
        runBlocking {
            formNameViewModel.firstName.value?.let { nameInteractor.setUserFirstName(it) }
            formNameViewModel.middleName.value?.let { nameInteractor.setUserMiddleName(it) }
            formNameViewModel.lastName.value?.let { nameInteractor.setUserLastName(it) }
        }

        navigator.goToFormAddress()
    }
}