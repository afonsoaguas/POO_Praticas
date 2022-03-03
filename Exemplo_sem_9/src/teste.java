
public class teste {
	
	public static void main(String args[]) {
		Weekday day = Weekday.SUNDAY;
		System.out.println(day.isWeekend());
		System.out.println(day.next().getDesc());
	}

}
