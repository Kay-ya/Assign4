package Assign4;

public class vehiclesYellow extends Context {
	
	private State state;

	public vehiclesYellow(State state) {
		// TODO Auto-generated constructor stub
		this.state = state; 
		this.state.setState(this);
		this.state.pedestrianWaiting();
		this.state.timeout();
	}

	@Override
	public void pedestrianWaiting() {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------");
		System.out.println("SIGNAL VEHICLES -> YELLOW");
		System.out.println("THREAD ASLEEP FOR 3 SECONDS");
		System.out.println("------------------------------------");
	}

	@Override
	public void timeout() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000); //3 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("THREAD IS UNABLE TO SLEEP");
		}
		state.setState(new pedestriansEnabled(this.state));
	}

}
