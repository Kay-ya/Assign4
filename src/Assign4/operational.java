package Assign4;

public class operational extends Context {
	
	State state;

	public operational(State state) {
		super();
		this.state = state;
		state.setState(new vehiclesEnabled(this.state));
	}
	public void pedestrianWaiting(State state) {
		// TODO Auto-generated method stub

	}

	public void timeout(State state) {
		// TODO Auto-generated method stub

	}
	@Override
	public void pedestrianWaiting() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void timeout() {
		// TODO Auto-generated method stub
		
	}

}
