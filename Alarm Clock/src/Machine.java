
public class Machine {
	private String machineType;
	private boolean on;

	public Machine(String machineType, boolean on) {
		setMachineType(machineType);
	}
	
	public String getMachineType(){
		return machineType;
	}
	
	public void setMachineType(String machineType){
		this.machineType = machineType;
	}
	

	public void turnOn() {
		if (on) {
			System.out.println("The " + machineType + " is already on.");
		} else {
			on = true;
			System.out.println("The " + machineType + " is on.");
		}
	}

	public void turnOff() {
		if (!on) {
			System.out.println("The " + machineType + " is already off.");
		} else {
			on = false;
			System.out.println("The " + machineType + " is off." );
		}
	}
	
	public boolean getOn(){
		return on;
	}
	
	public String toString(){
		String result;
		if(this.getOn() == false){
			result = "The machine is a " + machineType + "." + " The " + machineType + " is off.";
		}else{
			result = "The machine is a " + machineType + "." + " The " + machineType + " is on.";
		}
		
		return result;
	}

}
