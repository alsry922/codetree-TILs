const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');
const arr = input[1].split(' ').map((ele) => Number.parseInt(ele));

const evenNumbers = arr.filter((ele) => {
    return ele % 2 === 0;
});

console.log([...evenNumbers].reverse().join(' ').replace('[', '').replace(']', ''));