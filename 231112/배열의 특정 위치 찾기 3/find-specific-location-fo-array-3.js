const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split(' ').map(ele => Number.parseInt(ele));
const zeroIdx = arr.findIndex(ele => ele === 0);

const sum3 = arr.slice(0, zeroIdx+1).reduce((acc, curr) => {
    return acc + curr;
});

console.log(sum3);