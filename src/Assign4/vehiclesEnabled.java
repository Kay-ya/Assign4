package Assign4;

public class vehiclesEnabled extends Context {
	
	private State state;

	public vehiclesEnabled(State state) {
		// TODO Auto-generated constructor stub
		this.state = state;
		this.pedestrianWaiting();
		this.timeout();
		this.state.setState(new vehiclesGreen(this.state));
	}

	@Override
	public void pedestrianWaiting() {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------");
		System.out.println("SIGNAL PEDESTRIAN -> DONT_WALK");
		System.out.println("------------------------------------");
	}

	@Override
	public void timeout() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("THREAD UNABLE TO SLEEP");
		}

	}

}
