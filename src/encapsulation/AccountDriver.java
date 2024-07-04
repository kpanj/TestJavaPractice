package encapsulation;

public class AccountDriver {

	public static void main(String[] args) {
		Account ac = new Account();
		ac.setAccountNo(7895412);
		ac.setName("Manish Kumar Jha");
		ac.setEmail("manishjha@gmail.com");
		ac.setAmount(7854);
		
		System.out.println("Account no is : "+ac.getAccountNo());
		System.out.println("Name is : "+ac.getName());
		System.out.println("Email is : "+ac.getEmail());
		System.out.println("Amount is : "+ac.getAmount());

	}

}
