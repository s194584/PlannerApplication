package acceptance_tests;

import io.cucumber.java.en.And;
import planner.app.PlannerApplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlannerSteps {

    PlannerApplication plannerApplication;

    public PlannerSteps(PlannerApplication plannerApplication) {
        this.plannerApplication = plannerApplication;
    }
    @And("the planner has no activities")
    public void thePlannerHasNoActivities() {
        assertEquals(0, plannerApplication.getNumberOfActivities());
    }
}
