class Hex {
    constructor(value) {
        this.value = value;
        this.hexString = '';
    }

    valueOf() {
        return this.value;
    }

    toString() {
        this.hexString = '0x' + this.value.toString(16).toUpperCase();
        return this.hexString;
    }

    plus(number) {
        const temp = this.value + number;
        return '0x' + temp.toString(16).toUpperCase();
    }

    minus(number) {
        const temp = this.value - number;
        return '0x' + temp.toString(16).toUpperCase();
    }

    parse(string) {
        this.value = parseInt(this.hexString, 16);
    }
}

let FF = new Hex(255);
console.log(FF.toString());
FF.valueOf() + 1 == 256;
let a = new Hex(10);
let b = new Hex(5);
console.log(a.plus(b).toString());
console.log(a.plus(b).toString()==='0xF');
