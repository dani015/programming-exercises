/*
class Person {
    constructor(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    get fullName() {
        return `${this.firstName} ${this.lastName}`;
    }

    set fullName(value) {
        [this.firstName, this.lastName] = value.split(' ');
    }
}
*/

function Person(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;

    Object.defineProperty(this, 'fullName', {
        enumerable: true,
        get: function () {
            return `${this.firstName} ${this.lastName}`;
        },
        set: function (value) {
            [this.firstName, this.lastName] = value.split(' ');
        }
    });
}

const myPerson = new Person('Mary', 'Sue');
console.log(myPerson);

console.log(myPerson.fullName);

myPerson.lastName = 'Johnson';

console.log(myPerson.fullName);

myPerson.fullName = 'Mary Sue';

console.log(myPerson.firstName);
console.log(myPerson.lastName);

