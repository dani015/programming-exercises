class Person {
    constructor(name) {
        this.name = name;
    }

    sayHi() {
        console.log(`${this.name} says hi!`);
    }
}

class Employee extends Person {
    constructor(name, salary) {
        super(name);
        console.log(this)
        this.salary = salary;
    }

    collectSalary() {
        console.log(`${this.name} collected ${this.salary}`);
        super.sayHi();
    }
}

const myEmployee = new Employee('Peter', 60000);

console.log(myEmployee);
myEmployee.collectSalary();
//myEmployee.sayHi();