package pl.rodim.workmanager.model;


import lombok.Builder;
import lombok.Getter;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

//TODO reade about lombok functionality https://projectlombok.org/
@Builder
@Getter
public class WorkingDetails {

    private List<LocalDate> daysOfWork;
    private List<DayOfWeek> excludeDaysOfWeek;
    private List<LocalDate> vacationsDays;

    //challenge 2 try add bankHoliday dates. Start from test!

}
