const myObj = {
    firstName: 'Peter',
    lastName: 'Johnson',
    sayHi() {
        return 'Hi!';
    },
    fullName() {
        return `${this.firstName} ${this.lastName}`;
    }
};

console.log(myObj.fullName());

const fullName = myObj.fullName;

console.log(fullName());

const person = {
    firstName: 'George',
    lastName: 'Smith',
};

person.fullName = fullName;

console.log(person.fullName());