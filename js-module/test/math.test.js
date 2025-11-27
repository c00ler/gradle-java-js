const { multiply } = require('../src/math');

describe('Math', () => {
    describe('#multiply()', () => {
        test('should return 6 when multiplying 2 and 3', () => {
            expect(multiply(2, 3)).toBe(6);
        });
    });
});
