package pl.arturborowy.vvmpim.form.name

import pl.arturborowy.vvmpim.data.NameRepository

class NameInteractor(private val nameRepository: NameRepository) {

    suspend fun getUserFirstName() = nameRepository.getFirstName()

    suspend fun getUserMiddleName() = nameRepository.getMiddleName()

    suspend fun getUserLastName() = nameRepository.getLastName()

    suspend fun setUserFirstName(firstName: String) = nameRepository.setFirstName(firstName)

    suspend fun setUserMiddleName(middleName: String) = nameRepository.setMiddleName(middleName)

    suspend fun setUserLastName(lastName: String) = nameRepository.setLastName(lastName)
}