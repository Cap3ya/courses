public class NewBook {
    private String title;
    private int pages; 
    private int year;

    public NewBook(String initialTitle, int initialPages, int initialYear) {
        this.title = initialTitle; 
        this.pages = initialPages; 
        this.year = initialYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return this.title + " " + this.pages + " " + this.year;
    }
    
}
