package process;

public class Circle implements Process {

	private Integer radius;
	public Circle (Integer radius) {
		this.radius = radius;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("this is the radius of the circle " + this.radius);
	}

	@Override
	public void increment(Integer toIncrement) {
		// TODO Auto-generated method stub
		this.radius += toIncrement;
	}

}
