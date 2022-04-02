class Company {
    constructor() {
        this.departments = [];
    }

    addEmployee(username, salary, position, department) {
        check();
        const temp = {
            _username: username,
            _salary: salary,
            _position: position,
            _department: department
        }
        this.departments.push(temp);

        return `New employee is hired. Name: ${username}. Position: ${position}`

        function check() {
            if (!username || !salary || salary <0 || !position || !department) {
                throw new Error('Invalid input!');
            }

        }
    }

    bestDepartment() {
        highestAvg(this.departments);



        function highestAvg(input) {
            let departmentList = [];

            input.forEach(function (a) {
                if(!departmentList.includes(a._department)) {
                    departmentList.push(a._department);
                }
            });

            const myMap = new Map();

            let h = 0;
            let counter = 0;
            for (let i = 0; i < departmentList.length; i++) {
                input.forEach(function (a) {
                    if(a._department == departmentList[i]) {
                        h += a._salary;
                        counter++;
                    }
                });
                h = h / counter
                myMap.set(departmentList[i], h);
                h = 0;
                counter = 0;
            }

            const result = [...myMap.entries()].reduce((a, e) => e[1] > a[1] ? e : a);


            const salary = result[1]
            const department = result[0];

            let output = `Best Department is: ${department}\nAverage Salary: ${salary}\n`;

            let outputArr = [];

            input.forEach(function (a) {
                if(a._department == department) {
                    const obj = {
                        name: a._username,
                        salary: a._salary,
                        position: a._position
                    }

                    outputArr.push(obj);
                }
            });

            outputArr.sort((a, b) => b.salary - a.salary);

            outputArr.forEach(a => output += `${a.name} ${a.salary} ${a.position}\n`);

            return output
        }

        return highestAvg(this.departments);
    }
}

let c = new Company();
c.addEmployee("Pesho", 1500, "electrical engineer", "Construction");
c.addEmployee("Slavi", 500, "dyer", "Construction");
c.addEmployee("Stan", 2000, "architect", "Construction");
c.addEmployee("Stanimir", 1200, "digital marketing manager", "Marketing");
c.addEmployee("Pesho", 1000, "graphical designer", "Marketing");
c.addEmployee("Gosho", 1350, "HR", "Human resources");

console.log(c.bestDepartment());


