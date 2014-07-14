
public class Address {
	public AddressType addressType;
	public String streetName;
	public String streetNumber;
	public String apartmentNumber;
	public String city;
	public String postalCode;
	public String country;
	public Address(AddressType addressType, String streetName, String streetNumber,
			String apartmentNumber, String city, String postalCode, String country) {
		this.addressType = addressType;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.apartmentNumber = apartmentNumber;
		this.city = city;
		this.postalCode = postalCode;
		this.country = country;
	}
	
	public boolean equals(Address address){
		return(address != null
				&& this.addressType.equals(address.addressType)
				&&(this.streetName.equals(address.streetName))
				&&(this.streetNumber.equals(address.streetNumber))
				&&(this.apartmentNumber.equals(address.apartmentNumber))
				&&(this.city.equals(address.city))
				&&(this.postalCode.equals(address.postalCode))
				&&(this.country.equals(address.country))
				);
	}
}
