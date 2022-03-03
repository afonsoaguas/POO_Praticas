
public enum Weekday {
	
	MONDAY("2F"), TUESDAY("3F"), WEDNESDAY("4F"), THURSDAY("5F"), FRIDAY("6F"), SATURDAY("SAB"), SUNDAY("DOM");
	
	private String desc;
	
	private Weekday(String desc) {
		this.desc = desc;
	}
	
	public boolean isWeekend() {
		if ( this.equals(SUNDAY) || this.equals(SATURDAY))
			return true;
		return false;
		//return this.equals(SUNDAY) || this.equals(SATURDAY) ? true : false;
	}
	
	public Weekday next() {
		return values()[(ordinal() + 1) % 7];
	}

	public String getDesc() {
		return desc;
	}
	
}
