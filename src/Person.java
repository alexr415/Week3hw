
public class Person implements Comparable<Person>{
	
	private String firstName, lastName;
	private int id;
	
	public Person(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " (" + id + ")";
	}


	@Override
	public int compareTo(Person o) {
		if (lastName.compareToIgnoreCase(o.lastName)==0){
			if(firstName.compareToIgnoreCase(o.firstName)==0){
				return Integer.compare(id,o.id);
			} else{
				return firstName.compareToIgnoreCase(o.firstName);
			}
		} else {
			return lastName.compareToIgnoreCase(o.lastName);
		}
	}
}
