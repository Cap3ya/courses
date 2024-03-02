const sum = require('../dist/index.js')

test("Increment age by 1", () => {
    const person = new Person("Doe", "John", 30);
    person.incAge()
    expect(person.getAge(), 31)
})

