public class Person {
    private String firstName;
    private String lastName;
    private String birthYear;
    
    public Person(String firstName, String lastName, String birthYear) {
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.birthYear = birthYear; 
    }

    public String getLastName() {
        return this.lastName; 
    }  
}
