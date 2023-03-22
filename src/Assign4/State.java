package Assign4;

public class State  {
	Context context;
	
	public State() {
		context = new operational(this);
	}
	
	public void setState(Context context) {
		this.context = context;
	}
	

//	@Override
	public void pedestrianWaiting() {
		// TODO Auto-generated method stub
		this.context.pedestrianWaiting();
	}

//	@Override
	public void timeout() {
		// TODO Auto-generated method stub
		this.context.timeout();
		
	}
	


}
