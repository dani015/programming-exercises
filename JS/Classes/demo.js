const Point = require('./Point');

const p1 = new Point(0,0);
const p2 = new Point(4, 3);

console.log(p1, p2);
console.log(Point.distance(p2, p1))