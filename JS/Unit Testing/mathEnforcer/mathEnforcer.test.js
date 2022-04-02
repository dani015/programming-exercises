const mathEnforcer = require('./mathEnforcer');
const {expect, assert, closeTo} = require('chai');

describe('mathEnforcer', function() {
    describe('addFive', function() {
        it('should return correct result with a non-number parameter', function() {
            assert.isUndefined(mathEnforcer.addFive('str'));
            assert.isUndefined(mathEnforcer.addFive(undefined));
            assert.equal(mathEnforcer.addFive(0), 5);
            assert.equal(mathEnforcer.addFive(-1), 4);
            assert.equal(mathEnforcer.addFive(0.02), 5.02);
            expect(mathEnforcer.addFive(0.02)).to.be.closeTo(5.03, 5.01)
        })
    });

    describe('subtractTen', function() {
        it('should return correct result with a non-number parameter', function() {
            assert.isUndefined(mathEnforcer.subtractTen('str'));
            assert.isUndefined(mathEnforcer.subtractTen(undefined));
            assert.equal(mathEnforcer.subtractTen(100), 90);
            assert.equal(mathEnforcer.subtractTen(-30), -40);
            assert.equal(mathEnforcer.subtractTen(-0.02), -10.02);
            expect(mathEnforcer.subtractTen(20.02)).to.be.closeTo(10.03, 10.01);
        })
    });

    describe('sum', function() {
        it('should return correct result with a non-number parameter', function() {
            assert.isUndefined(mathEnforcer.sum('str'));
            assert.isUndefined(mathEnforcer.sum('str', 'str2'));
            assert.isUndefined(mathEnforcer.sum(undefined));
            assert.isUndefined(mathEnforcer.sum(undefined, undefined));
            assert.equal(mathEnforcer.sum(2, 3), 5);
            assert.equal(mathEnforcer.sum(-2, 3), 1);
            assert.equal(mathEnforcer.sum(0.15, 1.05), 1.2);
            expect(mathEnforcer.subtractTen(20.2, 10)).to.be.closeTo(30.1, 30.3);
        })
    });
})