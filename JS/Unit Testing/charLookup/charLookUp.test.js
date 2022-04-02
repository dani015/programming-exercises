const charLookUp = require('./charLookUp');
const {expect, assert} = require('chai');

describe('charLookUp', () => {
   it('', () => {
      assert.isUndefined(charLookUp(1,1));
      assert.isUndefined(charLookUp('abc', 1.2));
      assert.isUndefined(charLookUp('abc', 'a'));
   })
   it('', () => {
      assert.equal(charLookUp('abv', -1), 'Incorrect index');
      assert.equal(charLookUp('abv', 4), 'Incorrect index');

   })
   it('', () => {
      assert.equal(charLookUp('abv', 0), 'a');
      assert.equal(charLookUp('abv', 2), 'v');

   })
})