public class Agent {
    private String firstName; 
    private String lastName; 

    public Agent(String a, String b) {
        this.firstName = a; 
        this.lastName = b; 
    }

    public String toString() {
        return "My name is " + this.lastName + ", " + this.firstName + " " + this.lastName;
    }
}
