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

    override suspend fun setEmail(email: String) {
        delayRun({ this.email = email })
    }

    override suspend fun setPhone(phone: Int) {
        delayRun({ this.phone = phone })
    }

    override suspend fun getEmail() = delayReturn(email)

    override suspend fun getPhone() = delayReturn(phone)

    override suspend fun getCity() = delayReturn(city)

    override suspend fun getStreet() = delayReturn(street)

    override suspend fun getPostalCode() = delayReturn(postalCode)

    override suspend fun getBuildingNo() = delayReturn(buildingNo)

    override suspend fun getApartmentNo() = delayReturn(apartmentNo)

    override suspend fun setCity(city: String) {
        delayRun({ this.city = city })
    }

    override suspend fun setStreet(street: String) {
        delayRun({ this.street = street })
    }

    override suspend fun setPostalCode(postalCode: String) {
        delayRun({ this.postalCode = postalCode })
    }

    override suspend fun setBuildingNo(buildingNo: Int) {
        delayRun({ this.buildingNo = buildingNo })
    }

    override suspend fun setApartmentNo(apartmentNo: Int) {
        delayRun({ this.apartmentNo = apartmentNo })
    }

    override suspend fun getFirstName() = delayReturn(firstName)

    override suspend fun getMiddleName() = delayReturn(middleName)

    override suspend fun getLastName() = delayReturn(lastName)

    override suspend fun setFirstName(firstName: String) {
        delayRun({ this.firstName = firstName })
    }

    override suspend fun setMiddleName(middleName: String) {
        delayRun({ this.middleName = middleName })
    }

    override suspend fun setLastName(lastName: String) {
        delayRun({ this.lastName = lastName })
    }

    private suspend fun <ReturnT> delayReturn(valueToReturn: ReturnT, delayMillis: Long = 1000) =
        delayRun({ valueToReturn }, delayMillis)

    private suspend fun <ReturnT> delayRun(block: () -> ReturnT, delayMillis: Long = 1000) =
        runBlocking {
            delay(delayMillis)
            block()
        }
}