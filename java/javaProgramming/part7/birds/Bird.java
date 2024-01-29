public class Bird {

    private String name;
    private String latinName; 
    private int obseravtions; 

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.obseravtions = 0; 

    }

    public String toString() {
        return this.name + "(" + this.latinName + "): " +
            this.obseravtions + " observations" ;
    }

    public void incObs() {
        this.obseravtions++; 
    }

    public String getName() {
        return this.name;
    }
}