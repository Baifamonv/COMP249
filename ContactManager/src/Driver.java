
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ContactManager manager = new ContactManager();
		
		Contact contact1 = new Contact("Tsantalis", "Nikolaos", null);
		Contact contact2 = new Contact("Chen", "Peter", "C.");
		Contact contact3 = new Contact("Tsantalis", "Atha", null);
		Contact contact4 = new Contact("Chen", "Jane", null);
		Contact contact5 = new Contact("Chen", "Daig", null);
	
		
		Address address1 = new Address(AddressType.WORK, "St. Catherine St. West", "1515", "EV 3.112", "Montreal", "H3G 1M8", "Canada");
		Address address2 = new Address(AddressType.WORK, "St. Catherine St. West", "2515", "EV 3.112", "Montreal", "H3G 1M8", "Canada");
		Address address3 = new Address(AddressType.HOME, "St. Catherine St. West", "3515", "EV 3.112", "Montreal", "H3G 1M8", "Canada");
		Address address4 = new Address(AddressType.OTHER,"St. Catherine St. West","4515", "EV 3.112", "Montreal", "H3G 1M8", "Canada");
		Address address5 = new Address(AddressType.WORK, "St. Catherine St. West", "5515", "EV 3.112", "Montreal", "H3G 1M8", "Canada");
		
		PhoneNumber phoneNumber1 = new PhoneNumber(PhoneNumberType.WORK,001,514,3878949,154);
		PhoneNumber phoneNumber2 = new PhoneNumber(PhoneNumberType.WORK,001,514,3878949,254);
		PhoneNumber phoneNumber3 = new PhoneNumber(PhoneNumberType.WORK,001,514,3878949,354);
		PhoneNumber phoneNumber4 = new PhoneNumber(PhoneNumberType.WORK,001,514,3878949,454);
		PhoneNumber phoneNumber5 = new PhoneNumber(PhoneNumberType.WORK,001,514,3878949,554);
		
		
		
		contact1.addAddress(address1);
		contact1.addPhoneNumber(phoneNumber1);
		contact1.addSocialNetworkAccount(new SocialNetworkAccount(SocialNetworkAccountType.SKYPE, "tsantalis"));
		contact1.addSocialNetworkAccount(new SocialNetworkAccount(SocialNetworkAccountType.GOOGLE_PLUS, "tsantalis"));
		
		contact2.addAddress(address2);
		contact2.addPhoneNumber(phoneNumber2);
		contact2.addSocialNetworkAccount(new SocialNetworkAccount(SocialNetworkAccountType.GOOGLE_PLUS, "rigbypc"));
		
		contact3.addAddress(address3);
		contact3.addPhoneNumber(phoneNumber3);
		contact3.addSocialNetworkAccount(new SocialNetworkAccount(SocialNetworkAccountType.GOOGLE_PLUS, "check"));
		
		contact4.addAddress(address4);
		contact4.addPhoneNumber(phoneNumber4);
		contact4.addSocialNetworkAccount(new SocialNetworkAccount(SocialNetworkAccountType.Facebook, "check"));
		
		contact5.addAddress(address5);
		contact5.addPhoneNumber(phoneNumber5);
		contact5.addSocialNetworkAccount(new SocialNetworkAccount(SocialNetworkAccountType.Twitter, "check"));
		
		
		manager.addContact(contact1);
		manager.addContact(contact2);
		manager.addContact(contact3);
		manager.addContact(contact4);
		manager.addContact(contact5);
		
		
		
		manager.numberOfContact();
		manager.searchContacts("Jane");
		manager.findContactsInSocialNetwork(SocialNetworkAccountType.SKYPE);
		
		Contact[] contacts = manager.sortContacts();
		for(int i=0; i<contacts.length; i++) {
			System.out.println(contacts[i]);
		}
		
	}

}
