const isOddOrEven = require('./isOddOrEven');
const {expect} = require('chai');

describe('isOddOrEven', () => {
   it('outcome is even', () => {
       expect(isOddOrEven('asdadd')).to.equal('even');
   })
    it('outcome is odd', () => {
        expect(isOddOrEven('asdad')).to.equal('odd');
    })
    it('outcome is undefined', () => {
        expect(isOddOrEven()).to.equal(undefined);
    })
});