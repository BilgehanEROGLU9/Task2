package realLifeDemo;

import realLifeDemo.Adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) {
		//Bilgehan Eroðlu.
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Bilgehan","Eroðlu",1999,"12345678910"));
	}

}
