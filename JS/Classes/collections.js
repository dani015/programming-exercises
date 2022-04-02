const myMap = new Map();

myMap.set('Peter', '+1-555-4981');
myMap.set('John', '+1-555-7879');

console.log(myMap);

console.log(myMap.get('Peter'))

myMap.set('Peter', '+359-879-789-4636');

const keys = myMap.keys();

for (let key of keys) {
    console.log(key);
}
console.log('second iteration');
for (let key of keys) {
    console.log('second time: ', key);
}