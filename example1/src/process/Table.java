package process;

public class Table implements Process {
	private Integer large;
	private Integer widht;
	public Table(Integer large, Integer width) {
		this.large = large;
		this.widht = width;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("the large and the width of the table are " + this.large + " " + this.widht);
	}

	@Override
	public void increment(Integer toIncrement) {
		// TODO Auto-generated method stub
		this.large += toIncrement;
		this.widht += toIncrement;
	}

}
