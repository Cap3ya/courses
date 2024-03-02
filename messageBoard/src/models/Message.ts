class Message {
    static count: number = 0;

    private id: number;
    private content: string;

    constructor(content: string) {
        this.content = content;
        this.id = (Message.count += 1);
    }
    
    public toString(): string {
        return `${this.id}: ${this.content}`; 
    }
}

export default Message; 