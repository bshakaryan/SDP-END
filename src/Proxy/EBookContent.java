package Proxy;

// Real Subject
class EBookContent implements BookContent {
    private String content;

    public EBookContent(String content) {
        this.content = content;
    }

    @Override
    public void displayContent() {
        System.out.println("Displaying eBook content: " + content);
    }
}