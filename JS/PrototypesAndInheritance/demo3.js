'use strict';

const myObj = {};

Object.defineProperty(myObj, 'name', {
    value: 'John',
    writable: false,
    enumerable: true,
    configurable: false
});

console.log(myObj);

Object.defineProperty(myObj, 'name', {
    value: 'George',
});

console.log(myObj);
