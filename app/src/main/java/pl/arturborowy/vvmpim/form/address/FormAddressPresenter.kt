package pl.arturborowy.vvmpim.form.address

import kotlinx.coroutines.runBlocking
import pl.arturborowy.vvmpim.global.navigator.Navigator

class FormAddressPresenter(
    private val addressViewModel: FormAddressViewModel,
    private val addressInteractor: AddressInteractor,
    private val navigator: Navigator
) : FormAddressUiEventHandler {

    init {
        addressViewModel.loadingVisible = true

        runBlocking {
            addressViewModel.street = addressInteractor.getStreet()
            addressViewModel.apartmentNo = addressInteractor.getApartmentNo().toString()
            addressViewModel.buildingNo = addressInteractor.getBuildingNo().toString()
            addressViewModel.city = addressInteractor.getCity()
            addressViewModel.postalCode = addressInteractor.getPostalCode()
        }

        addressViewModel.loadingVisible = false
    }

    override fun onNextBtnClick() {
        addressViewModel.loadingVisible = true

        runBlocking {
            addressViewModel.street?.let { addressInteractor.setStreet(it) }
            addressViewModel.apartmentNo?.toInt()?.let { addressInteractor.setApartmentNo(it) }
            addressViewModel.buildingNo?.toInt()?.let { addressInteractor.setBuildingNo(it) }
            addressViewModel.city?.let { addressInteractor.setCity(it) }
            addressViewModel.postalCode?.let { addressInteractor.setPostalCode(it) }
        }

        addressViewModel.loadingVisible = false

        navigator.goToFormContact()
    }
}