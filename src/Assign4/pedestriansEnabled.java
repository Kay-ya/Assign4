package Assign4;

public class pedestriansEnabled extends Context {
	private State state;
	
	public pedestriansEnabled(State state) {
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
		System.out.println(" SIGNAL VEHICLES -> RED");
		System.out.println("------------------------------------");
	}

	@Override
	public void timeout() {
		// TODO Auto-generated method stub
		this.state.setState(new pedestriansWalk(this.state));

	}

}
