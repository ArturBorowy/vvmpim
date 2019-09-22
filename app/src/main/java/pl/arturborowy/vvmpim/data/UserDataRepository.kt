package pl.arturborowy.vvmpim.data

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class UserDataRepository : NameRepository, AddressRepository, ContactRepository {
    override suspend fun getEmail() = delayReturn(text)

    override suspend fun getPhone() = delayReturn(number)

    override suspend fun getCity() = delayReturn(text)

    override suspend fun getStreet() = delayReturn(text)

    override suspend fun getPostalCode() = delayReturn(text)

    override suspend fun getBuildingNo() = delayReturn(number)

    override suspend fun getApartmentNo() = delayReturn(number)

    override suspend fun getFirstName() = delayReturn(text)

    override suspend fun getMiddleName() = delayReturn(text)

    override suspend fun getLastName() = delayReturn(text)

    private suspend fun <ReturnT> delayReturn(valueToReturn: ReturnT, delayMillis: Long = 1000) =
        runBlocking {
            delay(delayMillis)
            valueToReturn
        }

    private val text = "REPO TEXT!"

    private val number = 123
}