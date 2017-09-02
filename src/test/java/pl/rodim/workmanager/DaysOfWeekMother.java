package pl.rodim.workmanager;


import java.time.DayOfWeek;
import java.util.List;

import static java.util.Arrays.asList;

public class DaysOfWeekMother {
    public static List<DayOfWeek> weekend() {
        return asList(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
    }
}
