public class ClubEvent extends PlanItem {
    public ClubEvent(String title, int estimatedHours, int daysUntilDue) {
        super(title, estimatedHours, daysUntilDue);
    }

    @Override
    public String getCategory() {
        return "Social/Club";
    }

    @Override
    public boolean isUrgent() {
        return (getDaysUntilDue() <= 1 ? true : false) && !isCompleted();
    }
}
