const {expect} = require('chai');
const isSymmetric = require('./isSymmetric');

describe('isSymmetric', () => {
    //Take an array as argument
    //Return false for any input that isn’t of the correct type
    //Return true if the input array is symmetric
	//Otherwise, return false

    it('returns true for valid symmetric input', () => {
       expect(isSymmetric([1,1])).to.true;
    });

    it('returns false for valid non-symmetric input', () => {
        expect(isSymmetric([1,2])).to.be.false;
    });

    it('returns false for invalid argument', () => {
        expect(isSymmetric('a')).to.false;
    });

    it('returns false for type-coerced elements', () => {
        expect(isSymmetric('1', 1)).to.false;
    });

    //test overloading
    it('returns true for valid symmetric odd-element array', () => {
        expect(isSymmetric([1,1,1])).to.true;
    });

    it('returns true for valid symmetric string array', () => {
        expect(isSymmetric(['a','a'])).to.true;
    });

    it('returns false for valid non-symmetric string array', () => {
        expect(isSymmetric(['a', 'b'])).to.true;
    });
});