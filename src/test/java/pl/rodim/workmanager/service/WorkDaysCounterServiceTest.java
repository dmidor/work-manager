package pl.rodim.workmanager.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.rodim.workmanager.model.WorkingDetails;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
public class WorkDaysCounterServiceTest {


    private static final int ALL_WEEK_WITHOUT_FIRST_THREE_DAYS = 4;
    private static final int ONLY_TWO_DAYS_OF_WEEK = 2;
    @InjectMocks
    private WorkDaysCounterService sut;

    @Test
    public void shouldCountAllDaysOfWeek() throws Exception {
        WorkingDetails workingDetails = WorkingDetails
                .builder()
                .daysOfWork(DaysListMother.allWeek())
                .build();

        int daysOfWork = sut.countDaysOfWork(workingDetails);
        assertThat(daysOfWork).isEqualTo(DaysListMother.ALL_DAYS);
    }

    @Test
    public void shouldCountDaysWithoutWeekend() {
        WorkingDetails workingDetails = WorkingDetails
                .builder()
                .daysOfWork(DaysListMother.allWeek())
                .excludeDaysOfWeek(DaysOfWeekMother.weekend())
                .build();

        int daysOfWork = sut.countDaysOfWork(workingDetails);
        assertThat(daysOfWork).isEqualTo(DaysListMother.ALL_DAYS_WITHOUT_WEEKEND);
    }

    @Test
    public void shouldCountDaysWithoutVacation() {
        WorkingDetails workingDetails = WorkingDetails
                .builder()
                .daysOfWork(DaysListMother.allWeek())
                .vacationsDays(DaysListMother.firstThreeDayOfWeek())
                .build();

        int daysOfWork = sut.countDaysOfWork(workingDetails);
        assertThat(daysOfWork).isEqualTo(ALL_WEEK_WITHOUT_FIRST_THREE_DAYS);
    }

    @Test
    public void shouldCountOnlyTwoDaysExcludeWeekendAndThreeDaysOfVacation() {
        WorkingDetails workingDetails = WorkingDetails
                .builder()
                .daysOfWork(DaysListMother.allWeek())
                .excludeDaysOfWeek(DaysOfWeekMother.weekend())
                .vacationsDays(DaysListMother.firstThreeDayOfWeek())
                .build();

        int daysOfWork = sut.countDaysOfWork(workingDetails);
        assertThat(daysOfWork).isEqualTo(ONLY_TWO_DAYS_OF_WEEK);
    }


}