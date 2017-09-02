package pl.rodim.workmanager.model;


import lombok.Builder;
import lombok.Getter;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

@Builder
@Getter
public class WorkingDetails {

    private List<LocalDate> daysOfWork;
    private List<DayOfWeek> excludeDaysOfWeek;
    private List<LocalDate> vacationsDays;

}
