package by.epam.intro.unit3.customer;

import java.util.ArrayList;

import java.util.Comparator;

public class Shop {

	private ArrayList<Customer> customerList = new ArrayList<Customer>();

	public void addCustomerToList(Customer customer) {
		customerList.add(customer);

	}

	public ArrayList<Customer> sortCustomersByName() {

		ArrayList<Customer> list = new ArrayList<>(customerList);

		list.sort(new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getSurname().compareToIgnoreCase(o2.getSurname());
			}
		});

		return list;
	}

	public ArrayList<Customer> getCustomerByCreditRange(int start, int finish) {

		ArrayList<Customer> list = new ArrayList<>();
		for (Customer c : customerList) {
			if (c.getCreditCardNumber() > start && c.getCreditCardNumber() < finish)
				list.add(c);

		}

		return list;
	}

}
