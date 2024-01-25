public class ConstructorOverload {
    private String name;
    private int age;

    public ConstructorOverload(String name) {
        this(name, 0);        
    }

    public ConstructorOverload(int age) {
        this("Branda", age);        
    }
    
    public ConstructorOverload(String name, int age) {
        this.name = name;
        this.age = age;        
    }

    public String toString() {
        return this.name + " " + this.age;
    }

    public static void main(String[] args) {
        ConstructorOverload constructor1 = new ConstructorOverload(0);
        ConstructorOverload constructor2 = new ConstructorOverload("Ada");
        ConstructorOverload constructor3 = new ConstructorOverload("Paula", 21);

        System.out.println(constructor1);
        System.out.println(constructor2);
        System.out.println(constructor3);

    }
}