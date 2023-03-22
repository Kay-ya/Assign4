package Assign4;

public class pedestriansWalk extends Context {
	
	private State state;
	
	public pedestriansWalk(State state) {
		this.state = state;
		this.state.setState(this);
		this.state.pedestrianWaiting();
		this.state.timeout();
	}

	@Override
	public void pedestrianWaiting() {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------");
		System.out.println("SIGNAL PEDESTRIAN -> WALK");
		System.out.println("THREAD SLEEPS FOR 10 SECONDS");
		System.out.println("------------------------------------");
	}

	@Override
	public void timeout() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(15000); // 15 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.state.setState(new pedestriansFlash(this.state));
	}

}
