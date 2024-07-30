public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " (" + this.published + ")\nContent: " + this.content;
    }
}
