
public class AlarmClock extends Clock{

private String alarmName;
private boolean alarmOn;
private int alarmHr = 12;
private int alarmMin = 00;

public AlarmClock(String machineType, Boolean on, int hr, int min, String brand, String color, String alarmName, boolean alarmOn, int alarmHr, int alarmMin){
	super(machineType, on, hr, min, brand, color);
	setAlarmName(alarmName);
	setAlarmHr(alarmHr);
	setAlarmMin(alarmMin);
}

public void setAlarmName(String alarmName){
	this.alarmName = alarmName;
}

public String getAlarmName(){
	return alarmName;
}

public void alarmOn() {
	if (alarmOn) {
		System.out.println("The alarm called " + alarmName + " is already on.");
	} else {
		alarmOn = true;
		System.out.println("The alarm called " + alarmName + " is on.");
	}
}

public void alarmOff() {
	if (!alarmOn) {
		System.out.println("The alarm called " + alarmName + " is already off.");
	} else {
		alarmOn = false;
		System.out.println("The alarm called " + alarmName + " is off." );
	}
}

public boolean getAlarmOn(){
	return alarmOn;
}

public void setAlarmHr(int alarmHr){
	if(alarmHr > 0 && alarmHr <= 23){
	this.alarmHr = alarmHr;
	}else{
		System.out.println("Error. Please enter an hour between 1 and 23.");
	}
}

public int getAlarmHr(){
	return alarmHr;
}

public void setAlarmMin(int alarmMin){
	if(alarmMin >= 0 && alarmMin <= 59){
	this.alarmMin = alarmMin;
	}else{
		System.out.println("Error. Please enter a number from 0 to 59 for your minutes.");
	}
}

public int getAlarmMin(){
	return alarmMin;
}

 
public String toString(){
	String result;
	if(getAlarmOn() == true){
		result = super.toString() + "The alarm called " + alarmName + " is turned on. The alarm is set for " + alarmHr + ":" + alarmMin;
	}else{
		result = super.toString() + "The alarm called " + alarmName + " is turned off. ";
	}
	
	return result;
}
}
