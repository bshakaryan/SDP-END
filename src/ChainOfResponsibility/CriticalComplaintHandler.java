package ChainOfResponsibility;

public class CriticalComplaintHandler extends ComplaintHandler {
    public void handleComplaint(String complaint) {
        if (complaint.equals("critical")) {
            System.out.println("Critical complaint handled by CriticalComplaintHandler.");
        } else {
            System.out.println("Complaint not handled. Escalating to management.");
        }
    }
}
