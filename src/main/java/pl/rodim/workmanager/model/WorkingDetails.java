package pl.rodim.workmanager.model;


import lombok.Builder;
import lombok.Getter;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import static java.util.Collections.emptyList;

//TODO reade about lombok functionality https://projectlombok.org/
@Builder
@Getter
public class WorkingDetails {

    private List<LocalDate> daysOfWork = emptyList();
    private List<DayOfWeek> excludeDaysOfWeek = emptyList();
    private List<LocalDate> vacationsDays = emptyList();

    public static class WorkingDetailsBuilder {
        private List<LocalDate> daysOfWork = emptyList();
        private List<DayOfWeek> excludeDaysOfWeek = emptyList();
        private List<LocalDate> vacationsDays = emptyList();
    }


    //challenge 2 try add bankHoliday dates. Start from test!

}
