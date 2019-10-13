package pl.arturborowy.vvmpim.form.address

import pl.arturborowy.vvmpim.data.AddressRepository

class AddressInteractor(private val addressRepository: AddressRepository) {

    suspend fun getCity() = addressRepository.getCity()

    suspend fun getStreet() = addressRepository.getStreet()

    suspend fun getPostalCode() = addressRepository.getPostalCode()

    suspend fun getBuildingNo() = addressRepository.getBuildingNo()

    suspend fun getApartmentNo() = addressRepository.getApartmentNo()

    suspend fun setCity(city: String) = addressRepository.setCity(city)

    suspend fun setStreet(street: String) = addressRepository.setStreet(street)

    suspend fun setPostalCode(postalCode: String) = addressRepository.setPostalCode(postalCode)

    suspend fun setBuildingNo(buildingNo: Int) = addressRepository.setBuildingNo(buildingNo)

    suspend fun setApartmentNo(apartmentNo: Int) = addressRepository.setApartmentNo(apartmentNo)
}