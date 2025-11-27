const assert = require('assert');
const { multiply } = require('../src/math');

describe('Math', function() {
    describe('#multiply()', function() {
        it('should return 6 when multiplying 2 and 3', function() {
            assert.strictEqual(multiply(2, 3), 6);
        });
    });
});
