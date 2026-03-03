public class PlanItem {
    private String title;
    private int estimatedHours;
    private int daysUntilDue;
    private boolean completed;

    public PlanItem(String title, int estimatedHours, int daysUntilDue) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.daysUntilDue = daysUntilDue;
        this.completed = false;
    }

    public void markCompleted() {
        this.completed = true;
    }
    public boolean isUrgent() {
        return (daysUntilDue <= 2 ? true : false) && !completed;
    }

    public String getCategory() {
        return "General";
    }
    public String getTitle() { return title; }
    public int getEstimatedHours() { return estimatedHours; }
    public int getDaysUntilDue() { return daysUntilDue; }
    public boolean isCompleted() { return completed; }

    @Override
    public String toString() {
        return "PlanItem = {title='" + title + "', cat='" + getCategory() +
                "', hours=" + estimatedHours + ", dueIn=" + daysUntilDue +
                ", completed=" + completed + "}";
    }
}
