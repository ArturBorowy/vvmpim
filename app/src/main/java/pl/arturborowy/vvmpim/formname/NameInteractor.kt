package pl.arturborowy.vvmpim.formname

class NameInteractor(private val nameRepository: NameRepository) {

    val text = "${nameRepository.text} and suffix from interactor."
}