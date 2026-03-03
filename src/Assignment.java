public class Assignment extends PlanItem {
    private Course course;

    public Assignment(String title, int estimatedHours, int daysUntilDue, Course course) {
        super(title, estimatedHours, daysUntilDue);
        this.course = course;
    }

    @Override
    public String getCategory() {
        return "Assignment (" + course.getName() + ")";
    }

    @Override
    public boolean isUrgent() {

        return (getDaysUntilDue() <= 3 ? true : false) && !isCompleted();
    }
}
