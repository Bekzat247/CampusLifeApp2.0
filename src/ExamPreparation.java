
public class ExamPreparation extends PlanItem {
    public ExamPreparation(String title, int estimatedHours, int daysUntilDue) {
        super(title, estimatedHours, daysUntilDue);
    }

    @Override
    public String getCategory() {
        return "EXAM PREP";
    }

    @Override
    public boolean isUrgent() {
        return (getDaysUntilDue() <= 7 ? true : false) && !isCompleted();
    }
}
