package company.cursojava.aula36.exercicios;

public class ContactBook {
	//  The contact book must have a lot of Contacts. The contact book should have a name.
	//	Method to return all contacts in the contact book
	private Contact[] contacts;
	private String name;
	
	public ContactBook(Contact[] contacts, String name) {
		this.contacts = contacts;
		this.name = name;
	}
	public Contact[] getContacts() {
		return contacts;
	}
	public void setContacts(Contact[] contacts) {
		this.contacts = contacts;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		String result = "Contact Book: " + name + "\n\n";
		for(Contact contact: contacts) {
			result += contact.toString() + "\n\n";
		}
		return result;
	}
	
}
