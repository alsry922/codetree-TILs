const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(' ');
const arr = input.map(ele => Number.parseInt(ele));
const result = [];

let zeroIdx = 0;
arr.forEach((ele, index) => {
    if (!(ele <= 0 || zeroIdx < index)) {
        result.push(ele);
        zeroIdx++;
    }
})
console.log(result.reverse().join(' '));