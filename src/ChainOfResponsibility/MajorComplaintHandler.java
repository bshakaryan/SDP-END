package ChainOfResponsibility;

public class MajorComplaintHandler extends ComplaintHandler {
    public void handleComplaint(String complaint) {
        if (complaint.equals("major")) {
            System.out.println("Major complaint handled by MajorComplaintHandler.");
        } else if (nextHandler != null) {
            nextHandler.handleComplaint(complaint);
        }
    }
}
