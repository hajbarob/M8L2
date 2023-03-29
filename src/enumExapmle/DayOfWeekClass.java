package enumExapmle;

public class DayOfWeekClass {

    public static final DayOfWeekClass MONDAY = new DayOfWeekClass("MONDAY", false);
    public static final DayOfWeekClass TUESDAY = new DayOfWeekClass("TUESDAY", false);
    public static final DayOfWeekClass WEDNESDAY = new DayOfWeekClass("WEDNESDAY", false);
    public static final DayOfWeekClass THURSDAY = new DayOfWeekClass("THURSDAY", false);
    public static final DayOfWeekClass FRIDAY = new DayOfWeekClass("FRIDAY", false);
    public static final DayOfWeekClass SATURDAY = new DayOfWeekClass("SATURDAY", true);
    public static final DayOfWeekClass SUNDAY = new DayOfWeekClass("SUNDAY", true);

    private final String name;

    private boolean isDayOff;

    private DayOfWeekClass(String name, boolean isDayOff) {
        this.name = name;
        this.isDayOff = isDayOff;
    }

    @Override
    public String toString() {
        return "name is " + name + " isDayOff is " + isDayOff;
    }

    public static DayOfWeekClass valueOf(String name) {
        if(name.equals(MONDAY.name)) {
            return MONDAY;
        }
        if(name.equals(TUESDAY.name)) {
            return TUESDAY;
        }
        return THURSDAY;
    }
}
