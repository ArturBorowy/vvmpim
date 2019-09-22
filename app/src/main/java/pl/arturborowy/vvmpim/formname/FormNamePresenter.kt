package pl.arturborowy.vvmpim.formname

import pl.arturborowy.vvmpim.Navigator

class FormNamePresenter(private val formNameViewModel: FormNameViewModel,
                        private val nameInteractor: NameInteractor,
                        private val navigator: Navigator) : FormNameUiEventHandler {

    init {
        formNameViewModel.firstName = nameInteractor.text
        formNameViewModel.middleName = nameInteractor.text
        formNameViewModel.lastName = nameInteractor.text
    }

    override fun onNextBtnClick() {
        navigator.goToFormAddress()
    }
}