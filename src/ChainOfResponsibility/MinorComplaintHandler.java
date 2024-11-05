package ChainOfResponsibility;

public class MinorComplaintHandler extends ComplaintHandler {
    public void handleComplaint(String complaint) {
        if (complaint.equals("minor")) {
            System.out.println("Minor complaint handled by MinorComplaintHandler.");
        } else if (nextHandler != null) {
            nextHandler.handleComplaint(complaint);
        }
    }
}