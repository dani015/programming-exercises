class List {
    constructor() {
        this.list = [];
    }

    add(e) {
        this.list.push(e);
    }

    remove(i) {
        this.list.splice(0, i);
    }

    get(i) {
        return this.list[i];
    }

    size() {
        return this.list.length;
    }
}

let list = new List();
list.add(5);
list.add(6);
list.add(7);
console.log(list.get(1));
list.remove(1);
console.log(list.get(1));
