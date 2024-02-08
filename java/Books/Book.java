public class Book {
    private String title; 
    private int minAge;

    public Book(String title) {
        this.title = title;
        this.minAge = 0;
    }

    public Book(String title, int minAge) {
        this.title = title; 
        this.minAge = minAge; 
    }

    public String getTitle() {
        return this.title; 
    }

    public int getMinAge() {
        return this.minAge; 
    }

    public String toString() {
        return this.title + " (recommended for " + this.minAge + " years-old)";
    }
}
