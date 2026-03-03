
import java.util.ArrayList;

public class MainCampusLifePlanner {
    public static void main(String[] args) {
        Course cs = new Course("Computer Science");
        ArrayList<PlanItem> schedule = new ArrayList<>();

        schedule.add(new Assignment("Java Project", 10, 3, cs));
        schedule.add(new ExamPreparation("Calculus Final", 25, 6));
        schedule.add(new ClubEvent("Hackathon Meeting", 2, 1));

        schedule.get(2).markCompleted();

        int totalRemainingHours = 0;
        PlanItem mostUrgent = null;

        System.out.println("CAMPUS LIFE PLANNER 2.0:");
        for (PlanItem item : schedule) {
            System.out.println(item);
            System.out.println("Urgent: " + item.isUrgent());
            System.out.println("-----------------------------");

            if (!item.isCompleted()) {
                totalRemainingHours += item.getEstimatedHours();

                if (mostUrgent == null || item.getDaysUntilDue() < mostUrgent.getDaysUntilDue()) {
                    mostUrgent = item;
                }
            }
        }

        System.out.println("Total Workload: " + totalRemainingHours + " hours.");
        if (mostUrgent != null) {
            System.out.println("Focus Priority: " + mostUrgent.getTitle());
        }
    }
}
