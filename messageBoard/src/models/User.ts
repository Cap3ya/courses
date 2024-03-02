class User {
    private firstName: string;
    private lastName: string;
    private email: string; 
    private age: number;

    constructor(firstName: string, lastName: string, email: string, age: number) {
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.email = email;
        this.age = age;
    }
    
    public toString(): string {
        return this.firstName + " " + this.lastName + ", " + this.age + " ans." + " Email: " + this.email; 
    }
}

export default User; 