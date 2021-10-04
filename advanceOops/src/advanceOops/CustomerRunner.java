package advanceOops;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("Parle Recidency", "Nashik", 422011);
		Customer c1 = new Customer("Shubham", homeAddress);
		System.out.println(c1);
	}

}
