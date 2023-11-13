const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(' ').map(ele => Number.parseInt(ele));
const result = [...input];

while (result.length < 10) {
    const lastIdx = result.length-1;
    const beforeLasIdx = lastIdx - 1;
    const nextNum = (result[lastIdx] + result[beforeLasIdx]) % 10;
    result.push(nextNum);
}

const print = result.join(' ').replace('[', '').replace(']', '');

console.log(print);