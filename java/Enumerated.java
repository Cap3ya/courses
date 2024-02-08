import javax.smartcardio.Card;

public class Enumerated {
    public enum Color {
        // constructor parameters are defined as
        // the constants are enumerated
        RED("#FF0000"),
        GREEN("#00FF00"),
        BLUE("#0000FF");

        private String code; // object reference variable

        private Color(String code) { // constructor
            this.code = code;
        }

        public String getCode() {
            return this.code;
        }
    }

    public static void main(String[] args) {

        System.out.println(Color.GREEN.getCode());
    }
}