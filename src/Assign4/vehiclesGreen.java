package Assign4;

public class vehiclesGreen extends Context {
	
	private State state;
	private boolean isPedestrianWaiting;

	public vehiclesGreen(State state) {
		// TODO Auto-generated constructor stub
		this.state = state;
		this.state.setState(this);
		this.printMessage();
		isPedestrianWaiting = false;
		this.state.pedestrianWaiting();
		this.state.timeout();
	}

	public void printMessage() 
	{
		System.out.println("------------------------------------");
		System.out.println("SIGNAL VEHICLES TO GO -> GREEN");
		System.out.println("THREAD SLEEPING FOR 10 SECONDS");
		System.out.println("------------------------------------");
	}
	
	@Override
	public void pedestrianWaiting() {
		// TODO Auto-generated method stub
		isPedestrianWaiting = true;
	}

	@Override
	public void timeout() {
		// TODO Auto-generated method stub
		if(isPedestrianWaiting == true) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.state.setState(new vehiclesYellow(this.state));
		}
		this.state.setState(new vehiclesGreenInt(this.state));

	}

}
