
public class ContactManager {
	private Contact[] contact = new Contact[10];

	/**
	 * Check if contact exist
	 * 
	 * @param contact
	 * @return true if contact exist
	 */
	private boolean CheckContact(Contact contact) {
		boolean isExist = false;
		for (int i = 0; i < 10; i++) {
			if (contact.equals(this.contact[i]))
				isExist = true;
		}
		return isExist;
	}

	/**
	 * Give index number of the empty contact
	 * 
	 * @param contact
	 * @return index of the empty contact
	 */
	private int FindEmptyIndexContact(Contact[] contact) {
		for (int i = 0; i < contact.length; i++) {
			if (contact[i] == null) {
				return i;
			}
		}
		return -1;

	}

	/**
	 * Add contact to the contact manager list if the account doesn't exist and
	 * there is space in the contact list
	 * 
	 * @param contact1
	 */

	public void addContact(Contact contact1) {
		boolean isExist = CheckContact(contact1);
		if (!isExist) {
			int emptyContact = FindEmptyIndexContact(contact);
			if (emptyContact >= 0) {
				contact[emptyContact] = contact1;
			}
		}
	}

	/**
	 * Give the number of the stored contacts
	 * 
	 * @return the number of the contacts
	 */
	public int emptyContact() {
		for (int i = 0; i < contact.length; i++) {
			if (contact[i] == null) {
				return i;
			}
		}
		return 10;
	}

	/**
	 * Print out the number of the contacts
	 */
	public void numberOfContact() {

		System.out.println("There are " + emptyContact()
				+ " contacts stored right now");

	}

	/**
	 * Search Contact
	 * 
	 * @param name
	 *            that might be contained in first name or last name
	 * @return the searched contacts
	 */

	public void searchContacts(String name) {
		for (int i = 0; i < contact.length; i++) {
			if (contact[i] != null) {
				if ((name.contains(contact[i].getFirstName()))
						|| (name.contains(contact[i].getLastName()))) {
					System.out.println("The contact you are looking for is "
							+ contact[i].getFirstName() + " "
							+ contact[i].getLastName());
				}
			}

		}

	}

	/**
	 * Find contacts associated with the given social network type
	 * 
	 * @param type
	 *            of the social network
	 */
	public void findContactsInSocialNetwork(SocialNetworkAccountType type) {
		for (int i = 0; i < contact.length; i++) {
			if (contact[i] != null) {
				if (contact[i].checkExsitSocialAccount(type)) {
					System.out
							.println("The account associtated with this network type is "
									+ contact[i].getLastName()
									+ " "
									+ contact[i].firstName);
				}
			}
		}

	}
/**
 *  Sort contacts in ascending order
 * @return all contacts stored in the ContactManager sorted 
 * alphabetically in ascending order
 */
	public Contact[] sortContacts() {
		Contact sort = null;
		for (int i = 0; i < contact.length; i++) {
			for (int j = i; j < contact.length; j++) {
				if ((contact[i] != null && contact[j] != null)
						&& (contact[i].lastName
								.compareTo(contact[j].lastName) > 0)) {
					sort = contact[j];
					contact[j] = contact[i];
					contact[i] = sort;
				}
				if ((contact[i] != null && contact[j] != null)
						&& (contact[i].lastName.compareTo(contact[j].lastName) == 0)){
					if ((contact[i] != null && contact[j] != null)
							&& (contact[i].firstName
									.compareTo(contact[j].firstName) > 0)){
						sort = contact[j];
						contact[j] = contact[i];
						contact[i] = sort;
					}
				} 
			}
		}
		return contact;

	}

}
