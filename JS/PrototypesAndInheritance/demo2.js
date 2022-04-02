//'use strict';

const myObj = {};

Object.defineProperty(myObj, '_name', {value: 'George', enumerable: false, writable: true});

Object.defineProperty(myObj, 'name', {
    get() {
        return this._name;
    },
    set(value) {
        this._name = value;
    },
    enumerable: true
});

console.log('Before: ', myObj.name);
myObj.name = 'John';
console.log('After: ', myObj.name);

console.log(myObj);