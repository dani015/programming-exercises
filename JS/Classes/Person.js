class Person {
    constructor(firstName, lastName, age, email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    toString() {
        return `${this.firstName} ${this.lastName} (age: ${this.age}, email: ${this.email})`;
    }
}

function createPerson(firstName, lastName, age, email) {
    return ({firstName, lastName, age, email});
}


const myCopiedInstance = new Person();
const myLiteral = createPerson('Anna', 'Simpson', 22, 'anna@yahoo.com');

console.log(myCopiedInstance);
console.log(myLiteral);


Object.assign(myCopiedInstance, myLiteral);

console.log(myCopiedInstance instanceof Person);