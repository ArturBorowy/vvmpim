package pl.arturborowy.vvmpim.form.name

import pl.arturborowy.vvmpim.data.NameRepository

class NameInteractor(private val nameRepository: NameRepository) {

    suspend fun getUserFirstName() = nameRepository.getFirstName()

    suspend fun getUserMiddleName() = nameRepository.getMiddleName()

    suspend fun getUserLastName() = nameRepository.getLastName()
}