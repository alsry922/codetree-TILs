const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(' ');
const arr = input.map((ele) => Number.parseInt(ele));

let zeroValIdx = 0;
const numsBeforeZero = arr.filter((ele, index) => {
    if (ele === 0 || zeroValIdx < index) {
        return false;
    }
    zeroValIdx++;
    return true;
});

const evenNums = numsBeforeZero.filter((ele, index) => {
    return ele % 2 === 0;
});

const sum = evenNums.reduce((acc,curr) => acc+curr);
console.log(evenNums.length, sum);