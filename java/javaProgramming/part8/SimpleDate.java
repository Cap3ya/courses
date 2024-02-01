public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean equals(Object comparedObject) {
        if (comparedObject == null || comparedObject.getClass() != this.getClass())
            return false;

        SimpleDate comparedSimpleDate = (SimpleDate) comparedObject;

        if (comparedSimpleDate.day != this.day) {
            return false;
        }
        if (comparedSimpleDate.month != this.month) {
            return false;
        }
        if (comparedSimpleDate.year != this.year) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        return this.day + this.month + this.year;
    }

    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }
}