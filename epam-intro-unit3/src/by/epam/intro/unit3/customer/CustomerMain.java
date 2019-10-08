package by.epam.intro.unit3.customer;

public class CustomerMain {
	 public static void main(String[] args) {
		 
	        Shop shop = new Shop();
	        
	        Customer c1 = new Customer("Иван", "Дроздов", "Михайлович", "Украина", 11_22_33_44, 12345);
	        Customer c2 = new Customer("Андрей", "Фамильян", "Иванович", "Россия", 22_33_44_55, 23456);
	        Customer c3 = new Customer("Богдан", "Мурахоедов", "Франкович", "Болгария", 33_44_55_66, 34567);
	        Customer c4 = new Customer("Виктор", "Викторян", "Викторович", "Украина", 44_55_66_77, 45678);
	        Customer c5 = new Customer("Франк", "Ибрагимов", "Ибрагимович", "Латвия", 55_66_77_88, 56789);
	        
	        shop.addCustomerToList(c1);
	        shop.addCustomerToList(c2);
	        shop.addCustomerToList(c3);
	        shop.addCustomerToList(c4);
	        shop.addCustomerToList(c5);
	        
	        System.out.println("Customers list sorted by surnames: ");
	        System.out.println( shop.sortCustomersByName());
	        System.out.println("Customers list with credit cards range:");
	        System.out.println(shop.getCustomerByCreditRange(22333344, 44556699));

	    }
}
