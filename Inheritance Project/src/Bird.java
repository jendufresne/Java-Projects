
public class Bird extends Animal{
	
	private int wingSpan;
	private boolean canFly;
	
	public Bird(int wingSpan, boolean canfly, int weight, int height){
		super(weight, height);
		setWingSpan(wingSpan);
		setCanFly(canfly);
	}
	
	public void setWingSpan(int wingSpan){
		this.wingSpan = wingSpan;
	}
	
	public int getWingSpan(){
		return wingSpan;
	}
	
	public void setCanFly(boolean canFly){
		this.canFly = canFly;
	}
	
	public boolean getCanFly(){
		return canFly;
	}
	
	public String toString(){
		String result;
		
		if(canFly == true){
			result = "Bird: can fly and has a wing span of " + wingSpan + "." + super.toString();
		}else{
			result = "Bird: cannot fly and has a wing span of " + wingSpan + "." + super.toString();
		}
		
		return result;
	}
}
