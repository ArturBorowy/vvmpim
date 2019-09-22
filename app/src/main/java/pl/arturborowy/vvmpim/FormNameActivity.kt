package pl.arturborowy.vvmpim

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.Bindable
import androidx.databinding.DataBindingUtil
import pl.arturborowy.vvmpim.databinding.ActivityFormNameBinding

class MainActivity : AppCompatActivity() {

    private val viewModel = MainViewModel()
    private val presenter = MainPresenter(viewModel, MainInteractor(MainRepository()))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityFormNameBinding>(this, R.layout.activity_form_name)

        binding.vm = viewModel
    }
}

class MainViewModel {

    @Bindable
    var firstName: String? = null

    @Bindable
    var middleName: String? = null

    @Bindable
    var lastName: String? = null

}

class MainPresenter(private val mainViewModel: MainViewModel,
                    private val mainInteractor: MainInteractor) {

    init {
        mainViewModel.firstName = mainInteractor.text
        mainViewModel.middleName = mainInteractor.text
        mainViewModel.lastName = mainInteractor.text
    }
}

class MainInteractor(private val mainRepository: MainRepository) {

    val text = "${mainRepository.text} and suffix from interactor."
}

class MainRepository {
    val text = "REPO TEXT!"
}