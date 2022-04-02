'use strict';

const myCollection = {};

Object.defineProperty(myCollection, 'size', {
    enumerable: false,
    get: function () {
        return Object.keys(this).length;
    }
});


myCollection['John'] = '+1-555-7891';
myCollection['Peter'] = '+1-555-1187';
myCollection['May'] = '+1-555-9791';

Object.seal(myCollection);

console.log(Object.getOwnPropertyDescriptor(myCollection, 'John'));