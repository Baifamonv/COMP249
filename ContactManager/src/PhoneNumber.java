
public class PhoneNumber {
	public PhoneNumberType phoneNumberType;
	public int countryCode;
	public int areaCode;
	public int phoneNumber;
	public int extension;
	public PhoneNumber(PhoneNumberType PhoneNumberType, int countryCode, int areaCode,
			int phoneNumber, int extension) {
		this.phoneNumberType = phoneNumberType;
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.phoneNumber = phoneNumber;
		this.extension = extension;
	}
	public boolean equals(PhoneNumber phoneNumber){
		return((phoneNumber != null && this.phoneNumberType.equals(phoneNumber.phoneNumberType))&&(this.countryCode == phoneNumber.countryCode)
				&&(this.areaCode == phoneNumber.areaCode)&&(this.phoneNumber == phoneNumber.phoneNumber)
				&&(this.extension == phoneNumber.extension));
	}
}
