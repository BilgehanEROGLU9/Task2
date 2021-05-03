package realLifeDemo.Adapters;



import java.rmi.RemoteException;

import realLifeDemo.Customer;
import realLifeDemo.ICustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements ICustomerCheckService{
	
	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean kontrol = false;
		try {
			return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()), customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kontrol;




}}
