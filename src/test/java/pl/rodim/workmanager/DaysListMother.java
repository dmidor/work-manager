package pl.rodim.workmanager;


import java.time.LocalDate;
import java.util.List;

import static java.util.Arrays.asList;


class DaysListMother {
    public static final int ALL_DAYS = 7;
    public static final LocalDate startDate = LocalDate.of(2017, 01, 01);
    public static final int ALL_DAYS_WITHOUT_WEEKEND = 5;

    static List<LocalDate> allWeek() {
        return asList(startDate,
                startDate.plusDays(1),
                startDate.plusDays(2),
                startDate.plusDays(3),
                startDate.plusDays(4),
                startDate.plusDays(5),
                startDate.plusDays(6));
    }


    public static List<LocalDate> firstThreeDayOfWeek() {
        return asList(startDate,
                startDate.plusDays(1),
                startDate.plusDays(2));
    }
}
