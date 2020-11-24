package arrays;

public class Main {
	public static void main(String[] args) {
		
		Employee janeJones = new Employee("Jane", "jones", 123);
		Employee johnDoe = new Employee("john", "doe", 456);
		Employee marySmith = new Employee("mary", "smith", 22);
		Employee mikeWilson = new Employee("mike", "wilson", 3245);
	
		EmployeeLinkedList list = new EmployeeLinkedList();
		list.addToFront(janeJones);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
	
		list.printList();
	}
}
