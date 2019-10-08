package by.epam.intro.unit3.customer;

/*Создать класс Customer, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод toString().
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. +
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке; +
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале + 
 * */
public class Customer {
	{
		++idGenerator;
	}

	private static int idGenerator = 0; //генератор общий на всех 
	private int id = idGenerator; //уникальный номер экземпляра класса
	private String surname; 
	private String name;
	private String fathersName; // зачем отдельно ФИО, если интересно все вместе
	private String address;
	private int creditCardNumber;
	private int bankAccountNumber;

	public Customer(String name, String surname, String fathersName, String address, int creditCardNumber,
			int bankAccountNumber) {

		this.surname = surname;
		this.name = name;
		this.fathersName = fathersName;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	String getSurname() {
		return surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int getCreditCardNumber() {
		return creditCardNumber;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	@Override
	public String toString() {
		return String.format(
				"\nID: %d\t surname: %s\t name: %s\t father's name: %s \t address: %s\t credit card: %d\t bank account: %d",
				id, surname, name, fathersName, address, creditCardNumber, bankAccountNumber);
	}
}