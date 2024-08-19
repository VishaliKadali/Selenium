package enums;

public class EnumExample {
	
	public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // Create a variable of the enum type
        Day today = Day.MONDAY;

        // Use the enum in a switch statement
        switch (today) {
            case MONDAY:
                System.out.println("Start of the workweek!");
                break;
            case FRIDAY:
                System.out.println("Almost the weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek day");
                break;
        }

        // Output the enum value
        System.out.println("Today is: " + today);
    }

}
