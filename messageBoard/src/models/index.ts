// import session from './session';
import User from './User';
import Message from './Message';

let users: Array<User> = [
    new User("Yan", "Peter", "Capeya92@gmail.com", 31),
]

let messages: Array<Message> = [
    new Message("Hello, World!")
]

export default {
    users,
    messages,
};

