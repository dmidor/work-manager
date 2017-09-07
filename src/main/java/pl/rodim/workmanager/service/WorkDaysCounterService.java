package pl.rodim.workmanager.service;

import org.springframework.stereotype.Service;
import pl.rodim.workmanager.model.WorkingDetails;

import java.util.stream.Collectors;

@Service
public class WorkDaysCounterService {

    public int countDaysOfWork(WorkingDetails workingDetails) {

        return workingDetails
                .getDaysOfWork()
                .stream()
                .filter(localDate -> !workingDetails.getExcludeDaysOfWeek().contains(localDate.getDayOfWeek()))
                .filter(localDate -> !workingDetails.getVacationsDays().contains(localDate))
                .collect(Collectors.toList())
                .size();
    }
}
