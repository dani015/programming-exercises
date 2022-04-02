const {expect} = require('chai');
const RGBtoHEX = require('./RGBtoHEX');

/*
Take three integer numbers, representing the red, green and blue values of an RGB color, each within range [0…255]
Return the same color in hexadecimal format as a string (e.g. '#FF9EAA')
Return undefined if any of the input parameters are of invalid type or not in the expected range
*/

describe('RGBtoHEX', () => {
    it('converts black to hex', () => {
       expect(RGBtoHEX(0,0,0)).to.equal('#000000');
    });

    it('converts white to hex', () => {
        expect(RGBtoHEX(255,255,255)).to.equal('#FFFFFF');
    });

    it('returns undefined for string params', () => {
        expect(RGBtoHEX('a','a','a')).to.be.undefined;
    });

    it('converts 151, 104, 172 to hex', () => {
        expect(RGBtoHEX(151,104,172)).to.equal('#9768AC');
    });
});