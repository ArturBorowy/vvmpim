package pl.arturborowy.vvmpim.form.address

import pl.arturborowy.vvmpim.global.navigator.Navigator

class FormAddressPresenter(private val navigator: Navigator) : FormAddressUiEventHandler {

    override fun onNextBtnClick() {
        navigator.goToFormContact()
    }
}