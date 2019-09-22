package pl.arturborowy.vvmpim.form.name

class NameInteractor(private val nameRepository: NameRepository) {

    val text = "${nameRepository.text} and suffix from interactor."
}