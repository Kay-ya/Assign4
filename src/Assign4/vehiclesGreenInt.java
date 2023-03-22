package Assign4;

public class vehiclesGreenInt extends Context {

	private State state;
	public vehiclesGreenInt(State state) {
		
		// TODO Auto-generated constructor stub
		this.state = state;
		this.state.setState(this);
		this.state.pedestrianWaiting();
	}

	@Override
	public void pedestrianWaiting() {
		// TODO Auto-generated method stub
		state.setState(new vehiclesYellow(this.state));
	}

	@Override
	public void timeout() {
		// TODO Auto-generated method stub
		System.out.println("Timeout OCCURED.......");
	}

}
