package pl.arturborowy.vvmpim

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.Observable
import androidx.databinding.ObservableField
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val viewModel = MainViewModel()
    private val presenter = MainPresenter(viewModel, MainInteractor(MainRepository()))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = viewModel.text.get()

        //TODO REPLACE WITH DATABINDING
        viewModel.text.addOnPropertyChangedCallback(object : Observable.OnPropertyChangedCallback() {

            override fun onPropertyChanged(sender: Observable?, propertyId: Int) {
                textView.text = viewModel.text.get()
                Log.e("PROP CHANGED", viewModel.text.get())
            }
        })
    }
}

class MainViewModel {

    val text = ObservableField<String>()
    var textValue: String?
        get() = text.get()
        set(value) = text.set(value)

}

class MainPresenter(private val mainViewModel: MainViewModel,
                    private val mainInteractor: MainInteractor) {

    init {
        mainViewModel.textValue = mainInteractor.text
    }
}

class MainInteractor(private val mainRepository: MainRepository) {

    val text = "${mainRepository.text} and suffix from interactor."
}

class MainRepository {
    val text = "REPO TEXT!"
}