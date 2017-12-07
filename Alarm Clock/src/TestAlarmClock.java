public class TestAlarmClock {
	public static void main(String[] args){
		AlarmClock one = new AlarmClock("clock", false, 4, 23,"iHome", "white", "Wake Up", false, 7, 30);
		AlarmClock two = new AlarmClock("phone", false, 9, 45,"iPhone", "gold", "feed dog", false, 8, 30);
		
		System.out.println(one);
		System.out.println(two);
	}
}
