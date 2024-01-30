const fs = require('fs');
const inputs = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const [N, K] = inputs[0].split(' ').map(ele => Number.parseInt(ele));
const arr = inputs[1].split(' ').map(ele => Number.parseInt(ele));
const sortedArr = arr.sort((a, b) => a - b);
console.log(sortedArr[K-1]);