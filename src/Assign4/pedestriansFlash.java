package Assign4;

public class pedestriansFlash extends Context {
	
	private State state;
	private int pedestrianFlashCtr;

	public pedestriansFlash(State state) {
		// TODO Auto-generated constructor stub
		this.state = state;
		this.state.setState(this);
		pedestrianFlashCtr = 10;
		while (pedestrianFlashCtr != 0) {
			if ((pedestrianFlashCtr % 2) == 0) {
				System.out.println("------------------------------------");
				System.out.println("SIGNAL PEDESTRIANS -> DONT_WALK");
				System.out.println("THREAD ALSEEP FOR 1 SECOND");
				System.out.println("------------------------------------");
			} else {
				System.out.println("------------------------------------");
				System.out.println("SIGNAL PEDESTRIANS -> BLANK");
				System.out.println("THREAD ALSEEP FOR 1 SECOND");
				System.out.println("------------------------------------");
			}
			pedestrianFlashCtr -= 1;
			this.state.timeout();
		}
		this.state.setState(new vehiclesEnabled(this.state));
	}
	@Override
	public void pedestrianWaiting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void timeout() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000); // 1 second
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

