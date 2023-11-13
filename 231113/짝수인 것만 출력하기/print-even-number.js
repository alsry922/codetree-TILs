const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');
const length = Number.parseInt(input[0]);
const arr = input[1].split(' ').map(ele => Number.parseInt(ele));
const result = arr.filter(ele => ele % 2 === 0);
console.log(result.join(' '))