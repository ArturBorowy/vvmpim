package pl.arturborowy.vvmpim.data

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class UserDataRepository : NameRepository, AddressRepository, ContactRepository {

    private var email: String = ""

    private var phone: Int = 0

    private var city: String = ""

    private var street: String = ""

    private var postalCode: String = ""

    private var buildingNo: Int = 0

    private var apartmentNo: Int = 0

    private var firstName: String = ""

    private var middleName: String = ""

    private var lastName: String = ""

    override suspend fun getEmail() = delayReturn(email)

    override suspend fun getPhone() = delayReturn(phone)

    override suspend fun getCity() = delayReturn(city)

    override suspend fun getStreet() = delayReturn(street)

    override suspend fun getPostalCode() = delayReturn(postalCode)

    override suspend fun getBuildingNo() = delayReturn(buildingNo)

    override suspend fun getApartmentNo() = delayReturn(apartmentNo)

    override suspend fun getFirstName() = delayReturn(firstName)

    override suspend fun getMiddleName() = delayReturn(middleName)

    override suspend fun getLastName() = delayReturn(lastName)

    override suspend fun setFirstName(firstName: String) {
        this.firstName = firstName
    }

    override suspend fun setMiddleName(middleName: String) {
        this.middleName = middleName
    }

    override suspend fun setLastName(lastName: String) {
        this.lastName = lastName
    }

    private suspend fun <ReturnT> delayReturn(valueToReturn: ReturnT, delayMillis: Long = 1000) =
        runBlocking {
            delay(delayMillis)
            valueToReturn
        }

    private val text = "REPO TEXT!"

    private val number = 123
}