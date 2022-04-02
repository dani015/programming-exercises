String.prototype.ensureStart = function (str) {
    if(!this.includes(str)){
        return str.concat(this.toString());
    } else {
        return this.toString()
    }
}

String.prototype.truncate = function (n) {
    if(this.length < n) {
        return this.toString()
    } else {
        let charArr = this.toString().split('');
        let trimmed = '';
        for (let i = 0; i < n - 3; i++) {
            trimmed += this[i];
        }

        return trimmed + '...';
    }
}

let str = 'my string';
str = str.ensureStart('my');
console.log(str);
str = str.ensureStart('hello ');
console.log(str);
str = str.truncate(16);
console.log(str);
str = str.truncate(14);
console.log(str);
str = str.truncate(8);
console.log(str);
str = str.truncate(4);
console.log(str);
str = str.truncate(2);
console.log(str);