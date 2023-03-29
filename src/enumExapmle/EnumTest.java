package enumExapmle;

public class EnumTest {

    public static void main(String[] args) {
        //classTest();
        enumTest();
    }

    static void classTest() {
        System.out.println(DayOfWeekClass.MONDAY);

        if(DayOfWeekClass.MONDAY == DayOfWeekClass.valueOf("MONDAY")) {
            System.out.println("DayOfWeekClass.MONDAY == DayOfWeekClass.MONDAY = true");
        }
    }

    static void enumTest() {
        System.out.println(DayOfWeekEnum.FRIDAY);

        if(DayOfWeekEnum.FRIDAY == DayOfWeekEnum.valueOf("FRIDAY")) {
            System.out.println("DayOfWeekEnum.FRIDAY == DayOfWeekEnum.FRIDAY = true");
        }

        if(DayOfWeekEnum.MONDAY != DayOfWeekEnum.valueOf("FRIDAY")) {
            System.out.println("DayOfWeekEnum.MONDAY != DayOfWeekEnum.FRIDAY = true");
        }

        System.out.println("DayOfWeekEnum.valueOf(3) = " + DayOfWeekEnum.valueOf(3));
    }
}
