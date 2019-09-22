package pl.arturborowy.vvmpim

import androidx.databinding.Bindable
import pl.arturborowy.vvmpim.base.DataBindingActivity
import pl.arturborowy.vvmpim.base.PojoViewModel

class MainActivity : DataBindingActivity() {

    override val layoutResId = R.layout.activity_form_name

    override val viewModel = MainViewModel()

    override val uiEventHandler = MainPresenter(viewModel, MainInteractor(MainRepository()), ActivityNavigator(this))
}

class MainViewModel : PojoViewModel {

    @Bindable
    var firstName: String? = null

    @Bindable
    var middleName: String? = null

    @Bindable
    var lastName: String? = null

}

class MainPresenter(private val mainViewModel: MainViewModel,
                    private val mainInteractor: MainInteractor,
                    private val navigator: Navigator) : FormNameUiEventHandler {

    init {
        mainViewModel.firstName = mainInteractor.text
        mainViewModel.middleName = mainInteractor.text
        mainViewModel.lastName = mainInteractor.text
    }

    override fun onNextBtnClick() {
        navigator.goToFormAddress()
    }
}

class MainInteractor(private val mainRepository: MainRepository) {

    val text = "${mainRepository.text} and suffix from interactor."
}

class MainRepository {
    val text = "REPO TEXT!"
}