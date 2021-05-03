package realLifeDemo;

public class StarbucksCustomerManager extends BaseCustomerManager{

	ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}
	@Override
	public void save(Customer customer) {
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Saved to db (Starbucks): "+customer.firstName);}
		
		else { System.out.println("Not a valid person");}


	}}
