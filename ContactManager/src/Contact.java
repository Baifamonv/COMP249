public class Contact {
	public String lastName;
	public String firstName;
	public String middleName;
	public Address[] addressList = new Address[10];
	public PhoneNumber[] phoneNumberList = new PhoneNumber[10];
	public SocialNetworkAccount[] socialNetworkAccountList = new SocialNetworkAccount[10];

	public Contact(String lastName, String firstName, String middleName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
	}
	
/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


/**
 * Check if the contact exist
 * @param contact
 * @return true if the contact exist
 */
	
	public boolean equals(Contact contact) {
		return ((lastName.equals(contact.lastName))
				&& (firstName.equals(contact.firstName))
				&& (middleName.equals(contact.middleName)));
	}

	/**
	 * Give the index of the empty contact
	 * 
	 * @param list
	 * @return the index of the empty address
	 */
	private int FindEmptyIndexAddress(Address[] list) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == null) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Check if the address exists
	 * 
	 * @param address
	 * @return true if the address exists
	 */
	private boolean CheckAddress(Address address) {
		boolean areAddressEquals = false;
		for (int i = 0; i < 10; i++) {
			if (address.equals(addressList[i])) {
				// found one!! no need to add it again !
				areAddressEquals = true;
			}
		}
		return areAddressEquals;
	}

	/**
	 * Add address to the list if the address doesn't exist and there is space
	 * in the address list
	 * 
	 * @param address
	 */

	public void addAddress(Address address) {
		boolean areAddressEquals = this.CheckAddress(address);
		if (!areAddressEquals) {
			int emptyIndex = FindEmptyIndexAddress(addressList);

			if (emptyIndex > 0) {
				addressList[emptyIndex] = address;
			}
		}

	}

	/**
	 * Give the index of the empty phone number
	 * 
	 * @param phoneNumber
	 * @return the index of the empty phone number
	 */

	private int FindEmptyIndexPhoneNumber(PhoneNumber[] phoneNumber) {
		for (int i = 0; i < phoneNumber.length; i++) {
			if (phoneNumber[i] == null) {
				return i;
			}
		}
		return -1;

	}

	/**
	 * Check if phone number exists;
	 * 
	 * @param phoneNumber
	 * @return true if phone number already existed
	 */
	private boolean CheckPhoneNumber(PhoneNumber phoneNumber) {
		boolean arePhoneNumberEquals = false;
		for (int i = 0; i < 10; i++) {
			if (phoneNumber.equals(phoneNumberList[i])) {
				arePhoneNumberEquals = true;
			}
		}
		return arePhoneNumberEquals;
	}

	/**
	 * Add phone number to the phone number list if the phone number doesn't
	 * exsit and there is space in the phone list
	 * 
	 * @param phoneNumber
	 */
	public void addPhoneNumber(PhoneNumber phoneNumber) {
		boolean arePhoneNumberEquals = this.CheckPhoneNumber(phoneNumber);
		if (!arePhoneNumberEquals) {
			int emptyPhoneNumber = FindEmptyIndexPhoneNumber(phoneNumberList);
			if (emptyPhoneNumber > 0) {
				phoneNumberList[emptyPhoneNumber] = phoneNumber;
			}
		}
	}

	/**
	 * give the index of the empty social account
	 * 
	 * @param social
	 * @return the index of the empty social account
	 */
	private int FindEmptyIndexSocial(SocialNetworkAccount[] socialList) {
		for (int i = 0; i < socialList.length; i++) {
			if (socialList[i] == null)
				return i;
		}
		return -1;
	}

	/**
	 * check if the social network account exists
	 * 
	 * @param social
	 * @return true if it exists the same social network account
	 */
	private boolean CheckSocial(SocialNetworkAccount social) {
		boolean isSocialEquals = false;
		for (int i = 0; i < 10; i++) {
			if (social.equals(socialNetworkAccountList[i])) {
				isSocialEquals = true;
			}
		}
		return isSocialEquals;
	}

	/**
	 * Add social account to the social account list if the account doesn't
	 * exist and there is space in the social account list
	 * 
	 * @param socialNetworkAccount
	 */

	public void addSocialNetworkAccount(SocialNetworkAccount socialAccount) {
		boolean isExist = CheckSocial(socialAccount);
		if (!isExist == true) {
			int emptySocial = FindEmptyIndexSocial(socialNetworkAccountList);
			if (emptySocial > 0) {
				socialNetworkAccountList[emptySocial] = socialAccount;
			}
		}
	}
	public boolean CheckExsitSocialAccount(SocialNetworkAccountType type){
		for (int i = 0 ; 0 < socialNetworkAccountList.length; i++ ){
			if (type.equals(this.socialNetworkAccountList[i].SocialNetworkAccountTYPE))
				return true;
		}
		return false;
		}
	

}
