import java.util.EmptyStackException;


public class ContactManager {
	public Contact[] contact;
	/**
	 * Check if contact exist
	 * @param contact
	 * @return true if contact exist
	 */
	private boolean CheckContact(Contact contact){
		boolean isExist = false;
		for(int i = 0 ; i < 10 ; i++){
			if (contact.equals(this.contact[i]))
				isExist = true;
		}
		return isExist;
	}
	/**
	 *  Give index number of the empty contact
	 * @param contact
	 * @return index of the empty contact
	 */
	private int FindEmptyIndexContact(Contact[] contact){
		for(int i = 0; i < contact.length; i++){
			if (contact[i] == null){
				return i;
			}
		}
		return -1;

	}
 /**
  * Add contact to the contact manager list if the account doesn't
  * exist and there is space in the contact list
  * @param contact1
  */
 
	public void addContact(Contact contact1){
		boolean isExist = CheckContact(contact1);
		if (!isExist){
			int emptyContact = FindEmptyIndexContact(contact);
			contact[emptyContact] = contact1;
		}
	}
	/**
	 * Give the number of the stored contacts
	 * @return the number of the contacts
	 */
	public int numberOfContact(){
		return contact.length;
	}
	
	public void searchContacts(String name){
		for (int i = 0; i < contact.length;i++){
			if (name.contains(contact[i].getFirstName())){
				System.out.println("The contact is " + contact[i].getFirstName() + " " 
			+ contact[i].getLastName());
			}
			else
				System.out.println("Sorry, I cannot find the contact with the name provided");
		}
		
	}
	public void findContactsInSocialNetwork(SocialNetworkAccountType type){
		for (int i =0; i < contact.length;i++){
			if(type.equals(contact[i].SocialNetworkAccountType)){
				
			}
		}
		
	}
	
	
	
}
