package pl.arturborowy.vvmpim.form.contact

import pl.arturborowy.vvmpim.data.ContactRepository

class ContactInteractor(private val contactRepository: ContactRepository) {

    suspend fun getEmail() = contactRepository.getEmail()

    suspend fun getPhone() = contactRepository.getPhone()

    suspend fun setEmail(email: String) = contactRepository.setEmail(email)

    suspend fun setPhone(phone: Int) = contactRepository.setPhone(phone)
}