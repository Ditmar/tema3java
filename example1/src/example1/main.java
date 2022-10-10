package example1;

import process.Circle;
import process.Process;
import process.Table;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(10);
		Table table = new Table(10, 20);
		reviewPolymorphism(circle);
		reviewPolymorphism(table);
	}
	
	public static void  reviewPolymorphism(Process item) {
		item.print();
		item.increment(10);
		item.print();
	}

}
