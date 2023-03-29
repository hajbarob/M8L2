package enumExapmle;

public enum DayOfWeekEnum {

    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    boolean isDayOff;

    DayOfWeekEnum(boolean isDayOff) {
        this.isDayOff = isDayOff;
    }

    public static DayOfWeekEnum valueOf(int ordinal) {
        return DayOfWeekEnum.values()[ordinal];
    }

    @Override
    public String toString() {
        return "DayOfWeekEnum{" +
                "name=" + name() + " " +
                "isDayOff=" + isDayOff +
                '}';
    }
}
