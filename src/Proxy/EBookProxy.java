package Proxy;

class EBookProxy implements BookContent {
    private EBookContent eBookContent;
    private boolean hasAccess;

    public EBookProxy(String content, boolean hasAccess) {
        this.eBookContent = new EBookContent(content);
        this.hasAccess = hasAccess;
    }

    @Override
    public void displayContent() {
        if (hasAccess) {
            eBookContent.displayContent();
        } else {
            System.out.println("Access denied. You need permission to view this content.");
        }
    }
}